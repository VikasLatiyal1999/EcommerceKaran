package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Entities.UserTable;
import com.example.EcommerceKaran.Modal.JwtRequest;
import org.springframework.stereotype.Service;


public interface LoginService {
     public String Login(JwtRequest jwtRequest);
}
