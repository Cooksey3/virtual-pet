package virtual.pet;

public class VirtualPet {

	private int hungerLevel;
	private String petName = "Bilbo";
	private int thirstLevel;
	private int boredomLevel;

	public VirtualPet() {
		hungerLevel = 1;
		boredomLevel = 1;
		thirstLevel = 1;
	}

	public boolean callPet(String calledName) {
		return calledName.equals(petName);
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getDecreasedThirstLevel() {
		return thirstLevel -= 1;
	}

	public int getDecreasedHungerLevel() {
		return hungerLevel -= 1;
	}

	public int getDecreasedBoredomLevel() {
		return boredomLevel -= 1;
	}

	public int tickHunger() {
		return hungerLevel += 1;
	}

	public int tickThirst() {
		return thirstLevel += 1;
	}

	public int tickBoredom() {
		return boredomLevel += 1;
	}

}