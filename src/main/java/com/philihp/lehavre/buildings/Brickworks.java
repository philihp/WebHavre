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
 * clay --> 1/2 energy per clay --> brick & 1/2 coin
 * 
 * @author Philihp
 */
public class Brickworks extends Building {

	public Brickworks(BoardState board) {
		super(board, "14", "Brickworks", 14, 0, 0, INDUSTRY,
				BuildCost.is().wood(2).clay(1).iron(1), EntryCost.is(1));
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
