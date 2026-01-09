package com.example.petshop;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
        this.birthDate= new Date();
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate= birthDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String speak();


    }










