package com.example.EcommerceKaran.Dao;

import com.example.EcommerceKaran.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Long> {
}
