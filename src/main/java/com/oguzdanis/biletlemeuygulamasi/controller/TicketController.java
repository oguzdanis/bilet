package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.TicketDto;
import com.oguzdanis.biletlemeuygulamasi.entity.Ticket;
import com.oguzdanis.biletlemeuygulamasi.service.impl.TicketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    private final TicketServiceImpl ticketServiceImpl;

    public TicketController(TicketServiceImpl ticketServiceImpl) {
        this.ticketServiceImpl = ticketServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketDto> getById(@PathVariable(value = "id",required = true) Long id){
        TicketDto ticketDto = ticketServiceImpl.getById(id);
        return ResponseEntity.ok(ticketDto);
    }

    @PostMapping
    public ResponseEntity<TicketDto> createTicket(@Valid @RequestBody TicketDto ticket){
        return ResponseEntity.ok(ticketServiceImpl.save(ticket));
    }
}
