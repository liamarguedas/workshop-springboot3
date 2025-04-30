package com.sode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sode.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}