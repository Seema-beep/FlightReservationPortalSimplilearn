package com.seema.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seema.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
   
	

}
