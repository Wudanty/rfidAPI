package com.example.rfid.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer accessId;
    private String uid;
    private Boolean hasAccessRoom1;
    private Boolean hasAccessRoom2;
    private Boolean hasAccessRoom3;
}
