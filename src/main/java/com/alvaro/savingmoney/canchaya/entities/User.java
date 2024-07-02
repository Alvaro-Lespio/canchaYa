package com.alvaro.savingmoney.canchaya.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String username;

}
