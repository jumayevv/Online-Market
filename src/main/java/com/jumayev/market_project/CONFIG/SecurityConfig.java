package com.jumayev.market_project.CONFIG;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    private final PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable).
                        authorizeHttpRequests(auth->auth.
                        requestMatchers("/home/**").hasRole("admin").
                        requestMatchers(HttpMethod.GET,"/home/**").hasRole("user").
                        anyRequest().
                                authenticated()).httpBasic(Customizer.withDefaults()).build();

    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin_user = User.builder().
                username("boburjon").
                password(passwordEncoder.encode("pword1")).
                roles("admin").
                build();
        UserDetails normal_user = User.builder().
                username("tony").
                password(passwordEncoder.encode("pword2")).
                roles("user").
                build();
        return new InMemoryUserDetailsManager(admin_user,normal_user);
    }
}
