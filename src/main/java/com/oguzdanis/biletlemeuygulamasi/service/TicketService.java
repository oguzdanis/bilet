package com.oguzdanis.biletlemeuygulamasi.service;

import com.oguzdanis.biletlemeuygulamasi.dto.TicketDto;

public interface TicketService {

    TicketDto save(TicketDto ticket);

    TicketDto getById(Long id);

}
