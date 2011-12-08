package com.philihp.lehavre.core;

public class BuildCost {

	private int wood = 0;
	private int clay = 0;
	private int brick = 0;
	private int iron = 0;
	private int steel = 0;
	private int energy = 0;
	
	public static final BuildCost UNBUILDABLE = new BuildCost();

	private BuildCost() {
	}
	
	public static BuildCost is() {
		return new BuildCost();
	}

	public BuildCost wood(int quantity) {
		wood += quantity;
		return this;
	}

	public BuildCost clay(int quantity) {
		clay += quantity;
		return this;
	}

	public BuildCost brick(int quantity) {
		brick += quantity;
		return this;
	}

	public BuildCost iron(int quantity) {
		iron += quantity;
		return this;
	}

	public BuildCost steel(int quantity) {
		steel += quantity;
		return this;
	}
	
	public BuildCost energy(int quantity) {
		energy += quantity;
		return this;
	}

	public int getWood() {
		return wood;
	}

	public int getClay() {
		return clay;
	}

	public int getBrick() {
		return brick;
	}

	public int getIron() {
		return iron;
	}

	public int getSteel() {
		return steel;
	}
	
	public int getEnergy() {
		return energy;
	}
}
