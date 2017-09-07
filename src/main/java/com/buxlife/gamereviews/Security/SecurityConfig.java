package com.buxlife.gamereviews.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Bux_Life on 2017/09/06.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder amb) throws Exception {
        amb.inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and().withUser("reviewer").password("password2").roles("REVIEWER")
                .and().withUser("administrator").password("passwordAdmin").roles("ADMIN");
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/gameReviews/**")
                .hasRole("USER").and().csrf().disable().headers().frameOptions().disable();
    }
}