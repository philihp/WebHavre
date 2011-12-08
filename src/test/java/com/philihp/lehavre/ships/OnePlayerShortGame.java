package com.philihp.lehavre.ships;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.philihp.lehavre.core.BoardState;
import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;

public class OnePlayerShortGame {
	
	public static final GameMode MODE = GameMode.SHORT;
	public static final PlayerCount COUNT = PlayerCount.ONE;
	
	public static BoardState board;

	@Before
	public void oneTimeSetUp() {
		board = new BoardState(MODE,COUNT);
	}
	
	@Test
	public void testShipDeck() {
		Ship[] deck = Ship.buildShipDeck(board);
		assertNotNull(deck);
		int i = 0;
		assertEquals(ShipEnum.S04, deck[i++].identity);
		assertEquals(ShipEnum.S13, deck[i++].identity);
		assertEquals(ShipEnum.S16, deck[i++].identity);
		assertEquals(ShipEnum.S20, deck[i++].identity);
		assertEquals(i, deck.length);
	}
	
}
