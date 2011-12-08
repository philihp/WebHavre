package com.philihp.lehavre.buildings;

import static com.philihp.lehavre.buildings.BuildingType.*;
import static com.philihp.lehavre.buildings.EntryCost.FREE;
import static com.philihp.lehavre.core.BuildCost.UNBUILDABLE;

import com.philihp.lehavre.core.BoardState;
import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;
import com.philihp.lehavre.core.PlayerState;

/**
 * build 1 building
 * 
 * @author Philihp
 */
public class BuildingFirmB extends Building {

	public BuildingFirmB(BoardState board) {
		super(board, "B2", "Building Firm", 6, 0, 1, HOUSE, UNBUILDABLE,
				EntryCost.is(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return false;
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return true;
	}

}
