package com.example.data.services;

import com.example.data.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByLastName(String lastName);

}
