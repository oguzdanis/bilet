package com.oguzdanis.biletlemeuygulamasi.service.impl;

import com.oguzdanis.biletlemeuygulamasi.dto.FlightDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Flight;
import com.oguzdanis.biletlemeuygulamasi.repository.FlightRepository;
import com.oguzdanis.biletlemeuygulamasi.service.FlightService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final ModelMapper modelMapper;

    public FlightServiceImpl(FlightRepository flightRepository, ModelMapper modelMapper) {
        this.flightRepository = flightRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public FlightDto save(FlightDto flight) {
        Flight f = modelMapper.map(flight,Flight.class);
        flight.setId(flight.getId());
        f = flightRepository.save(f);
        return flight;
    }

    @Override
    public FlightDto getById(Long id) {
        Flight flight = flightRepository.getOne(id);
        return modelMapper.map(flight,FlightDto.class);
    }
}
