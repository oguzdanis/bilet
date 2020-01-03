package com.oguzdanis.biletlemeuygulamasi.service;

import com.oguzdanis.biletlemeuygulamasi.dto.AirportDto;

public interface AirportService {

    AirportDto save(AirportDto airport);

    AirportDto getById(Long id);

}
