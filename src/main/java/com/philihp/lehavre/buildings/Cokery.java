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
 * coal --> coke + coin
 * 
 * @author Philihp
 */
public class Cokery extends Building {

	public Cokery(BoardState board) {
		super(board, "25", "Cokery", 18, 0, 0, INDUSTRY, BuildCost.is().brick(2)
				.iron(2), EntryCost.is(0).and(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if (mode == GameMode.SHORT && count == PlayerCount.ONE)
			return false;
		else
			return true;
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}
}
