package com.practica.example.service;

import com.practica.example.client.PetStoreClient;
import com.practica.example.model.Pet;
import com.practica.example.model.PetResponse;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetService.class);

    private final PetStoreClient petStoreClient;

    public PetService(PetStoreClient petStoreClient) {
        this.petStoreClient = petStoreClient;
    }
    public Pet getPetById(Long petId){

        System.out.println("Valor identificador mascota " + petId);

            try{
                Pet pet = petStoreClient.getPetById(petId);
                logger.info(
                        "Pet obtenida - id: {}, nombre: {}, status: {}",
                        pet.getId(),
                        pet.getName(),
                        pet.getStatus()
                );
                return pet;
            }catch (HttpClientErrorException.NotFound e){
                System.out.println("Error " + e.getMessage());
                return null;
            }
    }

    public PetResponse createPet(Pet pet){
            Pet petCreated = petStoreClient.createPet(pet);
            return new PetResponse(
                    UUID.randomUUID().toString(),
                    LocalDateTime.now().toString(),
                    true,
                    petCreated.getName()
            );
    }

    public void deletePet(Long petId){
        Pet pet = petStoreClient.getPetById(petId);
        if(pet != null){
            petStoreClient.deletePet(petId);
        }
    }

}
