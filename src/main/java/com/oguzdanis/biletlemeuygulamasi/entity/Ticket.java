package com.oguzdanis.biletlemeuygulamasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
@EqualsAndHashCode
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int fiyat;

    private int koltukNo;

    @Column(name = "ticket_status")
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    //@ManyToOne(optional = true,fetch = FetchType.LAZY)
    //@JoinColumn(name="flight_id")
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "flight_id",nullable=false)
    private Flight flight;

    public Ticket() {
    }

    public Ticket(int fiyat, int koltukNo, TicketStatus ticketStatus, Flight flight) {
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

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", fiyat=" + fiyat +
                ", koltukNo=" + koltukNo +
                ", ticketStatus=" + ticketStatus +
                ", flight=" + flight +
                '}';
    }
}
