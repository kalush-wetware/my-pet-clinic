package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.PetType;
import net.ada.mypetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

    @Override
    public void delete(PetType object) {
        super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

}
