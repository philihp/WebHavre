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
 * 1 energy total: fish --6x--> smoked fish & 1/2 coin
 * 
 * @author Philihp
 */
public class Smokehouse extends Building {

	public Smokehouse(BoardState board) {
		super(board, "08", "Smokehouse", 6, 1, 0, HOUSE, BuildCost.is().clay(1)
				.wood(2), EntryCost.is(2).or(1));
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
