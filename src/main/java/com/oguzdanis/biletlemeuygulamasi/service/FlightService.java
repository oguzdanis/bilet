package com.oguzdanis.biletlemeuygulamasi.service;

import com.oguzdanis.biletlemeuygulamasi.dto.FlightDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Flight;
import org.springframework.stereotype.Service;

public interface FlightService {

    FlightDto save(FlightDto flight);

    FlightDto getById(Long id);

}
