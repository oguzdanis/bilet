package com.oguzdanis.biletlemeuygulamasi.dto;

import com.oguzdanis.biletlemeuygulamasi.entity.Flight;
import com.oguzdanis.biletlemeuygulamasi.entity.TicketStatus;

public class TicketDto {

    private Long id;
    private int fiyat;
    private int koltukNo;
    private TicketStatus ticketStatus;
    private Flight flight;

    public TicketDto() {
    }

    public TicketDto(Long id, int fiyat, int koltukNo, TicketStatus ticketStatus, Flight flight) {
        this.id = id;
        this.fiyat = fiyat;
        this.koltukNo = koltukNo;
        this.ticketStatus = ticketStatus;
        this.flight = flight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
