package com.example.apirecruitment.test.dogs;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogsService {

    RestTemplate restTemplate = new RestTemplate();

    public List<Dog> getDogs() {

        // get data from API as String
        final String url = "https://dog.ceo/api/breeds/list/all";

        // parse string as defined object
        POJOForAllDogs breeds = restTemplate.getForObject(url, POJOForAllDogs.class);

        // convert to desired return format
        List<Dog> finalListOfDogs = new ArrayList<Dog>();
        breeds.message.forEach((breed, sub_breeds) -> { // (String, List<String>) to (String, List<Dog>)
            Dog curBreed = new Dog(breed, new ArrayList<Dog>());

            List<Dog> curSub_breed = new ArrayList<Dog>();
            sub_breeds.forEach(sub_breed ->
                    curSub_breed.add(new Dog(sub_breed, List.of()))
            );

            curBreed.setSub_breed(curSub_breed);
            finalListOfDogs.add(curBreed);
        });
        return finalListOfDogs;
    }

    public DogDetails getDogDetails(String specificBreed) {

        // get data from API as String
        final String subBreedsUrl = "https://dog.ceo/api/breed/"+ specificBreed +"/list";
        final String imagesUrl = "https://dog.ceo/api/breed/"+ specificBreed +"/images";

        // parse string as defined object
        POJODogDetails sub_breeds = restTemplate.getForObject(subBreedsUrl, POJODogDetails.class);
        POJODogDetails images = restTemplate.getForObject(imagesUrl, POJODogDetails.class);

        // convert to desired return format
        List<Dog> curSub_breed = new ArrayList<Dog>();
        sub_breeds.getMessage().forEach(sub_breed -> {
            curSub_breed.add(new Dog(sub_breed, null));
        });
        return new DogDetails(specificBreed, curSub_breed, images.getMessage());
    }
}
