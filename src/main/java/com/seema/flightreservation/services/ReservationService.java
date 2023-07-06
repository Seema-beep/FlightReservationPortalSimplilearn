package com.seema.flightreservation.services;

import com.seema.flightreservation.dto.ReservationRequest;
import com.seema.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);

}
