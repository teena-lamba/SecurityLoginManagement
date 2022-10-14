package com.security.repository;

import java.util.Optional; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.security.model.User; 

@Repository 
public interface UserRepository extends JpaRepository<User, String> { 
	Optional<User> findUserByUsername(String username); 
}