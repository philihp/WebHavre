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
 * 3 energy per loaded ship... meat 2c smoked fish 2c charcoal 2c hides 2c brick
 * 2c iron 2c cattle 3c bread 3c coal 3c leather 4c coke 5c steel 8c other 1c
 * 
 * wood holds 3, iron holds 4, steel holds 5
 * 
 * @author Philihp
 */
public class ShippingLine extends Building {

	public ShippingLine(BoardState board) {
		super(board, "18", "Shipping Line", 10, 1, 0, OFFICE, BuildCost.is()
				.wood(2).brick(3), EntryCost.is(2));
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
