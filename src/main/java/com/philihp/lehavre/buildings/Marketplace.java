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
 * take 2 standard goods (including hides and coal) +1 additional different good
 * per house. look at the top 2 special buildings and return them in any order.
 * build 1 or 2 buildings
 * 
 * @author Philihp
 */
public class Marketplace extends Building {

	public Marketplace(BoardState board) {
		super(board, "01", "Marketplace", 6, 0, 0, null, BuildCost.is().wood(2),
				EntryCost.is(2).or(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		if(mode == GameMode.LONG) {
			return true;
		}
		else /*(mode == GameMode.SHORT)*/ {
			return count.ordinal() >= PlayerCount.THREE.ordinal();
		}
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		return mode == GameMode.SHORT
				&& count.ordinal() <= PlayerCount.TWO.ordinal();
	}

}
