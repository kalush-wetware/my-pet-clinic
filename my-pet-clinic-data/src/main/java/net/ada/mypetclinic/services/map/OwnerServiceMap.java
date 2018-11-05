package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Owner;
import net.ada.mypetclinic.services.CrudService;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

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

   
}
