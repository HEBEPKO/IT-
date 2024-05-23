package org.example.repository;

import org.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJPARepository extends
        JpaRepository<Order,Integer>{
    Order getOrderByOrder(Integer idOrder);
}