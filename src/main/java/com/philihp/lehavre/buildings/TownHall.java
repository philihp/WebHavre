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
 * cost to buy: 30,
 * value increases 4 per civic and 2 per house
 * 
 * @author Philihp
 */
public class TownHall extends Building {

	public TownHall(BoardState board) {
		super(board, "28", "Town Hall", 6, 0, 0, CIVIC,
				BuildCost.is().wood(4).brick(3), EntryCost.LOCKED);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if(mode == GameMode.LONG) {
			return count.ordinal() >= PlayerCount.TWO.ordinal();
		}
		else /* if mode == SHORT */ {
			return count == PlayerCount.FIVE;
		}
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}


}
