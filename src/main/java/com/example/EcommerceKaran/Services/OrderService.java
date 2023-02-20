package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Entities.OrderTable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    public List<OrderTable> showOrders();
}
