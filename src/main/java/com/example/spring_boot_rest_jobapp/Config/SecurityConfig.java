package com.example.spring_boot_rest_jobapp.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public AuthenticationProvider authenticationProvider ()
    {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

          provider.setUserDetailsService(userDetailsService);
          // provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()) //use for when you give a password without encryted and matches the password which is saves in DataBase
          provider.setPasswordEncoder(new BCryptPasswordEncoder()); // use when you send the password which is encrypted and stores in database

        return provider;
    }

    @Bean
    public SecurityFilterChain SFC(HttpSecurity http) throws Exception {

        http.csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())

                .sessionManagement(ses -> ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
              ;

        return http.build();


    }














//    @Bean
//    public UserDetailsService usd()
//    {
//        UserDetails admin = User.withDefaultPasswordEncoder().username("Radha").password("1212").roles("ADMIN").build();
//        UserDetails user = User.withDefaultPasswordEncoder().username("Nonu").password("1212").roles("USER").build();
//
//
//        return new InMemoryUserDetailsManager(admin,user);
//    }
}
