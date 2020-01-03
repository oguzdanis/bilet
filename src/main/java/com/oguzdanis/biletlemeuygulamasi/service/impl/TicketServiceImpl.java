package com.oguzdanis.biletlemeuygulamasi.service.impl;

import com.oguzdanis.biletlemeuygulamasi.dto.TicketDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Ticket;
import com.oguzdanis.biletlemeuygulamasi.repository.TicketRepository;
import com.oguzdanis.biletlemeuygulamasi.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;

    public TicketServiceImpl(TicketRepository ticketRepository, ModelMapper modelMapper) {
        this.ticketRepository = ticketRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TicketDto getById(Long id) {
        Ticket ticket = ticketRepository.getOne(id);
        return modelMapper.map(ticket,TicketDto.class);
    }
}
