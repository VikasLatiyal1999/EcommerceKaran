package com.example.EcommerceKaran.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String product_name;

    private Float price;

    private String description;

    private String status;

    private String created_by;

    private Timestamp created_at;

    private Timestamp modified_at;

    private String modified_by;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Product(Long id, String product_name, Float price, String description,String status, String created_by, Timestamp created_at, Timestamp modified_at, String modified_by) {
        this.id = id;
        this.product_name = product_name;
        this.price = price;
        this.description = description;
        this.status = status;
        this.created_by = created_by;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.modified_by = modified_by;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                ", modified_by='" + modified_by + '\'' +
                '}';
    }
}
