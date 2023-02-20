package com.example.EcommerceKaran.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_table")
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long user_id;

    private String user_name;

    private String user_email;

    private String user_password;

    private String user_phone;

    private String user_address;

    private String created_by;

    private Timestamp created_at;

    private Timestamp modified_at;

    private String modified_by;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getModified_at() {
        return modified_at;
    }

    public void setModified_at(Timestamp modified_at) {
        this.modified_at = modified_at;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public UserTable(Long user_id, String user_name, String user_email, String user_password, String user_phone, String user_address, String created_by, Timestamp created_at, Timestamp modified_at, String modified_by) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_address = user_address;
        this.created_by = created_by;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.modified_by = modified_by;
    }

    public UserTable() {
    }

    @Override
    public String toString() {
        return "user_table{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_address='" + user_address + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                ", modified_by='" + modified_by + '\'' +
                '}';
    }
}
