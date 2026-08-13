package com.practica.example.model;

import java.math.BigDecimal;

public class Pet {

    private Long id;
    private String name;
    private String status;

    public Pet(){

    }

    public Pet(Long id, String name, String status){
        this.name = name;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
