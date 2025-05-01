package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
