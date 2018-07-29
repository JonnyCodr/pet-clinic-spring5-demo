package com.example.data.services;

import com.example.data.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
