package net.ada.mypetclinic.repositories;

import net.ada.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Long>{

}
