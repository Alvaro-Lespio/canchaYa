package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Reservation {
    //Attributes
    @Id
    private Long id;
    private Date date;
    //relation with field and user
    
    //Constructor
    public Reservation() {
    }

    public Reservation(Long id, Date date) {
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
        Reservation that = (Reservation) object;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
