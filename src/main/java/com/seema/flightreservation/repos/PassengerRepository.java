package com.seema.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seema.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
