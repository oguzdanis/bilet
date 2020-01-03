package com.oguzdanis.biletlemeuygulamasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "airline_company")
@EqualsAndHashCode
public class AirlineCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //@JoinColumn(name = "airport_id")
    //@ManyToOne(optional = true,fetch = FetchType.LAZY)
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "airport_id",nullable = false)
    private Airport airport;

    public AirlineCompany() {
    }

    public AirlineCompany(Long id,String name, Airport airport) {
        this.id = id;
        this.name = name;
        this.airport = airport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @Override
    public String toString() {
        return "AirlineCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", airport=" + airport +
                '}';
    }
}
