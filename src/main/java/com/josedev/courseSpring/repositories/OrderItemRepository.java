package com.josedev.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josedev.courseSpring.entities.OrderItem;
import com.josedev.courseSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
