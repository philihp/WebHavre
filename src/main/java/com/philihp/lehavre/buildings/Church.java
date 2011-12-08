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
 * cannot be bought
 * 
 * 5 bread 2 fish --1x--> 10 bread 5 fish
 * 
 * @author Philihp
 */
public class Church extends Building {

	public Church(BoardState board) {
		super(board, "30", "Church", 26, 0, 0, CIVIC, BuildCost.is().wood(5)
				.brick(3).iron(1), EntryCost.FREE);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if (mode == GameMode.LONG) {
			return count.ordinal() >= PlayerCount.TWO.ordinal();
		} else /* if mode == SHORT */{
			return count == PlayerCount.FIVE;
		}
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}

}
