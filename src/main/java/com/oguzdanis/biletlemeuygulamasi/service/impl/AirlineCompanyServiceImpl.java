package com.oguzdanis.biletlemeuygulamasi.service.impl;

import com.oguzdanis.biletlemeuygulamasi.dto.AirlineCompanyDto;
import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;
import com.oguzdanis.biletlemeuygulamasi.repository.AirlineCompanyRepository;
import com.oguzdanis.biletlemeuygulamasi.service.AirlineCompanyService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineCompanyServiceImpl implements AirlineCompanyService {

    private final AirlineCompanyRepository airlineCompanyRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AirlineCompanyServiceImpl(AirlineCompanyRepository airlineCompanyRepository, ModelMapper modelMapper) {
        this.airlineCompanyRepository = airlineCompanyRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public AirlineCompanyDto save(AirlineCompanyDto airlineCompany) {

        AirlineCompany a = modelMapper.map(airlineCompany,AirlineCompany.class);
        airlineCompany.setId(a.getId());
        a = airlineCompanyRepository.save(a);

        return airlineCompany;
    }

    @Override
    public AirlineCompanyDto getById(Long id) {
        AirlineCompany airlineCompany = airlineCompanyRepository.getOne(id);
        return modelMapper.map(airlineCompany, AirlineCompanyDto.class);
    }
}
