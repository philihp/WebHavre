package com.philihp.lehavre.ships;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	OnePlayerShortGame.class,
	OnePlayerLongGame.class,
	TwoPlayerShortGame.class,
	TwoPlayerLongGame.class,
	ThreePlayerShortGame.class,
	ThreePlayerLongGame.class,
	FourPlayerShortGame.class,
	FourPlayerLongGame.class,
	FivePlayerShortGame.class,
	FivePlayerLongGame.class
})
public class TestShipDeckSuite {
	//this stays empty
}
