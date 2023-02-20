package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Entities.Product;

import java.util.List;

public interface ProductService {
    public String addProduct(Product product);
    public  String removeProduct(Long id);
    public List<Product> showProduct();
    public String updateProduct(Product product);
}
