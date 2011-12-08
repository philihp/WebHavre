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
 * 5 energy per iron, iron --> steel
 * 
 * @author Philihp
 */
public class SteelMill extends Building {

	public SteelMill(BoardState board) {
		super(board, "23", "Steel Mill", 22, 0, 0, INDUSTRY,
				BuildCost.is().brick(4).iron(2), EntryCost.is(0).and(2));
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
