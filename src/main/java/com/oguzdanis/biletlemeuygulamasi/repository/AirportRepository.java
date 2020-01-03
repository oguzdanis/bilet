package com.oguzdanis.biletlemeuygulamasi.repository;

import com.oguzdanis.biletlemeuygulamasi.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
