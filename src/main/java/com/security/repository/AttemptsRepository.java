package com.security.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.security.model.Attempts; 

@Repository 
public interface AttemptsRepository extends JpaRepository<Attempts, Integer> { 
	Optional<Attempts> findAttemptsByUsername(String username); 
}