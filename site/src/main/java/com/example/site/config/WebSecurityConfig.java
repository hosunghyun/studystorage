package com.example.site.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf((csrf)->csrf.disable());
        
        httpSecurity.authorizeHttpRequests((authorize)-> 
            authorize.requestMatchers("/**").permitAll());

        // 로그인을 FilterChain에서 관리한다. (니가 하는게 아님.)
        httpSecurity.formLogin((formLogin)->formLogin.loginPage("/member/login") // 로그인페이지 URL
                                .defaultSuccessUrl("/index?login") //성공했을때 가야하는 URL
                                .failureUrl("/member/login?error")  // 실패했을때. 만약이걸 안해놓으면 /login?error 로 이동
                                );
        
        httpSecurity.logout((logout)-> logout.logoutUrl("/member/logout")
                            .logoutSuccessUrl("/index?logout=true")); // 로그아웃이 성공하면 첫페이지로.

        return httpSecurity.build();
    }
}