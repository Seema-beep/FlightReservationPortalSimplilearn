package com.seema.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seema.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
