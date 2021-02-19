package com.example.apirecruitment.test.dogs;

import java.util.List;

public class POJODogDetails {
    private List<String> message;
    private String status;

    public POJODogDetails() {
    }

    public POJODogDetails(List<String> message, String status) {
        this.message = message;
        this.status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
