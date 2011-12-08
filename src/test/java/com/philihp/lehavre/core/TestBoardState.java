package com.philihp.lehavre.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.philihp.lehavre.buildings.Building;

public class TestBoardState {

	private BoardState state = null;

	@Before
	public void setUp() throws Exception {
		state = new BoardState(GameMode.LONG, PlayerCount.FOUR);
	}

	@Test
	public void testBoardState() {
		assertNotNull(state.proposals1);
		assertNotNull(state.proposals2);
		assertNotNull(state.proposals3);
		assertTrue(state.proposals1.size() == state.proposals2
				.size());
		assertTrue(state.proposals2.size() == state.proposals3
				.size());
	}

}
