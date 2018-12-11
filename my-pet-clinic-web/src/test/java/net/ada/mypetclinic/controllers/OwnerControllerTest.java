package net.ada.mypetclinic.controllers;

import java.util.HashSet;
import java.util.Set;
import net.ada.mypetclinic.model.Owner;
import net.ada.mypetclinic.services.OwnerService;
import org.hamcrest.Matchers;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.ui.Model;

@ExtendWith(MockitoExtension.class)
public class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController controller;

    Set<Owner> owners;

    MockMvc mockMvc;

    public OwnerControllerTest() {

    }

    @BeforeEach
    public void setUp() {
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testListOwners() throws Exception {
      when(ownerService.findAll()).thenReturn(owners);
      
      mockMvc.perform(get("/owners"))
              .andExpect(status().isOk())
              .andExpect(view().name("owners/index"))
              .andExpect(model().attribute("owners", Matchers.hasSize(2)));

    }

    @Test
    public void testFindOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("notimplemented"));
        
        Mockito.verifyZeroInteractions(ownerService);
    }

}
