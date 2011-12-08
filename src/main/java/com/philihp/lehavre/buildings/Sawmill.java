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
 * build 1 building that requires wood for building for 1 fewer wood
 * 
 * @author Philihp
 */
public class Sawmill extends Building {

	public Sawmill(BoardState board) {
		super(board, "02", "Sawmill", 14, 0, 0, INDUSTRY, BuildCost.is().clay(1)
				.iron(1), EntryCost.FREE);
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return mode == GameMode.LONG
				&& count.ordinal() >= PlayerCount.THREE.ordinal();
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		if(mode == GameMode.SHORT) {
			switch(count) {
			case ONE:
				return true;
			case TWO:
				return false;
			case THREE:
				return false;
			case FOUR:
				return true;
			case FIVE:
				return true;
			}
		}
		return false;
	}

}
