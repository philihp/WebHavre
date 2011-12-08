package com.philihp.lehavre.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.philihp.lehavre.buildings.Building;
import com.philihp.lehavre.ships.Ship;
import com.philihp.lehavre.ships.ShipEnum;
import com.philihp.lehavre.ships.ShipType;

public class BoardState {

	protected PlayerState[] players = null;
	protected GameMode gameMode;
	protected PlayerCount playerCount;

	protected List<Building> specialBuildingDeck;
	protected List<Building> proposals1;
	protected List<Building> proposals2;
	protected List<Building> proposals3;
	protected List<Building> townOwnedBuildings;
	protected List<Ship> undrawnShips;
	protected Map<ShipType,List<Ship>> shipStacks;
	protected int coinOffer;
	protected int fishOffer;
	protected int woodOffer;
	protected int clayOffer;
	protected int ironOffer;
	protected int grainOffer;
	protected int cattleOffer;

	protected TurnTile[] turnTiles = new TurnTile[7];

	public BoardState(GameMode gameMode, PlayerCount playerCount) {
		this.gameMode = gameMode;
		this.playerCount = playerCount;
		setupTurnTiles();
		setupPlayers();
		setupTownOwnedBuildings();
		setupBuildingProposals();
		setupInitialOffers();
		for(PlayerState player : players) {
			setupInitialPlayerState(player);
		}
		setupShips();
	}
	
	private void setupShips() {
		shipStacks = new EnumMap<ShipType, List<Ship>>(ShipType.class);
		for(ShipType shipType : ShipType.values()) {
			shipStacks.put(shipType, new ArrayList<Ship>());
		}
		undrawnShips = Arrays.asList(Ship.buildShipDeck(this));
	}

	private void setupPlayers() {
		players = new PlayerState[playerCount.ordinal() + 1];
		for (int i = 0; i < players.length; i++) {
			players[i] = new PlayerState(this);
		}
	}

	private void setupTurnTiles() {
		List<TurnTile> deck = Arrays.asList(TurnTile.values());
		Collections.shuffle(deck);
		turnTiles = deck.toArray(new TurnTile[0]);
	}

	private void setupTownOwnedBuildings() {
		townOwnedBuildings = new ArrayList<Building>(Arrays.asList(Building
				.buildInitials(gameMode, playerCount, this)));
	}

	private void setupBuildingProposals() {
		List<Building> allProposals = Arrays.asList(Building
				.buildProposalDeck(gameMode, playerCount, this));
		Collections.shuffle(allProposals);
		int deckSize = allProposals.size() / 3;
		proposals1 = new ArrayList<Building>(allProposals.subList(0, deckSize));
		proposals2 = new ArrayList<Building>(allProposals.subList(deckSize,
				deckSize * 2));
		proposals3 = new ArrayList<Building>(allProposals.subList(deckSize * 2,
				allProposals.size()));
		Collections.sort(proposals1);
		Collections.sort(proposals2);
		Collections.sort(proposals3);
	}

	private void setupInitialOffers() {
		if (gameMode == GameMode.SHORT) {
			coinOffer = 3;
			fishOffer = 3;
			woodOffer = 3;
			clayOffer = 2;
			ironOffer = 1;
			grainOffer = 1;
			cattleOffer = 1;
		} else /* (gameMode == GameMode.LONG) */{
			coinOffer = 2;
			fishOffer = 2;
			woodOffer = 2;
			clayOffer = 1;
			ironOffer = 0;
			grainOffer = 0;
			cattleOffer = 0;
		}
	}

	private void setupInitialPlayerState(PlayerState player) {
		if (gameMode == GameMode.SHORT) {
			player.setLoans(0);
			player.setCoins(5);
			player.setFish(2);
			player.setWood(2);
			player.setClay(2);
			player.setIron(2);
			player.setWheat(0);
			player.setCattle(1);
			player.setHides(2);
			player.setCoal(2);
			player.setSmokedFish(0);
			player.setCharcoal(0);
			player.setBrick(0);
			player.setSteel(0);
			player.setBread(0);
			player.setMeat(0);
			player.setLeather(0);
			player.setCoke(0);
		} else /* (gameMode == GameMode.LONG) */{
			player.setLoans(0);
			player.setCoins(5);
			player.setFish(0);
			player.setWood(0);
			player.setClay(0);
			player.setIron(0);
			player.setWheat(0);
			player.setCattle(0);
			player.setHides(0);
			player.setCoal(1);
			player.setSmokedFish(0);
			player.setCharcoal(0);
			player.setBrick(0);
			player.setSteel(0);
			player.setBread(0);
			player.setMeat(0);
			player.setLeather(0);
			player.setCoke(0);
		}
	}

	public void payInterest() {
		for (PlayerState player : players) {
			player.payInterest();
		}
	}
	
	public GameMode getGameMode() {
		return gameMode;
	}
	public PlayerCount getPlayerCount() {
		return playerCount;
	}

}