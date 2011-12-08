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
 * level 1 good * 3 --> 1 coin; level 2 good --> 1 coin
 * 
 * @author Philihp
 */
public class BridgeOverTheSeine extends Building {

	public BridgeOverTheSeine(BoardState board) {
		super(board, "27", "Bridge over the Seine", 16, 0, 0, null, BuildCost.is()
				.iron(3), EntryCost.is(0).and(2));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return count.ordinal() >= PlayerCount.THREE.ordinal();
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return false;
	}

}
