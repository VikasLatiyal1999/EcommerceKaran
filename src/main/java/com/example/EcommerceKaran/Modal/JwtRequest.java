package com.example.EcommerceKaran.Modal;

import javax.persistence.*;

@Entity
public class JwtRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String username;
    String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public JwtRequest() {
    }

    @Override
    public String toString() {
        return "JwtRequest{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
