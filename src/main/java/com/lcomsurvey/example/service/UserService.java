package com.lcomsurvey.example.service;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.lcomsurvey.example.domain.User;

public interface UserService extends UserDetailsService{
	  public User readUser(String username);
    
	   public void createUser(User user);

	   public void createAuthorities(User user);
	   
	   Collection<GrantedAuthority> getAuthorities(String username);


}

