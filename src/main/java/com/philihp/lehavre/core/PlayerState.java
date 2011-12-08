package com.philihp.lehavre.core;

import java.util.ArrayList;
import java.util.List;

import com.philihp.lehavre.buildings.Building;

public class PlayerState implements Cloneable {
	protected int loans;
	protected int coins;
	protected int fish;
	protected int wood;
	protected int clay;
	protected int iron;
	protected int wheat;
	protected int cattle;
	protected int hides;
	protected int coal;
	protected int smokedFish;
	protected int charcoal;
	protected int brick;
	protected int steel;
	protected int bread;
	protected int meat;
	protected int leather;
	protected int coke;
	protected BoardState board;
	protected List<Building> ownedBuildings;

	public PlayerState(BoardState board) {
		this.board = board;
		ownedBuildings = new ArrayList<Building>(); 
	}

	public PlayerState clone() {
		PlayerState clone = null;
		try {
			clone = (PlayerState) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public void payInterest() {
		if (loans > 0) {
			if (coins == 0) {
				loans++;
				coins += 4;
			}
			coins--;
		}
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getClay() {
		return clay;
	}

	public void setClay(int clay) {
		this.clay = clay;
	}

	public int getIron() {
		return iron;
	}

	public void setIron(int iron) {
		this.iron = iron;
	}

	public int getBrick() {
		return brick;
	}

	public void setBrick(int brick) {
		this.brick = brick;
	}

	public int getSteel() {
		return steel;
	}

	public void setSteel(int steel) {
		this.steel = steel;
	}

	public int getLoans() {
		return loans;
	}

	public void setLoans(int loans) {
		this.loans = loans;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getFish() {
		return fish;
	}

	public void setFish(int fish) {
		this.fish = fish;
	}

	public int getWheat() {
		return wheat;
	}

	public void setWheat(int wheat) {
		this.wheat = wheat;
	}

	public int getCattle() {
		return cattle;
	}

	public void setCattle(int cattle) {
		this.cattle = cattle;
	}

	public int getHides() {
		return hides;
	}

	public void setHides(int hides) {
		this.hides = hides;
	}

	public int getCoal() {
		return coal;
	}

	public void setCoal(int coal) {
		this.coal = coal;
	}

	public int getSmokedFish() {
		return smokedFish;
	}

	public void setSmokedFish(int smokedFish) {
		this.smokedFish = smokedFish;
	}

	public int getCharcoal() {
		return charcoal;
	}

	public void setCharcoal(int charcoal) {
		this.charcoal = charcoal;
	}

	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getMeat() {
		return meat;
	}

	public void setMeat(int meat) {
		this.meat = meat;
	}

	public int getLeather() {
		return leather;
	}

	public void setLeather(int leather) {
		this.leather = leather;
	}

	public int getCoke() {
		return coke;
	}

	public void setCoke(int coke) {
		this.coke = coke;
	}

}
