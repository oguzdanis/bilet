package com.oguzdanis.biletlemeuygulamasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "route")
@EqualsAndHashCode
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airport_from_id",referencedColumnName = "id")
    private Airport from;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airport_to_id",referencedColumnName = "id")
    private Airport to;

    @JsonIgnore
    @OneToOne(mappedBy = "route")
    private Flight flight;

    public Route() {
    }

    public Route(Airport from, Airport to, Flight flight) {
        this.from = from;
        this.to = to;
        this.flight = flight;
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", flight=" + flight +
                '}';
    }
}
