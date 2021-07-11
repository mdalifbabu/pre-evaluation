package com.example.springbootuserregistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootuserregistration.models.User;

public interface ManualRepository extends JpaRepository<User, Long>{
	
}
