package com.oguzdanis.biletlemeuygulamasi.dto;

import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;
import com.oguzdanis.biletlemeuygulamasi.entity.Route;
import com.oguzdanis.biletlemeuygulamasi.entity.Ticket;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class FlightDto {

    private Long id;
    private int kontenjan;
    private Date date;
    private Route route;
    private AirlineCompany airlineCompany;
    //private List<Ticket> ticket;

    public FlightDto() {
    }

    public FlightDto(Long id, int kontenjan, Date date, Route route, AirlineCompany airlineCompany, List<Ticket> ticket) {
        this.id = id;
        this.kontenjan = kontenjan;
        this.date = date;
        this.route = route;
        this.airlineCompany = airlineCompany;
        //this.ticket = ticket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public AirlineCompany getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(AirlineCompany airlineCompany) {
        this.airlineCompany = airlineCompany;
    }
/*
    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

 */
}
