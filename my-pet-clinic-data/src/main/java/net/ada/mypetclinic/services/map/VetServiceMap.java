package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Vet;
import net.ada.mypetclinic.services.CrudService;
import net.ada.mypetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    @Override
    public void delete(Vet object) {
        super.delete(object); 
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); 
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object); 
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id); 
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll(); 
    }
   
}
