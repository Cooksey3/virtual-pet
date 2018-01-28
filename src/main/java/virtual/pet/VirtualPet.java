package virtual.pet;

public class VirtualPet {

	private int hungerLevel;
	private String petName;
	private int thirstLevel;
	private int boredomLevel;

	public VirtualPet(String newPetName) {
		petName = newPetName;
		hungerLevel = 10;
		boredomLevel = 10;
		thirstLevel = 10;
	}

	public String getPetName() {
		return petName;
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

	public int decreaseThirstLevel() {
		return thirstLevel -= 1;
	}

	public int decreaseHungerLevel() {
		return hungerLevel -= 1;
	}

	public int decreaseBoredomLevel() {
		return boredomLevel -= 1;
	}

	public void tick() {
		hungerLevel += 1;
		thirstLevel += 1;
		boredomLevel += 1;

	}

}