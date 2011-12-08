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
 * building cost for a boat.
 * 
 * The first player to build a non-wooden ship must first modernize (with 1 brick)
 * 
 * @author Philihp
 */
public class WharfA extends Building {

	public WharfA(BoardState board) {
		super(board, "12", "Wharf", 14, 0, 0, INDUSTRY,
				BuildCost.is().wood(2).clay(2).iron(2), EntryCost.is(2));
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
