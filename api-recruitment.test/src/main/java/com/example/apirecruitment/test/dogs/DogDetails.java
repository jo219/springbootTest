package com.example.apirecruitment.test.dogs;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "A class as the endpoint structure for GET a breed's details")
public class DogDetails {
    private String breed;
    private List<Dog> sub_breed;
    private List<String> images;

    public DogDetails() {
    }

    public DogDetails(String breed, List<Dog> sub_breed, List<String> images) {
        this.breed = breed;
        this.sub_breed = sub_breed;
        this.images = images;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<Dog> getSub_breed() {
        return sub_breed;
    }

    public void setSub_breed(List<Dog> sub_breed) {
        this.sub_breed = sub_breed;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
