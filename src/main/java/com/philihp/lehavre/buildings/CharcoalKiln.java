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
 * wood --> charcoal
 * 
 * @author Philihp
 */
public class CharcoalKiln extends Building {

	public CharcoalKiln(BoardState board) {
		super(board, "07", "Charcoal Kiln", 8, 0, 0, HOUSE, BuildCost.is().clay(1),
				EntryCost.FREE);
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
