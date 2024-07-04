package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class BookingField {
    //Attributes
    @Id
    private Long id;
    private LocalDateTime start;
    private LocalDateTime end;

    //Relation with Booking
    @OneToOne(mappedBy = "bookingfield")
    private Booking booking;

    //Constructor
    public BookingField() {

    }

    public BookingField(LocalDateTime start, LocalDateTime end, Booking booking) {
        this.start = start;
        this.end = end;
        this.booking = booking;
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
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
        BookingField that = (BookingField) object;
        return Objects.equals(id, that.id) && Objects.equals(start, that.start) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, start, end);
    }
}
