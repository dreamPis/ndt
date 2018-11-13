package com.ndt.sms.config;

import com.ndt.sms.service.RedisAuthenticationCodeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @Author ser7en
 * @Date 2018-11-09 09:45
 * @version：
 * @Desc：
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public AuthorizationCodeServices authorizationCodeServices(){
        return new RedisAuthenticationCodeServices(redisConnectionFactory);
    }

    @Bean
    public TokenStore tokenStore(){
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @ConditionalOnMissingBean(name = "jwtTokenEnhancer")
    public TokenEnhancer jwtTokenEnhancer(){
        return new NdtJwtTokenEnhancer();
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("abcdef");
        return converter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated();
//        http.formLogin().loginPage("/login").failureUrl("/login?error").permitAll();
        http// 设置不需要鉴权的目录
                .authorizeRequests()
                // 允许访问
                .antMatchers("/oauth/**").permitAll()
                // 这里添加需要完整认证才能访问
                .antMatchers("/user/**").fullyAuthenticated()
                // 除了上述路径，其余均需要鉴权后才能访问
                .and().authorizeRequests().anyRequest().authenticated()
                // 设置登录页和默认的跳转路径
                .and().formLogin()
                // 开启基本鉴权
                .and().httpBasic()
                // 记住登陆
                .and().rememberMe();
    }
}
