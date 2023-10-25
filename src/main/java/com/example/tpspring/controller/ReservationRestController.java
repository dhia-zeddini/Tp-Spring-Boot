package com.example.tpspring.controller;

import com.example.tpspring.entity.Reservation;
import com.example.tpspring.service.IReservationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion reservation")

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")

public class ReservationRestController {

    IReservationService reservationService;

    @Operation(description = "recuperer tous les reservation")
    @GetMapping("/retrive-all-reservations")
    public List<Reservation> getReservations(){
        List<Reservation> listReservations = reservationService.retrieveAllReservation();
        return listReservations;
    }
    @GetMapping("/get-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String reservationId) {
        Reservation reservation = reservationService.retrieveReservation(reservationId);
        return reservation;
    }
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.addReservation(c);
        return reservation;
    }
    // http://localhost:8089/tpreservation/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String reservationId) {
        reservationService.removeReservation(reservationId);
    }
    // http://localhost:8089/tpreservation/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.modifyReservation(c);
        return reservation;
    }
}
