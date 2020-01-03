package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.FlightDto;
import com.oguzdanis.biletlemeuygulamasi.service.impl.FlightServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/flight")
public class FlightController {

    private final FlightServiceImpl flightServiceImpl;

    public FlightController(FlightServiceImpl flightServiceImpl) {
        this.flightServiceImpl = flightServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightDto> getById(@PathVariable(value = "id",required = true) Long id){
        FlightDto flightDto = flightServiceImpl.getById(id);
        return ResponseEntity.ok(flightDto);
    }

    @PostMapping
    public ResponseEntity<FlightDto> save(@Valid @RequestBody FlightDto flight){
        return ResponseEntity.ok(flightServiceImpl.save(flight));
    }

}
