package com.practica.example.controller;

import com.practica.example.model.Pet;
import com.practica.example.model.PetResponse;
import com.practica.example.service.PetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/{petId}")
    public Pet getPetById(@PathVariable Long petId){
     return petService.getPetById(petId);
    }

    @PostMapping()
    public PetResponse postPet(@RequestBody Pet pet){
        return petService.createPet(pet);
    }
}
