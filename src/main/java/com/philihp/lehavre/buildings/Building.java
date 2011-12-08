package com.philihp.lehavre.buildings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.philihp.lehavre.core.*;

public abstract class Building implements Comparable<Building> {

	protected BoardState board = null;

	protected PlayerState owner = null;
	
	protected PlayerState occupier = null;

	protected final String id;
	protected final String name;
	protected final int value;
	protected final int fishermen;
	protected final int hammers;
	protected final BuildingType type;
	protected final BuildCost buildCost;
	protected final EntryCost entryCost;

	public Building(BoardState board, String id, String name, int value, int fishermen,
			int hammers, BuildingType type, BuildCost buildCost, EntryCost entryCost) {
		this.board = board;
		this.id = id;
		this.name = name;
		this.value = value;
		this.fishermen = fishermen;
		this.hammers = hammers;
		this.type = type;
		this.buildCost = buildCost;
		this.entryCost = entryCost;
	}

	public boolean canBuild(PlayerState player) {
		return buildCost != BuildCost.UNBUILDABLE
			&& player.getWood() >= buildCost.getWood()
			&& player.getClay() >= buildCost.getClay()
			&& player.getBrick() >= buildCost.getBrick()
			&& player.getIron() >= buildCost.getIron()
			&& player.getSteel() >= buildCost.getSteel();
	}
	
	protected abstract boolean isUsed(GameMode mode, PlayerCount count);
	
	protected abstract boolean isStarting(GameMode mode, PlayerCount count);

	@Override
	public int compareTo(Building o) {
		return id.compareTo(o.id);
	}

	public static Building[] buildProposalDeck(GameMode mode,
			PlayerCount count, BoardState board) {
		List<Building> deck = new ArrayList<Building>();

		for (BuildingEnum b : BuildingEnum.values()) {
			try {
				Constructor<? extends Building> constructor = b.clazz.getDeclaredConstructor(BoardState.class);
				Building building = constructor.newInstance(board);
				if (building.isUsed(mode, count)) {
					deck.add(building);
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return deck.toArray(new Building[0]);
	}

	public static Building[] buildInitials(GameMode mode,
			PlayerCount count, BoardState board) {
		List<Building> deck = new ArrayList<Building>();

		for (BuildingEnum b : BuildingEnum.values()) {
			try {
				Constructor<? extends Building> constructor = b.clazz.getDeclaredConstructor(BoardState.class);
				Building building = constructor.newInstance(board);
				if (building.isStarting(mode, count)) {
					deck.add(building);
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return deck.toArray(new Building[0]);
	}
	
}
