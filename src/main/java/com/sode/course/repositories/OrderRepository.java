package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
