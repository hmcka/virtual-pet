package pet;

public class VirtualPet {

	public int hungerBalance;
	public int thirstBalance;
	public int shitBalance;
	public int boredrumBalance;
	public int healthBalance;

	public VirtualPet(int hungerBalance, int thirstBalance, int shitBalance, int boredrumBalance, int healthBalance) {
		this.hungerBalance = hungerBalance;
		this.thirstBalance = thirstBalance;
		this.shitBalance = shitBalance;
		this.boredrumBalance = boredrumBalance;
		this.healthBalance = healthBalance;

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
		// TODO Auto-generated method stub
		return boredrumBalance;
	}

	public int getHealthBalance() {
		// TODO Auto-generated method stub
		return healthBalance;
	}

	public void feed(int amountFed) {
		hungerBalance -= amountFed;
		thirstBalance += amountFed;
		shitBalance += amountFed;
	}

	public void drink(int amountDrank) {
		thirstBalance -= amountDrank;
		hungerBalance -= amountDrank;
	}

	public void tick() {
		hungerBalance += 10;
		thirstBalance += 10;
		shitBalance += 10;
		boredrumBalance += 20;
		healthBalance += 20;

	}

}
