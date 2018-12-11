package net.ada.mypetclinic.services.map;

import java.util.Set;
import net.ada.mypetclinic.model.Owner;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Smith";

    public OwnerMapServiceTest() {
    }

    @BeforeEach
    public void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    public void testDelete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    public void testDeleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    public void testSaveExistingId() {
        Long id = 2L;

        Owner owner2 = Owner.builder().id(id).build();

        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id, savedOwner.getId());
    }

    @Test
    public void testSaveNoId() {
        Owner owner = Owner.builder().build();
        Owner savedOwner = ownerMapService.save(owner);
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    public void testFindById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    public void testFindAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    public void testFindByLastName() {
        Owner smith = ownerMapService.findByLastName(lastName);
        assertNotNull(smith);

        assertEquals(ownerId, smith.getId());
    }

    @Test
    public void testFindByLastNameNotFound() {
        Owner smith = ownerMapService.findByLastName("Brown");
        assertNull(smith);
    }

}
