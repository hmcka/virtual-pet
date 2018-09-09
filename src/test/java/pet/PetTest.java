package pet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {
	VirtualPet underTest = new VirtualPet(40, 50, 60, 70, 80);

	@Test
	public void shouldHaveDefaultHungerBalanceOf40() {
		int hungerBalance = underTest.getHungerBalance();
		assertEquals(40, hungerBalance);
	}

	@Test
	public void shouldHaveDefaultThirstBalanceOf50() {
		int thirstBalance = underTest.getThirstBalance();
		assertEquals(50, thirstBalance);
	}

	@Test
	public void shouldHaveDefaultShitBalanceOf60() {
		int shitBalance = underTest.getShitBalance();
		assertEquals(60, shitBalance);
	}

	@Test
	public void shouldHaveDefaultBoredrumBalanceOf70() {
		int boredrumBalance = underTest.getBoredrumBalance();
		assertEquals(70, boredrumBalance);
	}

	@Test
	public void shouldHaveDefaultHealthBalanceOf80() {
		int healthBalance = underTest.getHealthBalance();
		assertEquals(80, healthBalance);
	}

	@Test
	public void shouldHaveHungerBalanceOf30AfterFeedingOf10() {
		underTest.feed(10);
		int hungerBalance = underTest.getHungerBalance();
		int thirstBalance = underTest.getThirstBalance();
		assertEquals(30, hungerBalance);
		assertEquals(60, thirstBalance);
	}

	@Test
	public void shouldHaveThirstBalanceOf40AfterDrinking10() {
		underTest.drink(10);
		int thirstBalance = underTest.getThirstBalance();
		assertEquals(40, thirstBalance);
	}

	@Test
	public void shouldIncreaseHungerBy10WithTick() {
		underTest.tick();
		int hungerBalance = underTest.getHungerBalance();
		assertEquals(50, hungerBalance);
	}

	@Test
	public void shouldIncreaseShitBalanceBy10WhenFed10() {
		underTest.feed(10);
		int shitBalance = underTest.getShitBalance();
		assertEquals(70, shitBalance);
	}

	@Test
	public void shouldDecreaseHungerBy10WhenDrinking10() {
		underTest.drink(10);
		int hungerBalance = underTest.getHungerBalance();
		assertEquals(30, hungerBalance);
	}

//arrange
//act
//assert
}
