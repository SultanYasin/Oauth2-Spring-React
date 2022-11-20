package com.example.demo;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class AuthHandlar extends SimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    public AuthHandlar(){
        super();
        setUseReferer(false); // do not redirect user to same page when request occurs
    }
}
