package com.philihp.lehavre.ships;

import static com.philihp.lehavre.ships.ShipType.*;
import static com.philihp.lehavre.ships.SpecialBuildEnum.*;
import static com.philihp.lehavre.core.PlayerCount.*;

import com.philihp.lehavre.core.GameMode;
import com.philihp.lehavre.core.PlayerCount;

public enum ShipEnum {

	S01(2, 14, WOOD, true, 0x1F07, 
			new SpecialBuildEnum[] { DRAWSPECIAL, null, null, null, null },
			new int[] { 5, 3, 2, 1, 0 }),
  S02(2, 14, WOOD, true, 0x0F0F,
			new SpecialBuildEnum[] { null, BUILDTOWN, BUILDTOWN, null, null },
			new int[] { 0, 4, 3, 1, 1}),
	S03(2, 14, WOOD, false, 0x0705,  
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 0, 2, 2, 1}),
	S04(4, 14, WOOD, true, 0x1F13,
			new SpecialBuildEnum[] { BUILDTOWN, DRAWSPECIAL, DRAWSPECIAL, BUILDTOWN, BUILDTOWN, BUILDTOWN },
			new int[] { 10, 5, 3, 2, 1}),
	S05(4, 14, WOOD, true, 0x0F0C, 
			new SpecialBuildEnum[] { null, null, null, DRAWSPECIAL, DRAWSPECIAL },
			new int[] { 0, 7, 4, 2, 1}),
	S06(2, 20, IRON, false, 0x0707,  
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 0, 5, 3, 2}),
	S07(6, 14, WOOD, true, 0x0F0F,  
			new SpecialBuildEnum[] { null, BUILDTOWN, BUILDTOWN, BUILDTOWN, BUILDTOWN },
			new int[] { 0, 9, 6, 3, 2}),
	S08(4, 20, IRON, true, 0x0F00,  
			new SpecialBuildEnum[] { null, DRAWSPECIAL, DRAWSPECIAL, DRAWSPECIAL, DRAWSPECIAL },
			new int[] { 0, 11, 7, 4, 2}),
	S09(6, 14, WOOD, false, 0x0303,  
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 0, 0, 4, 2}),
	S10(6, 20, IRON, true, 0x1F0F, 
			new SpecialBuildEnum[] { DRAWSPECIAL, null, null, BUILDTOWN, BUILDTOWN },
			new int[] { 15, 13, 8, 5, 3}),
	S11(8, 20, IRON, true, 0x0F0C, 
			new SpecialBuildEnum[] { null, BUILDTOWN, null, DRAWSPECIAL, DRAWSPECIAL },
			new int[] { 0, 15, 9, 5, 3}),
	S12(10, 30, STEEL, false, 0x0705, 
			new SpecialBuildEnum[] { null, null, BUILDTOWN, null, null },
			new int[] { 0, 0, 10, 6, 3}),
	S13(10, 20, IRON, true, 0x1F13,
			new SpecialBuildEnum[] { BUILDTOWN, DRAWSPECIAL, DRAWSPECIAL, BUILDTOWN, BUILDTOWN },
			new int[] { 20, 16, 11, 7, 4 }),
	S14(16, 30, STEEL, true, 0x1F0C, 
			new SpecialBuildEnum[] { DRAWSPECIAL, null, null, DRAWSPECIAL, DRAWSPECIAL },
			new int[] { 25, 17, 12, 8, 4}),
	S15(12, 20, IRON, false, 0x0303, 
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 0, 0, 9, 4}),
	S16(20, 30, STEEL, true, 0x1F1B, 
			new SpecialBuildEnum[] { BUILDTOWN, BUILDTOWN, BUILDTOWN, BUILDTOWN, BUILDTOWN },
			new int[] { 30, 18, 13, 10, 5}),
	S17(24, 20, STEEL, true, 0x0F00, 
			new SpecialBuildEnum[] { null, DRAWSPECIAL, DRAWSPECIAL, DRAWSPECIAL, DRAWSPECIAL },
			new int[] { 0, 19, 14, 10, 5}),
	S18(38, null, LUXURY, false, 0x0705, 
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 0, 14, 11, 5}),
	S19(34, null, LUXURY, true, 0x0F03, 
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 0, 20, 15, 11, 6}),
	S20(30, null, LUXURY, true, 0x1F1F, 
			new SpecialBuildEnum[] { null, null, null, null, null },
			new int[] { 35, 20, 15, 11, 6});
			
	int shipValue;
	Integer cost;
	ShipType type;
	PlayerCount longGameBitmask;
	int usedInGameBitmask;
	boolean harvest;
	SpecialBuildEnum[] specialBuild;
	int[] requiredFood;
	ShipEnum(int shipValue, Integer cost, ShipType type, boolean harvest, int usedInGameBitmask, 
			SpecialBuildEnum[] specialBuild, int[] requiredFood) {
		this.shipValue = shipValue;
		this.cost = cost;
		this.type = type;
		this.harvest = harvest;
		this.usedInGameBitmask = usedInGameBitmask;
		this.specialBuild = new SpecialBuildEnum[specialBuild.length];
		System.arraycopy(specialBuild, 0, this.specialBuild, 0, specialBuild.length);
		this.requiredFood = new int[requiredFood.length];
		System.arraycopy(requiredFood, 0, this.requiredFood, 0, requiredFood.length);
	}
	
	public boolean usedInGame(GameMode mode, PlayerCount count) {
		int mask = 0x1000;
		if(mode == GameMode.SHORT) mask >>= 8;
		mask >>= count.ordinal();
		return (usedInGameBitmask & mask) != 0;
	}
	
	public int getRequiredFood(PlayerCount count) {
		return requiredFood[count.ordinal()];
	}
	
	@Override
	public String toString() {
		return name()+"["+type+","+shipValue+"]";
	}
	
}
