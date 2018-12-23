package net.ada.mypetclinic.services;

import java.util.List;
import net.ada.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
