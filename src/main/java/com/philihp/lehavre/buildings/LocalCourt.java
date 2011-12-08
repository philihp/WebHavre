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
 * if you have 1 loan, return it.
 * if you have 2 loans, return 1 and take 2 francs.
 * if you have 3 or more, return of them.
 * 
 * @author Philihp
 */
public class LocalCourt extends Building {

	public LocalCourt(BoardState board) {
		super(board, "15", "Local Court", 16, 0, 0, CIVIC,
				BuildCost.is().wood(3).clay(2), EntryCost.FREE);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if(mode == GameMode.LONG) {
			return count.ordinal() >= PlayerCount.THREE.ordinal();
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
