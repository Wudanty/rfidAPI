package com.example.rfid.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
public class User {

    private String imie;
    private String nazwisko;
}
