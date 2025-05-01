package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}