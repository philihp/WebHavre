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

public class FourPlayerShortGame {
	
	public static final GameMode MODE = GameMode.SHORT;
	public static final PlayerCount COUNT = PlayerCount.FOUR;
	
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
		assertEquals(ShipEnum.S01, deck[i++].identity);
		assertEquals(ShipEnum.S02, deck[i++].identity);
		assertEquals(ShipEnum.S04, deck[i++].identity);
		assertEquals(ShipEnum.S06, deck[i++].identity);
		assertEquals(ShipEnum.S07, deck[i++].identity);
		assertEquals(ShipEnum.S09, deck[i++].identity);
		assertEquals(ShipEnum.S10, deck[i++].identity);
		assertEquals(ShipEnum.S13, deck[i++].identity);
		assertEquals(ShipEnum.S15, deck[i++].identity);
		assertEquals(ShipEnum.S16, deck[i++].identity);
		assertEquals(ShipEnum.S19, deck[i++].identity);
		assertEquals(ShipEnum.S20, deck[i++].identity);
		assertEquals(i, deck.length);
	}
	
}
