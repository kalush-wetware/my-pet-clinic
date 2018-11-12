package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Pet;
import net.ada.mypetclinic.services.CrudService;
import net.ada.mypetclinic.services.PetService;


public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

    @Override
    public void delete(Pet object) {
        super.delete(object); 
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); 
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object); 
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id); 
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll(); 
    }

    @Override
    public Pet save(Pet object) {
        super.save(object.getId(), object);
        return object;
    }

   
}
