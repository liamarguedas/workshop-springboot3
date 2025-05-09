package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.OrderItem;
import com.sode.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}