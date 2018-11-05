package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Vet;
import net.ada.mypetclinic.services.CrudService;


public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

    @Override
    public void delete(Vet object) {
        super.delete(object); 
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); 
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object); 
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id); 
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll(); 
    }

    @Override
    public Vet save(Vet object) {
        super.save(object.getId(), object);
        return object;
    }

   
}
