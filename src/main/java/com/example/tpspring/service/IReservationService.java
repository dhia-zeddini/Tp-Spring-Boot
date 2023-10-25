package com.example.tpspring.service;

import com.example.tpspring.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
