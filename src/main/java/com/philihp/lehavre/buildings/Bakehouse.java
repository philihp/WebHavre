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
 * grain+(1/2)energy --> bread+(1/2)coin
 * 
 * @author Philihp
 */
public class Bakehouse extends Building {

	public Bakehouse(BoardState board) {
		super(board, "05", "Bakehouse", 8, 0, 0, HOUSE,
				BuildCost.is().clay(2), EntryCost.is(1));
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
