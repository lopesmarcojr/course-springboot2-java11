package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;
import com.example.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
