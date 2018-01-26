package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPet bilbo = new VirtualPet();
		
		System.out.print("Call your pet's name:");
		String petName = input.next();
		
		while (!bilbo.callPet(petName)) {
			System.out.println("You called the wrong name. Try again: ");
			petName = input.nextLine();
		}
		
		System.out.println(petName + " came to you!");
		
		System.out.println("What would you like to do?");
		System.out.println("1: Feed " + petName + ".");
		System.out.println("2: Give water to " + petName + ".");
		System.out.println("3: Play with " + petName + ".");
		System.out.println("4: Put  " + petName + " down for a nap.");
		System.out.println("5: Give " + petName + " up for adoption.");
		System.out.print("Select an option: ");
		String option = input.next();
		
		while (!option.equals("5")) {
			if (option.equals("1")) {
				bilbo.getDecreasedHungerLevel();
				System.out.println("You fed " + petName + ". " + petName + "'s hunger level is now " + bilbo.getHungerLevel() + ".");
				System.out.println("What else would you like to do?");
			} else if (option.equals("2")) {
				bilbo.getDecreasedThirstLevel();
				System.out.println("You watered " + petName + ". " + petName + "'s thirst level is now " + bilbo.getThirstLevel() + ".");
			}
			option = input.nextLine();
		}
		

	}

}
