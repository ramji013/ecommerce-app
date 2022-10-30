package com.iiht.ecommerce.authenticationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iiht.ecommerce.authenticationservice.entity.UserInfo;

import java.util.Arrays;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AuthDataService authDataService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = authDataService.findByUsername(username);
        System.out.println("Username = " + userInfo.getUsername() + ", Password = " + userInfo.getPassword());
        return new User(userInfo.getUsername(), userInfo.getPassword(), Arrays.asList());
    }
}
