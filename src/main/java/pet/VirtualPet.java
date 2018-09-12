package pet;

public class VirtualPet {

	private int hungerBalance;
	private int thirstBalance;
	private int shitBalance;
	private int boredrumBalance;
	private int healthBalance;
	private int myCounter = 0;

	public VirtualPet(int hungerBalance, int thirstBalance, int shitBalance, int boredrumBalance, int healthBalance) {
		this.hungerBalance = hungerBalance;
		this.thirstBalance = thirstBalance;
		this.shitBalance = shitBalance;
		this.boredrumBalance = boredrumBalance;
		this.healthBalance = healthBalance;

	}

	// can delete if it's not going to be used in main
	public int getCounter() {
		// TODO Auto-generated method stub
		return myCounter;
	}

	public int getHungerBalance() {
		// TODO Auto-generated method stub
		return hungerBalance;
	}

	public int getThirstBalance() {
		// TODO Auto-generated method stub
		return thirstBalance;
	}

	public int getShitBalance() {
		// TODO Auto-generated method stub
		return shitBalance;
	}

	public int getBoredrumBalance() {
		return boredrumBalance;
	}

	public int getHealthBalance() {
		// TODO Auto-generated method stub
		return healthBalance;
	}

	public void feed(int amountFed) {
		// hunger if
		if (myCounter % 4 == 1) {
			System.out.println("\nSana ate some baaaaddd ants for dinner. This makes her belly feel very very sick.");
			healthBalance -= 30;
			shitBalance += 30;
			if (shitBalance >= 100) {
				System.out.println("\nTake Sana outside to use the facilities.");
				shitBalance = 0;
			}
		} else {
			System.out.println("\nYou go to feed Sana.");
		}

		if (hungerBalance >= 20 && hungerBalance < 40) {
			System.out.println("\nYour little sloth bear is getting full.");
			hungerBalance += 10;
		} else if (hungerBalance >= 0 && hungerBalance < 20) {
			System.out.println("\nSana is very very full.");
			hungerBalance += 10;
		} else if (hungerBalance > 100) {
			System.out.println("\nYou've overfeed Sana. Sana is no more..");
			System.exit(0);
		} else {
			;
		}

		if (shitBalance >= 100) {
			System.out.println("\nTake Sana outside to use the facilities.");
			shitBalance = 0;
		}

		// thirst if
		if (thirstBalance >= 80 && thirstBalance < 100) {
			System.out.println("\nSo parched your sloth bear is. Get her a drink.");
			boredrumBalance += 10;
		} else if (thirstBalance > 100) {
			System.out.println("\nPoor Sana. May she rest in peace. She died of thrist.");
			thirstBalance += 10;
			System.exit(0);
		}

		// boredrum if
		if (boredrumBalance >= 80 && boredrumBalance < 90) {
			System.out.println("\nSana is bored. You should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance >= 90 && boredrumBalance < 100) {
			System.out.println(
					"\nBored pets get sad. Sad pets run away. \nIf you want to keep Sana, you should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance > 100) {
			System.out.println("\nSana has better things to do than wait for you to play with her. Sana has run away.");
			boredrumBalance += 10;
			System.exit(0);
		} else {
			;
		}

		hungerBalance -= amountFed;
		thirstBalance += amountFed;
		shitBalance += amountFed;
		boredrumBalance -= amountFed;

		myCounter++;

	}

	public void drink(int amountDrank) {
		System.out.println("\nYou go to give Sana a drink.");
		// outside if
		if (shitBalance >= 100) {
			System.out.println("\nTake Sana outside to use the facilities.");
			shitBalance = 0;
		}

		// thirst if
		if (thirstBalance >= 80 && thirstBalance < 100) {
			System.out.println("\nSo parched your sloth bear is. Get her a drink.");
			boredrumBalance += 10;
		} else if (thirstBalance > 100) {
			System.out.println("\nPoor Sana. May she rest in peace. She died of thrist.");
			thirstBalance += 10;
			System.exit(0);
		}

		// boredrum if
		if (boredrumBalance >= 80 && boredrumBalance < 90) {
			System.out.println("\nSana is bored. You should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance >= 90 && boredrumBalance < 100) {
			System.out.println(
					"\nBored pets get sad. Sad pets run away. \nIf you want to keep Sana, you should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance > 100) {
			System.out.println("\nSana has better things to do than wait for you to play with her. Sana has run away.");
			boredrumBalance += 10;
			System.exit(0);
		} else {
			;
		}

		// hunger if
		if (hungerBalance >= 20 && hungerBalance < 40) {
			System.out.println("\nYour little sloth bear is getting full.");
			hungerBalance += 10;
		} else if (hungerBalance >= 0 && hungerBalance < 20) {
			System.out.println("\nSana is very very full.");
			hungerBalance += 10;
		} else if (hungerBalance > 100) {
			System.out.println("\nYou've overfeed Sana. Sana is no more..");
			System.exit(0);
		} else {
			;
		}

		thirstBalance -= amountDrank;
		boredrumBalance += amountDrank;

		myCounter++;
	}

	public void tick() {
		System.out.println("\nTime out.");
		hungerBalance += 10;
		thirstBalance += 10;
		shitBalance += 10;
		boredrumBalance += 10;

		myCounter++;
	}

	public void play(int amountPlayed) {
		if (shitBalance >= 100) {
			System.out.println("\nTake Sana outside to use the facilities.");
			shitBalance = 0;
		}

		// thirst if
		if (thirstBalance >= 80 && thirstBalance < 100) {
			System.out.println("\nSo parched your sloth bear is. Get her a drink.");
			boredrumBalance += 10;
		} else if (thirstBalance > 100) {
			System.out.println("\nPoor Sana. May she rest in peace. She died of thrist.");
			thirstBalance += 10;
			System.exit(0);
		}

		// boredrum if
		if (boredrumBalance >= 80 && boredrumBalance < 90) {
			System.out.println("\nSana is bored. You should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance >= 90 && boredrumBalance < 100) {
			System.out.println(
					"\nBored pets get sad. Sad pets run away. \nIf you want to keep Sana, you should play with her.");
			boredrumBalance += 10;
		} else if (boredrumBalance > 100) {
			System.out.println("\nSana has better things to do than wait for you to play with her. Sana has run away.");
			boredrumBalance += 10;
			System.exit(0);
		} else {
			System.out.println("\nYou played with Sana.");
			boredrumBalance -= 20;
		}

		// hunger if
		if (hungerBalance >= 20 && hungerBalance < 40) {
			System.out.println("\nYour little sloth bear is getting full.");
			hungerBalance += 10;
		} else if (hungerBalance >= 0 && hungerBalance < 20) {
			System.out.println("\nSana is very very full.");
			hungerBalance += 10;
		} else if (hungerBalance > 100) {
			System.out.println("\nYou've overfeed Sana. Sana is no more..");
			System.exit(0);
		} else {
			;
		}

		thirstBalance += amountPlayed + 10;
		hungerBalance += amountPlayed;
		boredrumBalance -= amountPlayed;

		myCounter++;
	}

}
