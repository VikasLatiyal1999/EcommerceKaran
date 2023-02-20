package com.example.EcommerceKaran.Dao;

import com.example.EcommerceKaran.Entities.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTableDao extends JpaRepository<OrderTable,Long> {
}
