package net.ada.mypetclinic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MyPetClinicApplicationTests {

	@Test
	public void contextLoads() {
            int a =1;
            Assertions.assertEquals(a,1);
	}

}
