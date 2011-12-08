package com.philihp.lehavre.buildings;

public class EntryCost {

	protected int primaryFood = 0;
	protected int primaryCoins = 0;
	protected boolean hasAlternate = false;
	protected int alternateCoins = 0;

	private EntryCost() {
	}
	
	public static final EntryCost FREE = new EntryCost();
	public static final EntryCost LOCKED = null;
	
	public static EntryCost is(int food) {
		EntryCost cost = new EntryCost();
		cost.primaryFood = food;
		return cost;
	}

	public EntryCost and(int coins) {
		this.primaryCoins = coins;
		return this;
	}

	public EntryCost or(int coins) {
		this.hasAlternate = true;
		this.alternateCoins = coins;
		return this;
	}
}
