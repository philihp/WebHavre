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
 * cattle -> meat and 1/2 hides
 * 
 * @author Philihp
 */
public class Abattoir extends Building {

	public Abattoir(BoardState board) {
		super(board, "09", "Abbatoir", 8, 0, 0, HOUSE, BuildCost.is().clay(1)
				.wood(1).iron(1), EntryCost.is(0).and(2));
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
