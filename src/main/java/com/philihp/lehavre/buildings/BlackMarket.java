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
 * take 2 tokens of each type whose offer space is empty (including coins)
 * 
 * @author Philihp
 */
public class BlackMarket extends Building {

	public BlackMarket(BoardState board) {
		super(board, "13", "Black Market", 2, 0, 0, null,
				BuildCost.UNBUILDABLE, EntryCost.is(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return mode == GameMode.LONG && count.ordinal() >= PlayerCount.THREE.ordinal();
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return mode == GameMode.SHORT && count == PlayerCount.ONE;
	}
}
