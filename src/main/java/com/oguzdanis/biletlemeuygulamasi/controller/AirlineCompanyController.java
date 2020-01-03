package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.AirlineCompanyDto;
import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;
import com.oguzdanis.biletlemeuygulamasi.service.impl.AirlineCompanyServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/airlinecompany")
public class AirlineCompanyController {

    private final AirlineCompanyServiceImpl airlineCompanyServiceImpl;

    public AirlineCompanyController(AirlineCompanyServiceImpl airlineCompanyServiceImpl) {
        this.airlineCompanyServiceImpl = airlineCompanyServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirlineCompanyDto> getById(@PathVariable(value = "id",required = true) Long id){
        AirlineCompanyDto airlineCompanyDto = airlineCompanyServiceImpl.getById(id);
        return ResponseEntity.ok(airlineCompanyDto);
    }

    @PostMapping
    public ResponseEntity<AirlineCompanyDto> createAirlineCompany(@Valid @RequestBody AirlineCompanyDto airlineCompany){
        return ResponseEntity.ok(airlineCompanyServiceImpl.save(airlineCompany));
    }

}
