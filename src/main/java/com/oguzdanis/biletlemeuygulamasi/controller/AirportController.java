package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.AirportDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Airport;
import com.oguzdanis.biletlemeuygulamasi.service.impl.AirportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/airport")
public class AirportController {

    private final AirportServiceImpl airportServiceImpl;

    public AirportController(AirportServiceImpl airportServiceImpl) {
        this.airportServiceImpl = airportServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirportDto> getById(@PathVariable(value = "id",required = true) Long id){
        AirportDto airportDto = airportServiceImpl.getById(id);
        return ResponseEntity.ok(airportDto);
    }

    @PostMapping
    public ResponseEntity<AirportDto> createAirport(@Valid @RequestBody AirportDto airport){
        return ResponseEntity.ok(airportServiceImpl.save(airport));
    }

}
