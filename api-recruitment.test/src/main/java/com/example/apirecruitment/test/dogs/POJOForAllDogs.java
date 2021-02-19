package com.example.apirecruitment.test.dogs;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class POJOForAllDogs {

    private String status;

    Map<String, List<String>> message = new LinkedHashMap<>();

    public POJOForAllDogs() {
    }

    public POJOForAllDogs(String status, Map<String, List<String>> message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, List<String>> getMessage() {
        return message;
    }

    @JsonAnySetter
    void setMessage(String key, List<String> value) {
        message.put(key, value);
    }
}