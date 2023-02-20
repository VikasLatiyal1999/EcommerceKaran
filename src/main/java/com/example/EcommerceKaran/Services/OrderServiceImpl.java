package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Dao.OrderTableDao;
import com.example.EcommerceKaran.Entities.OrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderTableDao orderTableDao;

    @Override
    public List<OrderTable> showOrders() {
        List<OrderTable> list=orderTableDao.findAll();
        return list;

    }
}
