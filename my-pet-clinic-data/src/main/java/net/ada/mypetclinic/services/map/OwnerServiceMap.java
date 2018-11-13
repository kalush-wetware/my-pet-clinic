package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Owner;
import net.ada.mypetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

    @Override
    public void delete(Owner object) {
        super.delete(object); 
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); 
    }

    @Override
    public Owner save(Long id, Owner object) {
        return super.save(id, object); 
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id); 
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll(); 
    }

    @Override
    public Owner save(Owner object) {
        super.save(object.getId(), object);
        return object;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

   
}
