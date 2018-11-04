package net.ada.mypetclinic.services;

import java.util.Set;
import net.ada.mypetclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);
    
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
