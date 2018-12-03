package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Speciality;
import org.springframework.stereotype.Service;
import net.ada.mypetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService{

    @Override
    public void delete(Speciality object) {
        super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

}
