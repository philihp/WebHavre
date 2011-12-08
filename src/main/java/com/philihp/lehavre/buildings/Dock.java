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
 * cost to buy: 24
 * 
 * value increases by 4 per ship (no building action)
 * 
 * @author Philihp
 */
public class Dock extends Building {

	public Dock(BoardState board) {
		super(board, "26", "Dock", 10, 0, 0, INDUSTRY, BuildCost.is()
				.wood(1).brick(2).iron(2), EntryCost.LOCKED);
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
