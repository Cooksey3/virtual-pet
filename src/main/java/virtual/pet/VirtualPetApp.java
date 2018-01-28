package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Call your pet to you!");
		String petName = input.next();

		VirtualPet myPet = new VirtualPet(petName);

		System.out.println(petName + "'s vitals are:");
		System.out.println("Hunger: " + myPet.getHungerLevel());
		System.out.println("Thirst: " + myPet.getThirstLevel());
		System.out.println("Boredom: " + myPet.getBoredomLevel());
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("0: Give " + petName + " up for adoption.");
		System.out.println("1: Feed " + petName + ".");
		System.out.println("2: Give water to " + petName + ".");
		System.out.println("3: Play with " + petName + ".");
		System.out.println("4: Put  " + petName + " down for a nap.");
		System.out.print("Select an option: ");
		String option = input.next();

		while (!option.equals("0")) {

			if (option.equals("1")) {
				myPet.decreaseHungerLevel();
				System.out.println("You fed " + petName + ".");
			} else if (option.equals("2")) {
				myPet.decreaseThirstLevel();
				System.out.println("You watered " + petName + ".");
			} else if (option.equals("3")) {
				myPet.decreaseBoredomLevel();
				System.out.println("You played with " + petName + ".");
			} else {
				System.out.println("Choose a different option");
			}

			myPet.tick();

			System.out.println();
			System.out.println(myPet + "'s vitals are now:");
			System.out.println("Hunger: " + myPet.getHungerLevel());
			System.out.println("Thirst: " + myPet.getThirstLevel());
			System.out.println("Boredom: " + myPet.getBoredomLevel());
			System.out.println();
			System.out.println("What else would you like to do?");
			System.out.println("0: Give " + petName + " up for adoption.");
			System.out.println("1: Feed " + petName + ".");
			System.out.println("2: Give water to " + petName + ".");
			System.out.println("3: Play with " + petName + ".");
			System.out.println("4: Put  " + petName + " down for a nap.");

			option = input.next();
		}

		System.out.println("You gave " + petName + " up for adoption. " + petName + " is heartbroken.");
		System.exit(0);

	}

}
