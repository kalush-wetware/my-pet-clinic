package net.ada.mypetclinic.services;

import java.util.Set;
import net.ada.mypetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
