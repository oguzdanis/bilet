package com.oguzdanis.biletlemeuygulamasi.dto;

import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;
import com.oguzdanis.biletlemeuygulamasi.entity.Route;

import java.util.List;

public class AirportDto {
    private Long id;
    private String name;
    private String city;
    //private List<AirlineCompany> airlineCompany;
    //private Route route;

    public AirportDto() {
    }

    public AirportDto(Long id, String name, String city, List<AirlineCompany> airlineCompany, Route route) {
        this.id = id;
        this.name = name;
        this.city = city;
        //this.airlineCompany = airlineCompany;
        //this.route = route;
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
/*
    public List<AirlineCompany> getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(List<AirlineCompany> airlineCompany) {
        this.airlineCompany = airlineCompany;
    }
/*
    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

 */
}
