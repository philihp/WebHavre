package com.philihp.lehavre.buildings;

public enum BuildingEnum {
	
	B01(BuildingFirmA.class),
	B02(BuildingFirmB.class),
	B03(ConstructionFirm.class),
	_01(Marketplace.class),
	_02(Sawmill.class),
	_03(Fishery.class),
	_04(Joinery.class),
	_05(Bakehouse.class),
	_06(HardwareStore.class),
	_07(CharcoalKiln.class),
	_08(Smokehouse.class),
	_09(Abattoir.class),
	_10(ClayMound.class),
	_11(ArtsCentre.class),
	_12(WharfA.class),
	_13(BlackMarket.class),
	_14(Brickworks.class),
	_15(LocalCourt.class),
	_16(Colliery.class),
	_17(WharfB.class),
	_18(ShippingLine.class),
	_19(GroceryMarket.class),
	_20(Tannery.class),
	_21(BusinessOffice.class),
	_22(Ironworks.class),
	_23(SteelMill.class),
	_24(Storehouse.class),
	_25(Cokery.class),
	_26(Dock.class),
	_27(BridgeOverTheSeine.class),
	_28(TownHall.class),
	_29(Bank.class),
	_30(Church.class);
	
	Class<? extends Building> clazz;
	BuildingEnum(Class<? extends Building> clazz) {
		this.clazz = clazz;
	}

}
