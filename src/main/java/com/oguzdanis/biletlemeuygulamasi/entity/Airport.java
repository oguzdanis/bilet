package com.oguzdanis.biletlemeuygulamasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airport")
@EqualsAndHashCode
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String city;

    //@JoinColumn(name = "airport_id")
    //@OneToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    @OneToMany(mappedBy = "airport")
    private List<AirlineCompany> airlineCompany;

    @OneToOne(mappedBy = "from")
    private Route from;

    @OneToOne(mappedBy = "to")
    private Route to;

    public Airport() {
    }

    public Airport(Long id,String name, String city, List<AirlineCompany> airlineCompany) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.airlineCompany = airlineCompany;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<AirlineCompany> getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(List<AirlineCompany> airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", airlineCompany=" + airlineCompany +
                '}';
    }
}
