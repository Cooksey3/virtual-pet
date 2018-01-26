package virtual.pet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void allowInteractionByPetName() {
		VirtualPet underTest = new VirtualPet();
		boolean check = underTest.AllowAccess("Bilbo");
		Assert.assertTrue(check);
		
		
		
	}
	
}
