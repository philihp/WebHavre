package com.philihp.lehavre.ships;

import com.philihp.lehavre.core.BuildCost;
import com.philihp.lehavre.core.PlayerCount;

public enum ShipType {
	WOOD(new int[] {5,4,3,2,1}, BuildCost.is().wood(5).energy(3)),
	IRON(new int[] {7,5,4,3,2}, BuildCost.is().iron(4).energy(3)),
	STEEL(new int[] {10,7,6,5,3}, BuildCost.is().steel(2).energy(3)),
	LUXURY(new int[] {0,0,0,0,0}, BuildCost.is().steel(3).energy(3));

	int[] foodProvided;
	BuildCost buildCost;
	ShipType(int[] foodProvided, BuildCost buildCost) {
		this.foodProvided = new int[foodProvided.length];
		System.arraycopy(foodProvided, 0, this.foodProvided, 0, foodProvided.length);
		this.buildCost = buildCost;
	}
	
	public int getFoodProvided(PlayerCount count) {
		return foodProvided[count.ordinal()];
	}
	
	public BuildCost getBuildCost() {
		return buildCost;
	}
}