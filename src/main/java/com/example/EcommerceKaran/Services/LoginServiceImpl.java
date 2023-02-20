package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Dao.UserTableDao;
import com.example.EcommerceKaran.Entities.UserTable;
import com.example.EcommerceKaran.Modal.JwtRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserTableDao userTableDao;

    @Override
    public String Login(JwtRequest jwtRequest) {


/*
        List<UserTable> list = userTableDao.findAll();
        for(jwtRequest n:list){
         if(jwtRequest.getUsername()==){
             return "Login successfull";
         }
         else{
             return "Username or password is incorrect";
         }
        }*/
        return null;
    }
}
