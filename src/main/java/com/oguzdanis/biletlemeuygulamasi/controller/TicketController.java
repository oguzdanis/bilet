package com.oguzdanis.biletlemeuygulamasi.controller;

import com.oguzdanis.biletlemeuygulamasi.dto.TicketDto;
import com.oguzdanis.biletlemeuygulamasi.service.impl.TicketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
