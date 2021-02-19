package com.example.apirecruitment.test.dogs;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "A class to define structure for every breed data, also used at DogDetails class")
public class Dog {
    private String breed;
    private List<Dog> sub_breed;

    public Dog() {
    }

    public Dog(String breed, List<Dog> sub_breed) {
        this.breed = breed;
        this.sub_breed = sub_breed;
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

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", sub_breed=" + sub_breed +
                '}';
    }
}
