package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Pet;
import net.ada.mypetclinic.services.CrudService;
import net.ada.mypetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{

    @Override
    public void delete(Pet object) {
        super.delete(object); 
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); 
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object); 
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id); 
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll(); 
    }

  
}
