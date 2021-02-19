package com.example.apirecruitment.test.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogsController {

    private final DogsService dogsService;

    @Autowired
    public DogsController(DogsService dogsService) {
        this.dogsService = dogsService;
    }

    @GetMapping("/dogs")
    public List<Dog> getDogs() {
        return dogsService.getDogs();
    }

    @GetMapping("/dogs/{specific_breed}")
    public DogDetails getDogDetails(@PathVariable("specific_breed") String specificBreed) {
        return dogsService.getDogDetails(specificBreed);
    }
}
