package com.philihp.lehavre.buildings;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;

public class TwoPlayerLongGame {
	
	public static final GameMode MODE = GameMode.LONG;
	public static final PlayerCount COUNT = PlayerCount.TWO;

	@Test
	public void testGetBuildingsProposalsFor() {
		Building[] deck = Building.buildProposalDeck(MODE, COUNT, null);
		assertNotNull(deck);
		int i = 0;
		assertTrue(deck[i++] instanceof Marketplace);
		//assertTrue(deck[i++] instanceof Sawmill);
		assertTrue(deck[i++] instanceof Fishery);
		//assertTrue(deck[i++] instanceof Joinery);
		assertTrue(deck[i++] instanceof Bakehouse);
		//assertTrue(deck[i++] instanceof HardwareStore);
		assertTrue(deck[i++] instanceof CharcoalKiln);
		assertTrue(deck[i++] instanceof Smokehouse);
		assertTrue(deck[i++] instanceof Abattoir);
		assertTrue(deck[i++] instanceof ClayMound);
		//assertTrue(deck[i++] instanceof ArtsCentre);
		assertTrue(deck[i++] instanceof WharfA);
		//assertTrue(deck[i++] instanceof BlackMarket);
		assertTrue(deck[i++] instanceof Brickworks);
		//assertTrue(deck[i++] instanceof LocalCourt);
		assertTrue(deck[i++] instanceof Colliery);
		//assertTrue(deck[i++] instanceof WharfB);
		assertTrue(deck[i++] instanceof ShippingLine);
		//assertTrue(deck[i++] instanceof GroceryMarket);
		assertTrue(deck[i++] instanceof Tannery);
		//assertTrue(deck[i++] instanceof BusinessOffice);
		assertTrue(deck[i++] instanceof Ironworks);
		assertTrue(deck[i++] instanceof SteelMill);
		//assertTrue(deck[i++] instanceof Storehouse);
		assertTrue(deck[i++] instanceof Cokery);
		//assertTrue(deck[i++] instanceof Dock);
		//assertTrue(deck[i++] instanceof BridgeOverTheSeine);
		assertTrue(deck[i++] instanceof TownHall);
		assertTrue(deck[i++] instanceof Bank);
		assertTrue(deck[i++] instanceof Church);
		assertEquals(i, deck.length);
	}

	@Test
	public void testGetStartingBuildingsFor() {
		Building[] deck = Building.buildInitials(MODE, COUNT, null);
		assertNotNull(deck);
		int i = 0;
		assertTrue(deck[i++] instanceof BuildingFirmA);
		assertTrue(deck[i++] instanceof BuildingFirmB);
		assertTrue(deck[i++] instanceof ConstructionFirm);
		assertEquals(i, deck.length);
	}
}