package com.oguzdanis.biletlemeuygulamasi.dto;

import com.oguzdanis.biletlemeuygulamasi.entity.Airport;

public class AirlineCompanyDto {
    private Long id;
    private String name;
    private Airport airport;

    public AirlineCompanyDto() {
    }

    public AirlineCompanyDto(Long id, String name, Airport airport) {
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


}
