package com.example.EcommerceKaran.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order_table")
public class OrderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long order_id;

    private Long product_id;

    private String product_name;

    private Long number_of_products;

    private Timestamp date_of_order;

    private String customer_name;

    private String customer_number;

    private String customer_address;

    private String created_by;

    private Timestamp created_at;

    private Timestamp modified_at;

    private String modified_by;

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getNumber_of_products() {
        return number_of_products;
    }

    public void setNumber_of_products(Long number_of_products) {
        this.number_of_products = number_of_products;
    }

    public Timestamp getDate_of_order() {
        return date_of_order;
    }

    public void setDate_of_order(Timestamp date_of_order) {
        this.date_of_order = date_of_order;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
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

    public OrderTable(Long order_id, Long product_id, String product_name, Long number_of_products, Timestamp date_of_order, String customer_name, String customer_number, String customer_address, String created_by, Timestamp created_at, Timestamp modified_at, String modified_by) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.number_of_products = number_of_products;
        this.date_of_order = date_of_order;
        this.customer_name = customer_name;
        this.customer_number = customer_number;
        this.customer_address = customer_address;
        this.created_by = created_by;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.modified_by = modified_by;
    }

    public OrderTable() {
    }

    @Override
    public String toString() {
        return "order_table{" +
                "order_id=" + order_id +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", number_of_products=" + number_of_products +
                ", date_of_order=" + date_of_order +
                ", customer_name='" + customer_name + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", customer_address='" + customer_address + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                ", modified_by='" + modified_by + '\'' +
                '}';
    }
}
