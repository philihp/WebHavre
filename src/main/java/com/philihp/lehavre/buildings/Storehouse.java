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
 * cost to buy: 10
 * 
 * at end of game, value increases 1/2 coin per level 1 good and per level 2
 * good (no building action)
 * 
 * @author Philihp
 */
public class Storehouse extends Building {

	public Storehouse(BoardState board) {
		super(board, "24", "Storehouse", 4, 0, 1, OFFICE, BuildCost.is()
				.wood(2).brick(2), EntryCost.LOCKED);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if(mode == GameMode.SHORT) {
			return count == PlayerCount.FIVE;
		}
		else /* mode == GameMode.LONG */ {
			return count.ordinal() >= PlayerCount.FOUR.ordinal();
		}
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		// TODO Auto-generated method stub
		return false;
	}
}
