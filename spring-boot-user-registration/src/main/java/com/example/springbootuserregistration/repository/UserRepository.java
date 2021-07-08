package com.example.springbootuserregistration.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootuserregistration.models.User;


public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByRegistrationIdContaining(String registrationId);
	List<User> findByInstitutionIdContaining(String institutionId);
	List<User> findByUserIdContaining(String userId);
	List<User> findByFirstNameContaining(String firstName);
	List<User> findByLastNameContaining(String lastName);
	List<User> findByDateOfBirthContaining(String dateOfBirth);
	List<User> findByNidContaining(String nid);
	List<User> findByContactNoContaining(String contactNo);
	List<User> findByEmailContaining(String email);
}
