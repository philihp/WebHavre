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
 * 1 cattle, 1 meat, 1 fish, 1 smoked fish, 1 grain, 1 bread
 * 
 * @author Philihp
 */
public class GroceryMarket extends Building {

	public GroceryMarket(BoardState board) {
		super(board, "19", "Grocery Market", 10, 0, 0, OFFICE, BuildCost.is()
				.wood(1).brick(1), EntryCost.is(0).and(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if (mode == GameMode.LONG) {
			return count.ordinal() >= PlayerCount.THREE.ordinal();
		} else /* if mode == LONG */{
			return count == PlayerCount.FIVE;
		}
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}
}
