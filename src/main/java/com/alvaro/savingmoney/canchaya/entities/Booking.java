package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {
    //Attributes
    @Id
    private Long id;
    private Date date;

    //relation with user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //relation with booking field
    @OneToOne
    @JoinColumn(name = "bookingfield_id")

    //relation with invoice
    private BookingField bookingField;
    //Constructor
    public Booking() {
        this.date = new Date();

    }

    public Booking(Long id, Date date) {
        this.id = id;
        this.date = date;
    }

    //Getter and Setter

    public Date getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }
    //Equals and Hashcode


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Booking that = (Booking) object;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
