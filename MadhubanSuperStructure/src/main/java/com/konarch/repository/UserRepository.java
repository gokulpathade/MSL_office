package com.konarch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konarch.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
