package com.godzila.flight.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
          .withUser("satya").password("password");
    }
 
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .antMatchers("/api*").permitAll();
    }
}
