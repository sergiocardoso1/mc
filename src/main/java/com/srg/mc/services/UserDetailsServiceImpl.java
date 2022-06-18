package com.srg.mc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.srg.mc.domain.Cliente;
import com.srg.mc.repositories.ClienteRepository;
import com.srg.mc.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Cliente cli = repository.findByEmail(email);
		if(cli == null) {
			throw new UsernameNotFoundException(email);
		}
		
		return new UserSS(cli.getId(),cli.getEmail(),cli.getSenha(),cli.getPerfis());
	}

}
