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
 * build 1 or 2 buildings
 * 
 * @author Philihp
 */
public class ConstructionFirm extends Building {

	public ConstructionFirm(BoardState board) {
		super(board, "B3", "Construction Firm", 8, 0, 1, INDUSTRY,
				BuildCost.UNBUILDABLE, EntryCost.is(2));
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
