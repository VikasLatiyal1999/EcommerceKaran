package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Dao.JwtRequestDao;
import com.example.EcommerceKaran.Dao.UserTableDao;
import com.example.EcommerceKaran.Entities.UserTable;
import com.example.EcommerceKaran.Modal.JwtRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private JwtRequestDao jwtRequestDao;

    @Autowired
    private UserTableDao userTableDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<JwtRequest> list=jwtRequestDao.findAll();
        for(JwtRequest n:list){
        if(username.equals(n.getUsername()))
        {
            String user=n.getUsername();
            String pass=n.getPassword();
            return new User(user,pass,new ArrayList<>());
        }
        }
        throw new UsernameNotFoundException("User not found!!");
    }
}
