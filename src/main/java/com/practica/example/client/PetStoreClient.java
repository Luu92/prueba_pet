package com.practica.example.client;

import com.practica.example.model.Pet;
import com.practica.example.model.PetResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class PetStoreClient {

    public Pet getPetById(Long petId){
        String uri = "https://petstore.swagger.io/v2/pet/{petId}";
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, Pet.class, petId);
    }

    public Pet createPet(Pet pet){
        String uri = "https://petstore.swagger.io/v2/pet";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, pet, Pet.class);
    }
}
