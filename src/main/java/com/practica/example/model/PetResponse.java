package com.practica.example.model;

public class PetResponse {

    private String transactionId;
    private String dateCreated;
    private boolean status;
    private String name;

    public PetResponse() {
    }

    public PetResponse(String transactionId, String dateCreated, boolean status, String name) {
        this.transactionId = transactionId;
        this.dateCreated = dateCreated;
        this.status = status;
        this.name = name;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
