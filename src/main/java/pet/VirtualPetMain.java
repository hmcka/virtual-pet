package pet;

import java.util.Scanner;

public class VirtualPetMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(40, 50, 60, 70, 80);

		System.out.println("Meet Sana your sloth bear. Here are her stats:");
		System.out.println("Hunger: " + myPet.getHungerBalance());
		System.out.println("Thirst: " + myPet.getThirstBalance());
		System.out.println("Wants to use facilities: " + myPet.getShitBalance());
		System.out.println("Boredrum: " + myPet.getBoredrumBalance());
		System.out.println("Health: " + myPet.getHealthBalance() + "\n");

		String userChoice;

		while (true) {
			System.out.println("\nWhat do you want to do?");
			System.out.println("1. Feed Sana.");
			System.out.println("2. Give Sana water to drink.");
			System.out.println("3. Play with Sana.");
			System.out.println("4. Leave Sana be.");
			System.out.println("5. Get Sana's stats.");
			userChoice = input.nextLine();

			switch (userChoice) {
			case "1":
				myPet.feed(10);
				break;
			case "2":
				myPet.drink(10);
				break;
			case "3":
				myPet.play(10);
				break;
			case "4":
				// myPet.drink(10);
				myPet.tick();
				break;
			case "5":
				System.out.println("Hunger: " + myPet.getHungerBalance());
				System.out.println("Thirst: " + myPet.getThirstBalance());
				System.out.println("Wants to use facilities: " + myPet.getShitBalance());
				System.out.println("Boredrum: " + myPet.getBoredrumBalance());
				System.out.println("Health: " + myPet.getHealthBalance() + "\n");
				break;
			default:
				System.out.println("Let's play again.\n");
			}

		}

	}
}
