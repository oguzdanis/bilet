package com.oguzdanis.biletlemeuygulamasi.repository;

import com.oguzdanis.biletlemeuygulamasi.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
