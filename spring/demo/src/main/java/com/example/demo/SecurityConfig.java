package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.oauth2Login()
                .successHandler(new AuthHandlar())
                .and()
                .authorizeRequests()
                .antMatchers("/posts")
                .authenticated()
                .antMatchers("/**")
                .permitAll()
                .and()
                .build();
    }

}
