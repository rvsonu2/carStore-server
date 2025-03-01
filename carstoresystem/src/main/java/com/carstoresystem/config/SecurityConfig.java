//package com.carstoresystem.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfiguration {
//
//
//    private UserDetailsService userService;
//
//	public SecurityConfig(UserDetailsService userService) {
//        this.userService = userService;
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService);
//    }
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(requests -> requests
//                .requestMatchers("/h2-console/**").permitAll()
//                .requestMatchers(HttpMethod.POST, "/users").permitAll()
//                .anyRequest().authenticated())
//                .httpBasic(withDefaults())
//                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .csrf(csrf -> csrf.disable())
//                .headers(headers -> headers.frameOptions(options -> options.disable()));
//    }
//}
