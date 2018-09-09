package pet;

import java.util.Scanner;

public class VirtualPetMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(40, 50, 60, 70, 80);
		int myCounter = 0;

		System.out.println("Meet Sana your sloth bear. Here are her stats:");
		System.out.println("Hunger: " + myPet.hungerBalance);
		System.out.println("Thirst: " + myPet.thirstBalance);
		System.out.println("Wants to use facilities: " + myPet.shitBalance);
		System.out.println("Boredrum: " + myPet.boredrumBalance);
		System.out.println("Health: " + myPet.healthBalance + "\n");

		String userChoice;

		while (myCounter >= 0) {
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Sana.");
			System.out.println("2. Give Sana water to drink.");
			System.out.println("3. Play with Sana.");
			System.out.println("4. Leave Sana be.");
			System.out.println("5. Get Sana's stats.");
			userChoice = input.nextLine();

			switch (userChoice) {
			case "1":
				myPet.feed(10);
				// System.out.println(myPet.getHungerBalance());
				System.out.println("\nYou fed Sana.");
				break;
			case "2":
				myPet.drink(10);
				System.out.println("\nYou gave Sana a drink.");
				break;
			case "3":
				myPet.drink(10);
				System.out.println("\nYou played with Sana.");
				break;
			case "4":
				myPet.drink(10);
				System.out.println("\nTime out.");
				break;
			case "5":
				System.out.println("Hunger: " + myPet.hungerBalance);
				System.out.println("Thirst: " + myPet.thirstBalance);
				System.out.println("Wants to use facilities: " + myPet.shitBalance);
				System.out.println("Boredrum: " + myPet.boredrumBalance);
				System.out.println("Health: " + myPet.healthBalance + "\n");
				break;
			default:
				System.out.println("Let's play again.\n");
				myCounter++;
			}

		}

	}
}
