package com.practice.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.Entity.User;
import com.practice.dao.UserRepository;

public class UserDetailServiceImpl implements UserDetailsService{
	
@Autowired
private UserRepository userRepository;
	
	public UserDetailServiceImpl() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepository.getUserByUserName(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Could not found user !!");
		}
		CustomUserDetails customUserDetail=new CustomUserDetails(user);
		return customUserDetail;
	}

}
