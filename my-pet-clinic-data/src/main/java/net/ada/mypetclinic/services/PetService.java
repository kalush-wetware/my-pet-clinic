package net.ada.mypetclinic.services;

import java.util.Set;
import net.ada.mypetclinic.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
