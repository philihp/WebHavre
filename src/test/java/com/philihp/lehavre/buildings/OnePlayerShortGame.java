package com.philihp.lehavre.buildings;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;

public class OnePlayerShortGame {
	
	public static final GameMode MODE = GameMode.SHORT;
	public static final PlayerCount COUNT = PlayerCount.ONE;

	@Test
	public void testGetStartingBuildingsFor() {
		Building[] deck = Building.buildInitials(MODE, COUNT, null);
		assertNotNull(deck);
		int i = 0;
		assertTrue(deck[i++] instanceof BuildingFirmA);
		assertTrue(deck[i++] instanceof BuildingFirmB);
		assertTrue(deck[i++] instanceof ConstructionFirm);
		assertTrue(deck[i++] instanceof Marketplace);
		assertTrue(deck[i++] instanceof Sawmill);
		assertTrue(deck[i++] instanceof BlackMarket);
		assertEquals(i, deck.length);
	}
	
}
