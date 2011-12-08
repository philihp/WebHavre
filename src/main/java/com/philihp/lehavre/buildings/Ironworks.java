package com.philihp.lehavre.buildings;

import static com.philihp.lehavre.buildings.BuildingType.*;
import static com.philihp.lehavre.buildings.EntryCost.FREE;
import static com.philihp.lehavre.core.BuildCost.UNBUILDABLE;

import com.philihp.lehavre.core.BoardState;
import com.philihp.lehavre.core.BuildCost;
import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;
import com.philihp.lehavre.core.PlayerState;

/**
 * +3 iron
 * additionally 6 energy --1x--> 1 iron
 * 
 * @author Philihp
 */
public class Ironworks extends Building {

	public Ironworks(BoardState board) {
		super(board, "22", "Ironworks", 12, 0, 1, INDUSTRY,
				BuildCost.is().wood(3).brick(2), EntryCost.is(3).or(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return true;
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}
}
