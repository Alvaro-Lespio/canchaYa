package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {
    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "the user can't be null also the user must contains between 4 and 20 characters")
    @Size(min = 4, max = 20)
    private String username;

    @NotEmpty(message = "the password can't be null")
    private String password;

    @NotEmpty(message = "the email can't be null")
    @Email(message = "must contains the symbol @")
    private String email;

    @NotNull(message = "the phone can't be null")
    private int phone;

    //relation with booking
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Booking> bookings;

    //Constructor
    public User(){
        this.username = "";
        this.password = "";
        this.email = "";
        this.phone = 0;
        this.bookings = new HashSet<>();
    }

    public User(String username, String password, String email, int phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
    //Getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    //Equals and Hashcode

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }

}
