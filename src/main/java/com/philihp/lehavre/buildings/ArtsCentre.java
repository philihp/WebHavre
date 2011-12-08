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
 * 4 coins per other player in your buildings
 * 
 * @author Philihp
 */
public class ArtsCentre extends Building {

	public ArtsCentre(BoardState board) {
		super(board, "11", "Arts Centre", 10, 1, 0, CIVIC,
				BuildCost.is().clay(2).wood(1), EntryCost.is(1));
	}

	@Override
	protected boolean isUsed(GameMode mode, PlayerCount count) {
		return (mode == GameMode.LONG && count.ordinal() >= PlayerCount.FOUR.ordinal());
	}

	@Override
	protected boolean isStarting(GameMode mode, PlayerCount count) {
		// TODO Auto-generated method stub
		return false;
	}

}
