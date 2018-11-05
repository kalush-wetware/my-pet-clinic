package net.ada.mypetclinic.services;

import java.util.Set;
import net.ada.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);      
}
