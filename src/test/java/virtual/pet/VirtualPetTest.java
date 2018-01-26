package virtual.pet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void allowInteractionByPetName() {
		VirtualPet underTest = new VirtualPet();
		boolean check = underTest.callPet("Bilbo");
		Assert.assertTrue(check);
	}

	@Test
	public void shouldHaveDefaultHungerLevel() {
		VirtualPet underTest = new VirtualPet();
		int hungerLevel = underTest.getHungerLevel();
		Assert.assertEquals(1, hungerLevel);
	}

	@Test
	public void shouldHaveDefaultThirstLevel() {
		VirtualPet underTest = new VirtualPet();
		int thirstLevel = underTest.getThirstLevel();
		Assert.assertEquals(1, thirstLevel);
	}

	@Test
	public void shouldHaveDefaultBoredomLevel() {
		VirtualPet underTest = new VirtualPet();
		int boredomLevel = underTest.getBoredomLevel();
		Assert.assertEquals(1, boredomLevel);
	}

	@Test
	public void shouldDecreaseThirstLevel() {
		VirtualPet underTest = new VirtualPet();
		int thirstLevel = underTest.getDecreasedThirstLevel();
		int decreasedThirstLevel = thirstLevel - 1;
		Assert.assertEquals(0, thirstLevel);
	}

	@Test
	public void shouldDecreaseHungerLevel() {
		VirtualPet underTest = new VirtualPet();
		int hungerLevel = underTest.getDecreasedHungerLevel();
		int decreasedHungerLevel = hungerLevel - 1;
		Assert.assertEquals(0, hungerLevel);
	}

	@Test
	public void shouldDecreaseBoredomLevel() {
		VirtualPet underTest = new VirtualPet();
		int boredomLevel = underTest.getDecreasedBoredomLevel();
		int decreasedBoredomLevel = boredomLevel - 1;
		Assert.assertEquals(0, boredomLevel);
	}
	
	@Test
	public void tickHunger() {
		VirtualPet underTest = new VirtualPet();
		int hungerLevel = underTest.tick().hunger();
		int tick = 
	}

}
