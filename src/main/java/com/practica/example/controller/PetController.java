package com.practica.example.controller;

import com.practica.example.model.Pet;
import com.practica.example.model.PetResponse;
import com.practica.example.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    @Autowired
    private PetService petService;

    //public PetController(PetService petService) {
      //  this.petService = petService;
    //}

    @GetMapping("/{petId}")
    public Pet getPetById(@PathVariable Long petId){
     return petService.getPetById(petId);
    }

    @PostMapping()
    public PetResponse postPet(@RequestBody Pet pet){

        Pet mascota = petService.getPetById(pet.getId());

        if(mascota == null){
            for (int i = 0; i < pet.getCadena().length; i++) {
                System.out.println(pet.getCadena()[i]);
            }
            return petService.createPet(pet);
        }
        return null;
    }

    @DeleteMapping("/{petId}")
    public void deletePet(@PathVariable Long petId){
        petService.deletePet(petId);
    }


}
