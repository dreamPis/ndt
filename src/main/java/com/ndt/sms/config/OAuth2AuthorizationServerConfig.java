package com.ndt.sms.config;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.sql.DataSource;
import java.util.List;

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
    private AuthenticationManager authenticationManager;
    @Autowired
    private AuthorizationCodeServices authorizationCodeServices;
    @Autowired
    private TokenStore tokenStore;
    @Autowired
    private JwtAccessTokenConverter jwtAccessTokenConverter;
    @Autowired(required = false)
    private TokenEnhancer jwtTokenEnhancer;
    @Qualifier("myUserDetailsService")
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore)
                .accessTokenConverter(jwtAccessTokenConverter)
                .authenticationManager(authenticationManager)
                .authorizationCodeServices(authorizationCodeServices)
                .userDetailsService(userDetailsService);
        //扩展token返回结果
        if (jwtAccessTokenConverter != null && jwtTokenEnhancer != null) {
            TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
            List<TokenEnhancer> enhancerList = Lists.newArrayList();
            enhancerList.add(jwtTokenEnhancer);
            enhancerList.add(jwtAccessTokenConverter);
            tokenEnhancerChain.setTokenEnhancers(enhancerList);
            //jwt
            endpoints.tokenEnhancer(tokenEnhancerChain)
                    .accessTokenConverter(jwtAccessTokenConverter);
        }
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("ndt")
                .secret(passwordEncoder.encode("ndt"))
                .resourceIds("api")
                .accessTokenValiditySeconds(7200)
                .refreshTokenValiditySeconds(60 * 60 * 24)
                .authorizedGrantTypes("refresh_token", "password", "authorization_code")
                .redirectUris("http://www.ndtcd.cn/")
                .scopes("read");
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients();
    }
}
