package com.intisa.intisia.config;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.ws.ServiceMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import com.intisa.intisia.model.User;
import com.intisa.intisia.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService
{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsernameIgnoreCase(username);
		if (user == null)
		{
			throw new UsernameNotFoundException(username);
		}

		List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
			.map(authority -> new SimpleGrantedAuthority(authority.getName())).collect(Collectors.toList());

		return new MyUserPrincipal(user.getUsername(), user.getPassword(), grantedAuthorities);
	}
}
