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
 * build 1 building
 * 
 * @author Philihp
 */
public class BuildingFirmA extends Building {

	public BuildingFirmA(BoardState board) {
		super(board, "B1", "Building Firm", 4, 0, 1, HOUSE,
				BuildCost.UNBUILDABLE, EntryCost.FREE);
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
