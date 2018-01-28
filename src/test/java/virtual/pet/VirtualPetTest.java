package virtual.pet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldHaveDefaultHungerLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int hungerLevel = underTest.getHungerLevel();
		Assert.assertEquals(10, hungerLevel);
	}

	@Test
	public void shouldHaveDefaultThirstLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int thirstLevel = underTest.getThirstLevel();
		Assert.assertEquals(10, thirstLevel);
	}

	@Test
	public void shouldHaveDefaultBoredomLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int boredomLevel = underTest.getBoredomLevel();
		Assert.assertEquals(10, boredomLevel);
	}

	@Test
	public void shouldDecreaseThirstLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int thirstLevel = underTest.decreaseThirstLevel();
		Assert.assertEquals(9, thirstLevel);
	}

	@Test
	public void shouldDecreaseHungerLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int hungerLevel = underTest.decreaseHungerLevel();
		Assert.assertEquals(9, hungerLevel);
	}

	@Test
	public void shouldDecreaseBoredomLevel() {
		VirtualPet underTest = new VirtualPet("george");
		int boredomLevel = underTest.decreaseBoredomLevel();
		Assert.assertEquals(9, boredomLevel);
	}

	@Test
	public void shouldIncreaseHungerLevel() {
		VirtualPet underTest = new VirtualPet("george");
		underTest.tick();
		int hungerLevel = underTest.getHungerLevel();
		Assert.assertEquals(11, hungerLevel);
	}

	@Test
	public void shouldIncreaseThirstLevel() {
		VirtualPet underTest = new VirtualPet("george");
		underTest.tick();
		int thirstLevel = underTest.getThirstLevel();
		Assert.assertEquals(11, thirstLevel);
	}

	@Test
	public void shouldIncreaseBoredomLevel() {
		VirtualPet underTest = new VirtualPet("george");
		underTest.tick();
		int boredomLevel = underTest.getBoredomLevel();
		Assert.assertEquals(11, boredomLevel);
	}

}