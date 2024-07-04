package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Invoice {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private double amount;

    //relation with booking
    @OneToOne
    @JoinColumn(name = "reserva_id")
    private Booking booking;

    //Constructors

    public Invoice() {
    }

    public Invoice(LocalDateTime date, double amount, Booking booking) {
        this.date = date;
        this.amount = amount;
        this.booking = booking;
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Invoice invoice = (Invoice) object;
        return Objects.equals(id, invoice.id) && Objects.equals(booking, invoice.booking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, booking);
    }
}
