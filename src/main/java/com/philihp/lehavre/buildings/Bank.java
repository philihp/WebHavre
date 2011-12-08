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
 * cost to buy: 40, value increases 3 per industry and 2 per office
 * 
 * @author Philihp
 */
public class Bank extends Building {

	public Bank(BoardState board) {
		super(board, "29", "Bank", 16, 0, 0, OFFICE, BuildCost.is().brick(4)
				.steel(3), EntryCost.LOCKED);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return count.ordinal() >= PlayerCount.TWO.ordinal();
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}

}
