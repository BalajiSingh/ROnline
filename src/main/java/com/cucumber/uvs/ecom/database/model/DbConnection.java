package com.cucumber.uvs.ecom.database.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ryder.online.database.utility.DatabaseUtil;

public class DbConnection {

	String url = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;integratedSecurity=true;authenticationScheme=NativeAuthentication;";
	String url2 = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;integratedSecurity=true;";
	//String url = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;integratedSecurity=true;user=ryder\\appnetuser;password=Itride9697";
	//--------------------
	String username ="Ryder//madhu_golla@ryder.com";
	String password ="Ryder@123";
	String url5 = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;";
	//--------------------
	DatabaseUtil db;
	String tableName = "UVS_TRAN.dbo.PUBLISHER_FEED_0014";
	String columns1 = "[JsonDocument]\r\n" + "		                   ,[ApiLoadStatus]\r\n"
			+ "		                      ,ProductCode";
	String columns = "[JsonDocument]\r\n" + "		                   ,[ApiLoadStatus]\r\n"
			+ "		                      ,ProductCode,_created_datetime";

	public DbConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
		db = new DatabaseUtil(url, "", "");
	}

	public PreparedStatement insertingData(String vehicleId, String name, String displayName, String category)
			throws SQLException {
		String sql = "INSERT INTO " + tableName + "(" + columns1 + ")" + "VALUES(\n"
				+ "       '{\"CatalogId\":\"UsedVehicles\",\"Id\":" + "\"" + vehicleId + "\"" + ",\"Name\":" + "\""
				+ name + "\"" + ",\"CategoryId\":" + "\"" + category + "\""
				+ ",\"SamClass\":\"180\",\"Status\":\"DEPOSITRECEIVED\",\"DisplayName\":\"TRAILMOBILE ALUM 53/162/102\",\"Checksum\":\"0x16E6344B8D3468EAF63C678E00519081\",\"Features\":    {\"AirConditioner\":\"\",\"AirFairings\":\"\",\"AirRideCab\":false,\"AirRideSlidingRearAxle\":false,\"AirRideSpreadAxle\":false,\"AllAluminium\":false,\"AluminiumFuelTanks\":false,\"AluminiumWheels\":\"0\",\"Apu\":false,\"BellyBox\":false,\"BodyHeight\":\"162\",\"BodyLength\":\"53\",\"BodyManufacturer\":\"TRAL\",\"BodyModel\":\"53/162/102\",\"BodyType\":\"ALUMINUM VAN\",\"BodyWidth\":\"102\",\"BreakType\":\"AIR\",\"CabAndChassisOnly\":false,\"CabToAxle\":\"0\",\"ChassisType\":\"ALUMINUM VAN\",\"ColdPlate\":false,\"Color\":\"WHITE\",\"CurbSideDoor\":\"NONE\",\"CurtainSideDoor\":false,\"DoubleBunk\":false,\"DoubleSideDoor\":false,\"DropDeck\":false,\"ElectricStandBy\":false,\"EngineBrake\":false,\"EngineBrakeType\":\"\",\"EngineHorsePower\":\"\",\"EngineManufacturer\":\"\",\"EngineModel\":\"\",\"Etrac\":false,\"Extended\":false,\"ExtendedVan\":false,\"FifthWheelType\":\"\",\"FixedTandem\":false,\"FloorType\":\"WOOD\",\"FuelType\":\"\",\"GearRatio\":\"0.00\",\"GVW\":\"\",\"Headboard\":false,\"InsulatedBody\":\"\",\"LiftGate\":\"NO\",\"LiftGateModel\":\"\",\"LiftGateType\":\"\",\"LiterEngine\":\"\",\"LogisticPosts\":true,\"ManufacturerCode\":\"TRAL\",\"ManufacturerName\":\"TRAILMOBILE\",\"Model\":\"ALUM 53/162/102\",\"MultiTemp\":false,\"OdometerReading\":\"\",\"OdometerReadingRange\":\"\",\"OdometerReadingRangeAsis\":\"\",\"OdometerReadingRangeSpecialized\":\"\",\"OdometerReadingUnitCode\":\"\",\"PlywoodLining\":true,\"PowerLocks\":\"\",\"PowerMirrors\":\"\",\"PowerWindows\":\"\",\"ProductCode\":"
				+ "\"" + vehicleId + "\""
				+ ",\"ProductName\":\"VEHICLE\",\"ProductSubtypeCode\":\"180\",\"ProductSubtypeName\":\"DRY TRAILERS\",\"ProductTypeCode\":\"3\",\"ProductTypeName\":\"TRAILER\",\"PtoPump\":false,\"Ramp\":false,\"RearAxleManufacturer\":\"DANA\",\"RearAxleModel\":\"D22 AX6031378 T/A\",\"RearAxleType\":\"TANDEM AXLE\",\"RearDoorType\":\"ROLL\",\"RefeerEngineHours\":\"\",\"RefrigeratorManufacturer\":\"\",\"RefrigeratorModel\":\"\",\"RoadReadyPackage\":false,\"RoadSideDoor\":\"NONE\",\"SeatType\":\"\",\"SideGate\":false,\"SideKitTarp\":false,\"SingleFuelTank\":false,\"SleeperSize\":\"\",\"SleeperSizeType\":\"\",\"SpecialEquipmentCategoryCode\":\"\",\"SpecialEquipmentCategoryName\":\"\",\"SteelConstruction\":false,\"SupplierName\":\"RYDER\",\"SuspensionManufacturer\":\"HEND\",\"SuspensionModel\":\"HK-190 (T/A)\",\"SuspensionType\":\"AIR RIDE\",\"Tier\":\"RYDER VERIFIED™\",\"TranslucentRoof\":false,\"TransmissionManufacturer\":\"\",\"TransmissionModel\":\"\",\"TransmissionSpeeds\":\"\",\"TransmissionType\":\"\",\"VinNumber\":\"1PT01JAH2Y6013364\",\"WetKit\":false,\"WheelBase\":\"0\",\"WheelPlan\":\"\",\"WheelType\":\"STEEL\",\"WoodSlats\":false,\"Year\":\"2000\",\"CityName\":\"PHOENIX\",\"StateName\":\"ARIZONA\"},\"Images\":    {\"image1\":\"https://res.cloudinary.com/ryder-trucks/v1/usca/imagenotavailable.jpg\"},\"Prices\":    {\"ListPrice\":\"7545\"}}'\n"
				+ "              ,''\n" + "              ," + "'" + vehicleId + "'" + "\n" + "         )";

		System.out.println(sql);
		return db.preparedStatementQuery("", sql);

	}

	public DbResult verifyRecord(String productCode) throws SQLException {
		String sql = "SELECT * FROM " + tableName + " WHERE ProductCode = '" + productCode + "'";

		return db.plainQuery("", sql);
	}

	public DbResult verifyApiLoadStatus(String productCode) throws SQLException {
		String sql = "SELECT ApiLoadStatus FROM " + tableName + " WHERE ProductCode = '" + productCode + "' ";
		return db.plainQuery("", sql);

	}

	public void connectionClose() {
		db.cleanUp();
	}

	public void UpdateData(String name, String displayName, String id, String vehicleId) throws SQLException {
		String sql = "UPDATE " + tableName
				+ "			SET JsonDocument = '{\"CatalogId\":\"UsedVehicles\",\"VehicleId\":" + "\"" + vehicleId
				+ "\"" + ",\"Name\":" + "\"" + name + "\""
				+ ",\"CategoryId\":\"TRAILER\",\"SamClass\":\"50\",\"DisplayName\":" + "\"" + displayName + "\""
				+ ",\"Features\":    {\"AirConditioner\":\"YES\",\"AirFairings\":\"\",\"AirRideCab\":\"\",\"AirRideSlidingRearAxle\":\"\",\"AirRideSpreadAxle\":\"\",\"AllAluminium\":\"\",\"AluminiumFuelTanks\":\"\",\"AluminiumWheels\":\"0\",\"Apu\":\"\",\"BellyBox\":\"NO\",\"BodyHeight\":\"91\",\"BodyLength\":\"18\",\"BodyManufacturer\":\"MORG\",\"BodyModel\":\"GVSD91-18/102\",\"BodyType\":\"ALUMINUM VAN\",\"BodyWidth\":\"102\",\"BreakType\":\"HYDRAULIC\",\"CabAndChassisOnly\":\"NO\",\"CabToAxle\":\"137\",\"ChassisType\":\"N/A\",\"ColdPlate\":\"NO\",\"Color\":\"WHITE\",\"CurbSideDoor\":\"NO\",\"CurtainSideDoor\":\"NO\",\"DoubleBunk\":\"\",\"DoubleSideDoor\":\"\",\"DropDeck\":\"\",\"ElectricStandBy\":\"\",\"EngineBrake\":\"\",\"EngineBrakeType\":\"\",\"EngineHorsePower\":\"175\",\"EngineManufacturer\":\"HINO\",\"EngineModel\":\"JO5D-TF 175/2500\",\"Etrac\":\"YES\",\"Extended\":\"NO\",\"ExtendedVan\":\"\",\"FifthWheelType\":\"\",\"FixedTandem\":\"\",\"FloorType\":\"WOOD\",\"FuelType\":\"DIESEL\",\"GearRatio\":\"0\",\"GVW\":\"18000\",\"Headboard\":\"\",\"InsulatedBody\":\"WHITE\",\"LiftGate\":\"TUCK\",\"LiftGateModel\":\"TE-25L\",\"LiftGateType\":\"TUCK\",\"LiterEngine\":\"\",\"LogisticPosts\":\"NO\",\"ManufacturerCode\":\"HINO\",\"ManufacturerName\":\"HINO\",\"Model\":\"HINO 185\",\"MultiTemp\":\"\",\"OdometerReading\":\"147518\",\"OdometerReadingRange\":\"100,001 - 150,000 MI.\",\"OdometerReadingRangeAsis\":\"\",\"OdometerReadingRangeSpecialized\":\"\",\"OdometerReadingUnitCode\":\"MI\",\"PlywoodLining\":\"YES\",\"PowerLocks\":\"\",\"PowerMirrors\":\"\",\"PowerWindows\":\"\",\"ProductCode\":"
				+ "\"" + vehicleId + "\""
				+ ",\"ProductName\":\"VEHICLE\",\"ProductStatus\":\"AVAILABLE-FOR-SALE\",\"ProductSubtypeCode\":\"50\",\"ProductSubtypeName\":\"DSL TRUCKS <= 26K GVW <= 20 FT\",\"ProductTypeCode\":\"1\",\"ProductTypeName\":\"TRUCK\",\"PtoPump\":\"\",\"Ramp\":\"NO\",\"RearAxleManufacturer\":\"MFGR\",\"RearAxleModel\":\"13,000#\",\"RearAxleType\":\"SINGLE AXLE\",\"RearDoorType\":\"ROLL\",\"RefeerEngineHours\":\"\",\"RefrigeratorManufacturer\":\"\",\"RefrigeratorModel\":\"\",\"RoadReadyPackage\":\"\",\"RoadSideDoor\":\"NO\",\"SeatType\":\"BUCKET AND TWO SEAT BENCH\",\"SideGate\":\"NO\",\"SideKitTarp\":\"\",\"SingleFuelTank\":\"\",\"SleeperSize\":\"\",\"SleeperSizeType\":\"\",\"SpecialEquipmentCategoryCode\":\"\",\"SpecialEquipmentCategoryName\":\"\",\"SteelConstruction\":\"\",\"SupplierName\":\"RYDER\",\"SuspensionManufacturer\":\"MFGR\",\"SuspensionModel\":\"13,000# (LEAF)\",\"SuspensionType\":\"LEAF SPRINGS\",\"Tier\":\"RYDER CERTIFIED™\",\"TranslucentRoof\":\"NO\",\"TransmissionManufacturer\":\"ALLI\",\"TransmissionModel\":\"1000RDS 6SPD\",\"TransmissionSpeeds\":\"6\",\"TransmissionType\":\"AUTO\",\"VinNumber\":\"2AYNC6JM1A3S14547\",\"WetKit\":\"\",\"WheelBase\":\"201\",\"WheelPlan\":\"\",\"WheelType\":\"STEEL\",\"WoodSlats\":\"NO\",\"Year\":\"2010\"}}',\n"
				+ "			       ApiLoadStatus = ''\n" + "			WHERE _id = " + "'" + id + "'";
		System.out.println(sql);
		db.preparedStatementQuery("", sql);
	}

	public String verifyRecord1(String productCode) throws SQLException {
		String sql = "SELECT * FROM " + tableName + " WHERE ProductCode = '" + productCode + "'";
		db.Query("", sql);
		return db.getRecordId();
	}

}