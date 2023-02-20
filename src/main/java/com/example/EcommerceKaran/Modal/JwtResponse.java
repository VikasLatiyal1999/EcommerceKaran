package com.example.EcommerceKaran.Modal;

import javax.persistence.*;

@Entity
public class JwtResponse {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JwtResponse(String token) {
        this.token = token;
    }

    public JwtResponse() {
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "id=" + id +
                ", token='" + token + '\'' +
                '}';
    }
}
