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
 * 4 standard goods --1x--> steel
 * additionally
 * 1 good --1x--> charcoal or leather or brick
 * 
 * @author Philihp
 */
public class BusinessOffice extends Building {

	public BusinessOffice(BoardState board) {
		super(board, "21", "Business Office", 12, 1, 1, OFFICE,
				BuildCost.is().wood(4).clay(1), EntryCost.is(0).and(1));
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
