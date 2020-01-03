package com.oguzdanis.biletlemeuygulamasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flight")
@EqualsAndHashCode
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int kontenjan;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id", referencedColumnName = "id")
    private Route route;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airlineCompany_id")
    private AirlineCompany airlineCompany;

    @JsonIgnore
    //@JoinColumn(name = "flight_id")
    //@OneToMany(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "flight")
    private List<Ticket> ticket;

    public Flight() {
    }

    public Flight(int kontenjan, Date date, Route route, AirlineCompany airlineCompany, List<Ticket> ticket) {
        this.kontenjan = kontenjan;
        this.date = date;
        this.route = route;
        this.airlineCompany = airlineCompany;
        this.ticket = ticket;
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

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", kontenjan=" + kontenjan +
                ", date=" + date +
                ", route=" + route +
                ", airlineCompany=" + airlineCompany +
                ", ticket=" + ticket +
                '}';
    }
}
