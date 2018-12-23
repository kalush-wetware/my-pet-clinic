package net.ada.mypetclinic.repositories;

import java.util.List;
import net.ada.mypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
