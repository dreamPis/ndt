package com.ndt.sms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

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

    @Qualifier("myUserDetailsService")
    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 覆盖WebSecurityConfigurerAdapter用户详情方法
     *
     * @param auth 用户签名管理器构造器
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http// 设置不需要鉴权的目录
                .authorizeRequests()
                // 允许访问
                .antMatchers("/", "/oauth/**").permitAll()
                // swagger
                .antMatchers("/swagger-ui.html", "/swagger-resources", "/swagger-resources/**", "/v2/api-docs",
                        "/webjars/**")
                .permitAll()
                // 允许静态资源
                .antMatchers("/assets/").permitAll()
                // 这里添加需要完整认证才能访问
                // .antMatchers("").fullyAuthenticated()
                // 除了上述路径，其余均需要鉴权后才能访问
                .and().authorizeRequests().anyRequest().authenticated()
                // 设置登录页和默认的跳转路径
                .and().formLogin()
                // 开启基本鉴权
                .and().httpBasic()
                // 记住登陆
                .and().rememberMe();
    }

    @Override
    public void configure(WebSecurity security) throws Exception {
        security.ignoring().antMatchers("/favor.ioc");
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
