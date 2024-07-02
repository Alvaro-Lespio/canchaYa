package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Field {
    //Attributes
    @Id
    private Long id;
    private int maxPlayers;
    private boolean available;
    private double price;

    //Constructors

    public Field(Long id, int maxPlayers, boolean available, double price) {
        this.id = id;
        this.maxPlayers = maxPlayers;
        this.available = available;
        this.price = price;
    }

    public Field() {
    }
    //Getter and setter

    public Long getId() {
        return id;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //equals and HashCode

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Field field = (Field) object;
        return Objects.equals(id, field.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
