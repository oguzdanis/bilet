package com.oguzdanis.biletlemeuygulamasi.service;

import com.oguzdanis.biletlemeuygulamasi.dto.AirlineCompanyDto;
import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;

public interface AirlineCompanyService {

    AirlineCompanyDto save(AirlineCompanyDto airlineCompany);

    AirlineCompanyDto getById(Long id);

}
