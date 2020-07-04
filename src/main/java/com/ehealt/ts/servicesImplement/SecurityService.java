package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.User;
import com.ehealt.ts.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SecurityService implements UserDetailsService {

    @Autowired
    private IUsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = usersRepository.findByName(s);

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), roles);
        //UserDetails userDetails = new User(user.getName(), user.getPassword(), roles);
    return  userDetails;
    }
}
