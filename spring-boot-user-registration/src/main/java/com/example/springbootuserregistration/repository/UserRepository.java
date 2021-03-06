package com.example.springbootuserregistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootuserregistration.models.User;


public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByUserIdContaining(String userId);
	List<User> findByFirstNameContaining(String firstName);
}

