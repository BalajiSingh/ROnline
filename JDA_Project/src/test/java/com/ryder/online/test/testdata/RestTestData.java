package com.ryder.online.test.testdata;

import com.ryder.online.utility.RandomNumberGenerator;

public class RestTestData {

	public String SyncSellableItemPayload(String vehicleId) {

		String body = "{\n" + "   \"CatalogId\":\"UsedVehicles\",\n" + "   \"Id\":" + "\"" + vehicleId + "\"" + ",\n"
				+ "   \"Name\":" + "\"" + "AUT_NEW_" + vehicleId + "\"" + ",\n" + "   \"CategoryId\":\"140\",\n"
				+ "   \"SamClass\":\"140\",\n" + "   \"Status\":\"AVAILABLE\",\n" + "   \"DisplayName\":" + "\""
				+ "AUT_NEW_" + vehicleId + "\"" + ",\n" + "   \"Checksum\":\"0x06F4B27D30A8A2AFF6077DB27899514C\",\n"
				+ "   \"Features\":{\n" + "      \"AirConditioner\":\"YES\",\n" + "      \"AirFairings\":\"FULL\",\n"
				+ "      \"AirRideCab\":true,\n" + "      \"AirRideSlidingRearAxle\":null,\n"
				+ "      \"AirRideSpreadAxle\":null,\n" + "      \"AllAluminium\":null,\n"
				+ "      \"AluminiumFuelTanks\":null,\n" + "      \"AluminiumWheels\":null,\n" + "      \"Apu\":null,\n"
				+ "      \"BellyBox\":null,\n" + "      \"BodyHeight\": 54,\n" + "      \"BodyLength\":43,\n"
				+ "      \"BodyManufacturer\":null,\n" + "      \"BodyModel\":null,\n" + "      \"BodyType\":null,\n"
				+ "      \"BodyWidth\":12,\n" + "      \"BreakType\":\"AIR\",\n" + "      \"CabAndChassisOnly\":null,\n"
				+ "      \"CabToAxle\":null,\n" + "      \"ChassisType\":\"N/A\",\n" + "      \"ColdPlate\":null,\n"
				+ "      \"Color\":\"WHITE\",\n" + "      \"CurbSideDoor\":null,\n"
				+ "      \"CurtainSideDoor\":null,\n" + "      \"DoubleBunk\":null,\n"
				+ "      \"DoubleSideDoor\":null,\n" + "      \"DropDeck\":null,\n"
				+ "      \"ElectricStandBy\":null,\n" + "      \"EngineBrake\":false,\n"
				+ "      \"EngineBrakeType\":null,\n" + "      \"EngineHorsePower\":null,\n"
				+ "      \"EngineManufacturer\":\"DETR\",\n" + "      \"EngineModel\":\"DD15AT'13 455/1800\",\n"
				+ "      \"Etrac\":null,\n" + "      \"Extended\":null,\n" + "      \"ExtendedVan\":null,\n"
				+ "      \"FifthWheelType\":\"AIR SLIDE\",\n" + "      \"FixedTandem\":null,\n"
				+ "      \"FloorType\":null,\n" + "      \"FuelType\":\"DIESEL\",\n" + "      \"GearRatio\":2,\n"
				+ "      \"GVW\":76540,\n" + "      \"Headboard\":null,\n" + "      \"InsulatedBody\":null,\n"
				+ "      \"LiftGate\":\"NO\",\n" + "      \"LiftGateModel\":null,\n" + "      \"LiftGateType\":null,\n"
				+ "      \"LiterEngine\":15,\n" + "      \"LogisticPosts\":null,\n"
				+ "      \"ManufacturerCode\":\"FRTL\",\n" + "      \"ManufacturerName\":\"FREIGHTLINER\",\n"
				+ "      \"Model\":\"CASCADIA 125\",\n" + "      \"MultiTemp\":null,\n"
				+ "      \"OdometerReading\":null,\n" + "      \"OdometerReadingRange\":\"600,001 - 700,000 MI.\",\n"
				+ "      \"OdometerReadingRangeAsis\":null,\n" + "      \"OdometerReadingRangeSpecialized\":null,\n"
				+ "      \"OdometerReadingUnitCode\":\"MI\",\n" + "      \"ProductStatus\":\"AVAILABLE-FOR-SALE\",\n"
				+ "      \"PlywoodLining\":null,\n" + "      \"PowerLocks\":\"YES\",\n"
				+ "      \"PowerMirrors\":\"YES\",\n" + "      \"PowerWindows\":\"YES\",\n"
				+ "      \"ProductCode\": 332037,\n" + "      \"ProductName\":\"VEHICLE\",\n"
				+ "      \"ProductSubtypeCode\":140,\n" + "      \"ProductSubtypeName\":\"T/A TRACTORS\",\n"
				+ "      \"ProductTypeCode\":9,\n" + "      \"ProductTypeName\":\"TRACTOR\",\n"
				+ "      \"PtoPump\":false,\n" + "      \"Ramp\":null,\n" + "      \"RearAxleManufacturer\":\"ROCK\",\n"
				+ "      \"RearAxleModel\":\"ME20-165\",\n" + "      \"RearAxleType\":\"TANDEM AXLE\",\n"
				+ "      \"RearDoorType\":null,\n" + "      \"RefeerEngineHours\":null,\n"
				+ "      \"RefrigeratorManufacturer\":null,\n" + "      \"RefrigeratorModel\":null,\n"
				+ "      \"RoadReadyPackage\":null,\n" + "      \"RoadSideDoor\":null,\n" + "      \"SeatType\":null,\n"
				+ "      \"SideGate\":null,\n" + "      \"SideKitTarp\":null,\n" + "      \"SingleFuelTank\":false,\n"
				+ "      \"SleeperSize\":10,\n" + "      \"SleeperSizeType\":null,\n"
				+ "      \"SpecialEquipmentCategoryCode\":null,\n" + "      \"SpecialEquipmentCategoryName\":null,\n"
				+ "      \"SteelConstruction\":null,\n" + "      \"SupplierName\":\"RYDER\",\n"
				+ "      \"SuspensionManufacturer\":\"FRTL\",\n" + "      \"SuspensionModel\":\"AIRLINER 40,000\",\n"
				+ "      \"SuspensionType\":\"AIR RIDE\",\n" + "      \"Tier\":\"RYDER CERTIFIED™\",\n"
				+ "      \"TranslucentRoof\":null,\n" + "      \"TransmissionManufacturer\":\"EATN\",\n"
				+ "      \"TransmissionModel\":\"DT12-DA-1750HD\",\n" + "      \"TransmissionSpeeds\":null,\n"
				+ "      \"TransmissionType\":\"AUTO\",\n" + "      \"VinNumber\":\"3AKGGED53FSGG8939\",\n"
				+ "      \"WetKit\":false,\n" + "      \"WheelBase\":87,\n" + "      \"WheelPlan\":null,\n"
				+ "      \"WheelType\":\"ALUMINUM\",\n" + "      \"WoodSlats\":null,\n" + "      \"Year\":2018,\n"
				+ "      \"CityName\":\"DALLAS\",\n" + "      \"StateName\":\"TEXAS\"\n" + "   },\n"
				+ "   \"Images\":{\n"
				+ "      \"image1\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186.jpg\",\n"
				+ "      \"image2\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-1.jpg\",\n"
				+ "      \"image3\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-2.jpg\",\n"
				+ "      \"image4\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-3.jpg\"\n" + "   },\n"
				+ "   \"Prices\":{\n" + "      \"ListPrice\":32495\n" + "   }\n" + "}";
		// System.out.println(body);
		return body;
	}

	public String composerTemplatePayload() {
		String body = "[\r\n" + "    {\r\n" + "        \"Id\": \"Entity-ComposerTemplate-ADDITIONALFEATURES\",\r\n"
				+ "        \"Version\": 2,\r\n" + "        \"EntityVersion\": 1,\r\n"
				+ "        \"Name\": \"ADDITIONALFEATURES\",\r\n"
				+ "        \"DisplayName\": \"ADDITIONAL FEATURES TEMPLATE\",\r\n"
				+ "        \"LinkedEntities\": [],\r\n" + "        \"Tags\": [\r\n" + "            {\r\n"
				+ "                \"Excluded\": false,\r\n" + "                \"Name\": \"120\",\r\n"
				+ "                \"Policies\": []\r\n" + "            }\r\n" + "        ],\r\n"
				+ "        \"ChildView\": {\r\n" + "            \"Name\": \"ADDITIONALFEATURES\",\r\n"
				+ "            \"DisplayName\": \"ADDITIONALFEATURES\",\r\n" + "            \"DisplayRank\": 0,\r\n"
				+ "            \"ItemId\": \"Composer-e933cd3039d44aca8f8d7e7aa3a130ac\",\r\n"
				+ "            \"EntityId\": \"\",\r\n" + "            \"EntityVersion\": 1,\r\n"
				+ "            \"Properties\": [\r\n" + "                {\r\n"
				+ "                    \"DisplayName\": \"SeatType\",\r\n"
				+ "                    \"Name\": \"SeatType\",\r\n"
				+ "                    \"OriginalType\": \"System.String\",\r\n"
				+ "                    \"RawValue\": \"\",\r\n" + "                    \"Value\": null,\r\n"
				+ "                    \"AvailableSelectionPolicy\": null\r\n" + "                }\r\n"
				+ "			]\r\n" + "        }\r\n" + "			}\r\n" + "			]";
		return body;
	}

	public String randomVehicleNumSyncSellablePayload(String randomNumber) {

		String body = "{\n" + "   \"CatalogId\":\"UsedVehicles\",\n" + "   \"Id\":" + "\"" + randomNumber + "\"" + ",\n"
				+ "   \"Name\":" + "\"" + "AUT_NEW_" + randomNumber + "\"" + ",\n" + "   \"CategoryId\":\"140\",\n"
				+ "   \"SamClass\":\"140\",\n" + "   \"Status\":\"AVAILABLE\",\n" + "   \"DisplayName\":" + "\""
				+ "AUT_NEW_" + randomNumber + "\"" + ",\n" + "   \"Checksum\":\"0x06F4B27D30A8A2AFF6077DB27899514C\",\n"
				+ "   \"Features\":{\n" + "      \"AirConditioner\":\"YES\",\n" + "      \"AirFairings\":\"FULL\",\n"
				+ "      \"AirRideCab\":true,\n" + "      \"AirRideSlidingRearAxle\":null,\n"
				+ "      \"AirRideSpreadAxle\":null,\n" + "      \"AllAluminium\":null,\n"
				+ "      \"AluminiumFuelTanks\":null,\n" + "      \"AluminiumWheels\":null,\n" + "      \"Apu\":null,\n"
				+ "      \"BellyBox\":null,\n" + "      \"BodyHeight\": 54,\n" + "      \"BodyLength\":43,\n"
				+ "      \"BodyManufacturer\":null,\n" + "      \"BodyModel\":null,\n" + "      \"BodyType\":null,\n"
				+ "      \"BodyWidth\":12,\n" + "      \"BreakType\":\"AIR\",\n" + "      \"CabAndChassisOnly\":null,\n"
				+ "      \"CabToAxle\":null,\n" + "      \"ChassisType\":\"N/A\",\n" + "      \"ColdPlate\":null,\n"
				+ "      \"Color\":\"WHITE\",\n" + "      \"CurbSideDoor\":null,\n"
				+ "      \"CurtainSideDoor\":null,\n" + "      \"DoubleBunk\":null,\n"
				+ "      \"DoubleSideDoor\":null,\n" + "      \"DropDeck\":null,\n"
				+ "      \"ElectricStandBy\":null,\n" + "      \"EngineBrake\":false,\n"
				+ "      \"EngineBrakeType\":null,\n" + "      \"EngineHorsePower\":null,\n"
				+ "      \"EngineManufacturer\":\"DETR\",\n" + "      \"EngineModel\":\"DD15AT'13 455/1800\",\n"
				+ "      \"Etrac\":null,\n" + "      \"Extended\":null,\n" + "      \"ExtendedVan\":null,\n"
				+ "      \"FifthWheelType\":\"AIR SLIDE\",\n" + "      \"FixedTandem\":null,\n"
				+ "      \"FloorType\":null,\n" + "      \"FuelType\":\"DIESEL\",\n" + "      \"GearRatio\":2,\n"
				+ "      \"GVW\":76540,\n" + "      \"Headboard\":null,\n" + "      \"InsulatedBody\":null,\n"
				+ "      \"LiftGate\":\"NO\",\n" + "      \"LiftGateModel\":null,\n" + "      \"LiftGateType\":null,\n"
				+ "      \"LiterEngine\":15,\n" + "      \"LogisticPosts\":null,\n"
				+ "      \"ManufacturerCode\":\"FRTL\",\n" + "      \"ManufacturerName\":\"FREIGHTLINER\",\n"
				+ "      \"Model\":\"CASCADIA 125\",\n" + "      \"MultiTemp\":null,\n"
				+ "      \"OdometerReading\":null,\n" + "      \"OdometerReadingRange\":\"600,001 - 700,000 MI.\",\n"
				+ "      \"OdometerReadingRangeAsis\":null,\n" + "      \"OdometerReadingRangeSpecialized\":null,\n"
				+ "      \"OdometerReadingUnitCode\":\"MI\",\n" + "      \"ProductStatus\":\"AVAILABLE-FOR-SALE\",\n"
				+ "      \"PlywoodLining\":null,\n" + "      \"PowerLocks\":\"YES\",\n"
				+ "      \"PowerMirrors\":\"YES\",\n" + "      \"PowerWindows\":\"YES\",\n" + "      \"ProductCode\":"
				+ randomNumber + ",\n" + "      \"ProductName\":\"VEHICLE\",\n" + "      \"ProductSubtypeCode\":140,\n"
				+ "      \"ProductSubtypeName\":\"T/A TRACTORS\",\n" + "      \"ProductTypeCode\":9,\n"
				+ "      \"ProductTypeName\":\"TRACTOR\",\n" + "      \"PtoPump\":false,\n" + "      \"Ramp\":null,\n"
				+ "      \"RearAxleManufacturer\":\"ROCK\",\n" + "      \"RearAxleModel\":\"ME20-165\",\n"
				+ "      \"RearAxleType\":\"TANDEM AXLE\",\n" + "      \"RearDoorType\":null,\n"
				+ "      \"RefeerEngineHours\":null,\n" + "      \"RefrigeratorManufacturer\":null,\n"
				+ "      \"RefrigeratorModel\":null,\n" + "      \"RoadReadyPackage\":null,\n"
				+ "      \"RoadSideDoor\":null,\n" + "      \"SeatType\":null,\n" + "      \"SideGate\":null,\n"
				+ "      \"SideKitTarp\":null,\n" + "      \"SingleFuelTank\":false,\n" + "      \"SleeperSize\":10,\n"
				+ "      \"SleeperSizeType\":null,\n" + "      \"SpecialEquipmentCategoryCode\":null,\n"
				+ "      \"SpecialEquipmentCategoryName\":null,\n" + "      \"SteelConstruction\":null,\n"
				+ "      \"SupplierName\":\"RYDER\",\n" + "      \"SuspensionManufacturer\":\"FRTL\",\n"
				+ "      \"SuspensionModel\":\"AIRLINER 40,000\",\n" + "      \"SuspensionType\":\"AIR RIDE\",\n"
				+ "      \"Tier\":\"RYDER CERTIFIED™\",\n" + "      \"TranslucentRoof\":null,\n"
				+ "      \"TransmissionManufacturer\":\"EATN\",\n" + "      \"TransmissionModel\":\"DT12-DA-1750HD\",\n"
				+ "      \"TransmissionSpeeds\":null,\n" + "      \"TransmissionType\":\"AUTO\",\n"
				+ "      \"VinNumber\":\"3AKGGED53FSGG8939\",\n" + "      \"WetKit\":false,\n"
				+ "      \"WheelBase\":87,\n" + "      \"WheelPlan\":null,\n" + "      \"WheelType\":\"ALUMINUM\",\n"
				+ "      \"WoodSlats\":null,\n" + "      \"Year\":2018,\n" + "      \"CityName\":\"DALLAS\",\n"
				+ "      \"StateName\":\"TEXAS\",\n" + "\"PhysicalLocationZipcode\":\"11735\"},\n" + "   \"Images\":{\n"
				+ "      \"image1\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186.jpg\",\n"
				+ "      \"image2\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-1.jpg\",\n"
				+ "      \"image3\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-2.jpg\",\n"
				+ "      \"image4\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/303186-3.jpg\"\n" + "   },\n"
				+ "   \"Prices\":{\n" + "      \"ListPrice\":32495\n" + "   }\n" + "}";
		System.out.println(body);
		return body;
	}

	public String setSellableStatusPayload(String vehicleId, String status) {
		String body = "{\n" + "  \"Id\": " + "\"" + vehicleId + "\"" + ",\n" + "  \"Status\": " + "\"" + status + "\""
				+ "\n" + "}";

		return body;
	}

	public String processETLPayload() {
		String body = "{\n"
				+ "    \"minionFullName\":\"Plugin.Ryder.Commerce.ChannelAdvisorSync.Minion.SyncProductToChannelAdvisorMinion, Plugin.Ryder.Commerce.ChannelAdvisorSync\",\n"
				+ "    \"environmentName\": \"HabitatMinions\"\n" + "}";

		return body;
	}

	public String syncCategoryPayload(String catelogId) {
		
		if (catelogId.equalsIgnoreCase("New Vehicles_")) {
			RandomNumberGenerator math = new RandomNumberGenerator();
			catelogId = catelogId + math.digit6RandomNumer();
		}
		
		String body = "{\n" + "        \"CatalogId\":" + "\"" + catelogId + "\"" + ",\n"
				+ "        \"ParentCategoryId\": \"\",\n" + "        \"CategoryId\": \"mytestcat\",\n"
				+ "        \"DisplayName\": \"mytestcat display name\",\n"
				+ "        \"Description\": \"mytestcat description\"\n" + " }";
		
		return body;
	}
	
	public String getQuerySalesForces(String value, String name) {
		String query = "SELECT "+value+" from Lead where email like '"+ name+"'";
		return query;

	}
}
