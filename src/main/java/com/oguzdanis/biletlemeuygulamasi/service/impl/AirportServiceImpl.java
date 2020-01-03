package com.oguzdanis.biletlemeuygulamasi.service.impl;

import com.oguzdanis.biletlemeuygulamasi.dto.AirportDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Airport;
import com.oguzdanis.biletlemeuygulamasi.repository.AirportRepository;
import com.oguzdanis.biletlemeuygulamasi.service.AirportService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;
    private final ModelMapper modelMapper;

    public AirportServiceImpl(AirportRepository airportRepository, ModelMapper modelMapper) {
        this.airportRepository = airportRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public AirportDto save(AirportDto airport) {
        Airport a = modelMapper.map(airport,Airport.class);
        airport.setId(a.getId());
        a = airportRepository.save(a);
        return airport;
    }

    @Override
    public AirportDto getById(Long id) {
        Airport airport = airportRepository.getOne(id);
        return modelMapper.map(airport,AirportDto.class);
    }
}
