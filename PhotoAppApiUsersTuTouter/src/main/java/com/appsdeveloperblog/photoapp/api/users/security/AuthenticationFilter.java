package com.appsdeveloperblog.photoapp.api.users.security;

import com.appsdeveloperblog.photoapp.api.users.ui.model.LoginRequestModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.ArrayList;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            LoginRequestModel creds = new ObjectMapper().readValue(request.getInputStream(),LoginRequestModel.class);
            return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(creds.getEmail(),creds.getPassword(),new ArrayList<>() ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
