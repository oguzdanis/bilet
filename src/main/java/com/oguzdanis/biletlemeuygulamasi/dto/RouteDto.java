package com.oguzdanis.biletlemeuygulamasi.dto;

import com.oguzdanis.biletlemeuygulamasi.entity.Airport;
import com.oguzdanis.biletlemeuygulamasi.entity.Flight;

public class RouteDto {

    private Long id;
    private Airport from;
    private Airport to;
    //private Flight flight;

    public RouteDto() {
    }

    public RouteDto(Long id, Airport from, Airport to, Flight flight) {
        this.id = id;
        this.from = from;
        this.to = to;
        //this.flight = flight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }
/*
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

 */
}
