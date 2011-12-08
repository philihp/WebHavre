package com.philihp.lehavre.ships;

import java.util.ArrayList;
import java.util.List;

import com.philihp.lehavre.buildings.BuildingType;
import com.philihp.lehavre.buildings.EntryCost;
import com.philihp.lehavre.core.*;

public class Ship implements Comparable<Ship> {


	protected PlayerState owner = null;
	
	protected final ShipEnum identity;
	
	protected BoardState board;
	
	public Ship(ShipEnum identity, BoardState board) {
		this.identity = identity;
		this.board = board;
	}
	
	public static Ship[] buildShipDeck(BoardState board) {
		List<Ship> out = new ArrayList<Ship>();
		for(ShipEnum ship : ShipEnum.values()) {
			if(ship.usedInGame(board.getGameMode(), board.getPlayerCount()))
				out.add(new Ship(ship, board));
		}
		return out.toArray(new Ship[0]);
	}
	
	public boolean canBuild(PlayerState player) {
		int neededEnergy = identity.type.getBuildCost().getEnergy();
		int hypotheticalWood = player.getWood();
		neededEnergy -= player.getCoke()*10;
		neededEnergy -= player.getCoal()*3;
		neededEnergy -= player.getCharcoal()*3;
		if(neededEnergy > 0) {
			hypotheticalWood -= neededEnergy;
			neededEnergy = 0;
		}
		return neededEnergy > 0 &&
			identity.type.getBuildCost() != BuildCost.UNBUILDABLE &&
			hypotheticalWood >= identity.type.getBuildCost().getWood() &&
			player.getIron() >= identity.type.getBuildCost().getIron() &&
			player.getSteel() >= identity.type.getBuildCost().getSteel();
	}
	
	@Override
	public int compareTo(Ship o) {
		return Integer.compare(identity.ordinal(), o.identity.ordinal());
	}
	
	@Override
	public String toString() {
		return identity.toString()+"{food="+identity.getRequiredFood(board.getPlayerCount())+"}";
	}
	
}
