package com.example.demo;

import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomAuthenticationProvider implements AuthenticationProvider {
    List<User> Users = new ArrayList<>();

    public CustomAuthenticationProvider() {
        Users.add(new User("saptarshi", "sap@23", "ROLE_USER"));
        Users.add(new User("admin", "admin", "ROLE_ADMIN"));
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        //jdk 8 -- stream
        Optional<User> authenticatedUser = Users.stream().filter(
                user -> user.getName().equals(name) && user.getPassword().equals(password)
        ).findFirst();

        if(!authenticatedUser.isPresent()){
            throw new BadCredentialsException("Some Text");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(authenticatedUser.get().getRole()));
        Authentication auth = new UsernamePasswordAuthenticationToken(name, password, authorities);
        return auth;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}