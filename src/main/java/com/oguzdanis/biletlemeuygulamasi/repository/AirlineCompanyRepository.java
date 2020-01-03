package com.oguzdanis.biletlemeuygulamasi.repository;

import com.oguzdanis.biletlemeuygulamasi.entity.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany, Long> {


}
