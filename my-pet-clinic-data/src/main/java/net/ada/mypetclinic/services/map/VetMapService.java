package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Speciality;
import net.ada.mypetclinic.model.Vet;
import net.ada.mypetclinic.services.SpecialityService;
import net.ada.mypetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }
    
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
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
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
