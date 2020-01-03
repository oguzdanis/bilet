package com.oguzdanis.biletlemeuygulamasi.repository;

import com.oguzdanis.biletlemeuygulamasi.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
