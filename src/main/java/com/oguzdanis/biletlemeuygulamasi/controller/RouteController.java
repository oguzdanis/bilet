package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.RouteDto;
import com.oguzdanis.biletlemeuygulamasi.service.impl.RouteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/route")
public class RouteController {

    private final RouteServiceImpl routeServiceImpl;

    public RouteController(RouteServiceImpl routeServiceImpl) {
        this.routeServiceImpl = routeServiceImpl;
    }

    @PostMapping
    public ResponseEntity<RouteDto> save(@Valid @RequestBody RouteDto route){
        return ResponseEntity.ok(routeServiceImpl.save(route));

    }

    @GetMapping("/{id}")
    public ResponseEntity<RouteDto> getById(@PathVariable(value = "id",required = true) Long id){
        RouteDto routeDto = routeServiceImpl.getById(id);
        return ResponseEntity.ok(routeDto);
    }

}
