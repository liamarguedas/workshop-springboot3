package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
