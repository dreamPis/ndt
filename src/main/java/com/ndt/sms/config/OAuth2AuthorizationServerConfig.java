package com.ndt.sms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;

/**
 * @Author ser7en
 * @Date 2018-11-09 09:20
 * @version：
 * @Desc：
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;
    @Autowired
    private RedisConnectionFactory connectionFactory;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JdbcClientDetailsService clientDetailsService;

    @Autowired
    private RedisTokenStore redisTokenStore;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(redisTokenStore);
        endpoints.setClientDetailsService(clientDetailsService);
        endpoints.authenticationManager(authenticationManager);
        endpoints.tokenServices(defaultTokenServices());
        endpoints.authorizationCodeServices(new JdbcAuthorizationCodeServices(dataSource));
        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        clients.withClientDetails(clientDetailsService);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()");
        security.checkTokenAccess("isAuthenticated()");
        security.allowFormAuthenticationForClients();
    }

    private DefaultTokenServices defaultTokenServices() {
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setTokenStore(redisTokenStore);
        tokenServices.setClientDetailsService(clientDetailsService);
        tokenServices.setAccessTokenValiditySeconds(60 * 60 * 12); // token有效期自定义设置，默认12小时
        tokenServices.setRefreshTokenValiditySeconds(60 * 60 * 24 * 7);// 默认30天，这里修改
        return tokenServices;
    }

    @Bean
    public JdbcClientDetailsService clientDetailsService() {
        JdbcClientDetailsService service = new JdbcClientDetailsService(dataSource);
        ClientDetails clientDetails = new BaseClientDetails();

        service.addClientDetails(clientDetails);
        return service;
    }

    @Bean
    public RedisTokenStore redisTokenStore() {
        return new RedisTokenStore(connectionFactory);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
