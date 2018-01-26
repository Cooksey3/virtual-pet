package virtual.pet;

public class VirtualPet {

	private String petName = "Bilbo";
	
	public boolean AllowAccess(String enteredPetName) {
		return enteredPetName.equals(petName);
	}

}
