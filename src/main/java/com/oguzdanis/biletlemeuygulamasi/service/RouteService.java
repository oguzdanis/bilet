package com.oguzdanis.biletlemeuygulamasi.service;

import com.oguzdanis.biletlemeuygulamasi.dto.RouteDto;

public interface RouteService {

    RouteDto save(RouteDto route);

    RouteDto getById(Long id);
}
