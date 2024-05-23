package org.example.service.impl;


import org.example.entity.Orders;
import org.example.repository.OrdersJPARepository;
import org.example.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersJPARepository ordersJPARepository;

    @Override
    public List<Orders> getOrdersList() {
        return ordersJPARepository.findAll();
    }
}
