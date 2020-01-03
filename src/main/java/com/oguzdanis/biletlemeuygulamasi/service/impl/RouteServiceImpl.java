package com.oguzdanis.biletlemeuygulamasi.service.impl;

import com.oguzdanis.biletlemeuygulamasi.dto.RouteDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Route;
import com.oguzdanis.biletlemeuygulamasi.repository.RouteRepository;
import com.oguzdanis.biletlemeuygulamasi.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;

    public RouteServiceImpl(RouteRepository routeRepository, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RouteDto save(RouteDto route) {
        Route r = modelMapper.map(route, Route.class);
        route.setId(route.getId());
        r = routeRepository.save(r);
        return route;
    }

    @Override
    public RouteDto getById(Long id) {
        Route route = routeRepository.getOne(id);
        return modelMapper.map(route,RouteDto.class);
    }
}
