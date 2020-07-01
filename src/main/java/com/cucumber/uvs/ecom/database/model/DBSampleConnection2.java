package com.cucumber.uvs.ecom.database.model;

import java.sql.CallableStatement;
import java.sql.SQLException;

import com.ryder.online.database.utility.DatabaseUtil;

public class DBSampleConnection2 {
	String tableName2 = "VehicleDB.vmd.ALTERNATOR_SPECS";

	//String url = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;integratedSecurity=true";

	
	DatabaseUtil db;
	String username ="ryder\\mgolla";
	String password ="Ryder@123";
	
	String url5 = "jdbc:sqlserver://MIABTFMSSQL07:1433;databaseName=UVS_STAGE;instanceName=SSCD_QA;";
	
	
	String tableName = "UVS_TRAN.dbo.PUBLISHER_FEED_0014";
	String columns = "[JsonDocument]\r\n" + "		                   ,[ApiLoadStatus]\r\n"
			+ "		                      ,ProductCode";
	//String user = "sa_vstsagent_q";
	//String pass = "vQfxYM8P70iRq4YDgviQY3Ico3ejSaAI";
	
	String user = "mgolla";
	String pass = "Ryder@123";
	
	public DBSampleConnection2() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}

		db = new DatabaseUtil(url5, username, password);
		

	}

	public CallableStatement connectToDB() throws SQLException {

		String sql = "exec msdb.dbo.sp_start_job N'UVS - Transformation_00_10'";

		return db.preparedStatement("", sql);

	}

	public void sqlStatement(String vehicleId, String category, String name, String displayName) {
		String sql = "INSERT INTO " + tableName + "(" + columns + ")" + "VALUES\r\n" + "           (\r\n"
				+ "              '{\"CatalogId\":\"UsedVehicles\",\"VehicleId\":" + "\"" + vehicleId + "\""
				+ ",\"Name\":" + "\"" + name + "\"" + ",\"CategoryId\":" + "\"" + category + "\""
				+ ",\"SamClass\":\"120\",\"DisplayName\":" + "\"" + displayName + "\""
				+ ",\"Features\":    {\"AirConditioner\":\"YES\",\"AirFairings\":\"\",\"AirRideCab\":\"\",\"AirRideSlidingRearAxle\":\"\",\"AirRideSpreadAxle\":\"\",\"AllAluminium\":\"\",\"AluminiumFuelTanks\":\"\",\"AluminiumWheels\":\"0\",\"Apu\":\"\",\"BellyBox\":\"NO\",\"BodyHeight\":\"91\",\"BodyLength\":\"18\",\"BodyManufacturer\":\"MORG\",\"BodyModel\":\"GVSD91-18/102\",\"BodyType\":\"ALUMINUM VAN\",\"BodyWidth\":\"102\",\"BreakType\":\"HYDRAULIC\",\"CabAndChassisOnly\":\"NO\",\"CabToAxle\":\"137\",\"ChassisType\":\"N/A\",\"ColdPlate\":\"NO\",\"Color\":\"WHITE\",\"CurbSideDoor\":\"NO\",\"CurtainSideDoor\":\"NO\",\"DoubleBunk\":\"\",\"DoubleSideDoor\":\"\",\"DropDeck\":\"\",\"ElectricStandBy\":\"\",\"EngineBrake\":\"\",\"EngineBrakeType\":\"\",\"EngineHorsePower\":\"175\",\"EngineManufacturer\":\"HINO\",\"EngineModel\":\"JO5D-TF 175/2500\",\"Etrac\":\"YES\",\"Extended\":\"NO\",\"ExtendedVan\":\"\",\"FifthWheelType\":\"\",\"FixedTandem\":\"\",\"FloorType\":\"WOOD\",\"FuelType\":\"DIESEL\",\"GearRatio\":\"0\",\"GVW\":\"18000\",\"Headboard\":\"\",\"InsulatedBody\":\"WHITE\",\"LiftGate\":\"TUCK\",\"LiftGateModel\":\"TE-25L\",\"LiftGateType\":\"TUCK\",\"LiterEngine\":\"\",\"LogisticPosts\":\"NO\",\"ManufacturerCode\":\"HINO\",\"ManufacturerName\":\"HINO\",\"Model\":\"HINO 185\",\"MultiTemp\":\"\",\"OdometerReading\":\"147518\",\"OdometerReadingRange\":\"100,001 - 150,000 MI.\",\"OdometerReadingRangeAsis\":\"\",\"OdometerReadingRangeSpecialized\":\"\",\"OdometerReadingUnitCode\":\"MI\",\"PlywoodLining\":\"YES\",\"PowerLocks\":\"\",\"PowerMirrors\":\"\","
				+ "\"PowerWindows\":\"\",\"ProductCode\":"
				+ "\"" + vehicleId + "\""
				+ ",\"ProductName\":\"VEHICLE\",\"ProductStatus\":\"AVAILABLE-FOR-SALE\",\"ProductSubtypeCode\":\"50\",\"ProductSubtypeName\":\"DSL TRUCKS <= 26K GVW <= 20 FT\",\"ProductTypeCode\":\"1\",\"ProductTypeName\":\"TRUCK\",\"PtoPump\":\"\",\"Ramp\":\"NO\",\"RearAxleManufacturer\":\"MFGR\",\"RearAxleModel\":\"13,000#\",\"RearAxleType\":\"SINGLE AXLE\",\"RearDoorType\":\"ROLL\",\"RefeerEngineHours\":\"\",\"RefrigeratorManufacturer\":\"\",\"RefrigeratorModel\":\"\",\"RoadReadyPackage\":\"\",\"RoadSideDoor\":\"NO\",\"SeatType\":\"BUCKET AND TWO SEAT BENCH\",\"SideGate\":\"NO\",\"SideKitTarp\":\"\",\"SingleFuelTank\":\"\",\"SleeperSize\":\"\",\"SleeperSizeType\":\"\",\"SpecialEquipmentCategoryCode\":\"\",\"SpecialEquipmentCategoryName\":\"\",\"SteelConstruction\":\"\",\"SupplierName\":\"RYDER\",\"SuspensionManufacturer\":\"MFGR\",\"SuspensionModel\":\"13,000# (LEAF)\",\"SuspensionType\":\"LEAF SPRINGS\",\"Tier\":\"RYDER CERTIFIED™\",\"TranslucentRoof\":\"NO\",\"TransmissionManufacturer\":\"ALLI\",\"TransmissionModel\":\"1000RDS 6SPD\",\"TransmissionSpeeds\":\"6\",\"TransmissionType\":\"AUTO\",\"VinNumber\":\"2AYNC6JM1A3S14547\",\"WetKit\":\"\",\"WheelBase\":\"201\",\"WheelPlan\":\"\",\"WheelType\":\"STEEL\",\"WoodSlats\":\"NO\",\"Year\":\"2010\"}}'\r\n"
				+ "           ,''\r\n" + "                 ,'" + vehicleId + "'\r\n" + "           )";

		String newsql =  "INSERT INTO " + tableName + "(" + columns + ")" + "     VALUES\n" + "           (\n"
				+ "           '{\"CatalogId\":\"UsedVehicles\",\"VehicleId\":" + "\""+vehicleId+ "\""+",\"Name\":"+ "\""+name+ "\""+",\"CategoryId\":\"212\",\"SamClass\":"+ "\""+vehicleId+ "\""+",\"DisplayName\":"+ "\""+displayName+ "\""+",\"Features\":    {\"AirConditioner\":\"MFGR\",\"AirFairings\":\"\",\"AirRideCab\":\"\",\"AirRideSlidingRearAxle\":\"\",\"AirRideSpreadAxle\":\"\",\"AllAluminium\":\"\",\"AluminiumFuelTanks\":\"\",\"AluminiumWheels\":\"0\",\"Apu\":\"\",\"BellyBox\":\"NO\",\"BodyHeight\":\"110\",\"BodyLength\":\"24\",\"BodyManufacturer\":\"UNRU\",\"BodyModel\":\"24 GLASS BODY\",\"BodyType\":\"STAKE FLAT\",\"BodyWidth\":\"102\",\"BreakType\":\"AIR\",\"CabAndChassisOnly\":\"NO\",\"CabToAxle\":\"201\",\"ChassisType\":\"N/A\",\"ColdPlate\":\"\",\"Color\":\"WHITE\",\"CurbSideDoor\":\"\",\"CurtainSideDoor\":\"NO\",\"DoubleBunk\":\"\",\"DoubleSideDoor\":\"\",\"DropDeck\":\"\",\"ElectricStandBy\":\"\",\"EngineBrake\":\"\",\"EngineBrakeType\":\"\",\"EngineHorsePower\":\"270\",\"EngineManufacturer\":\"CUMM\",\"EngineModel\":\"ISL13 270/2000\",\"Etrac\":\"\",\"Extended\":\"NO\",\"ExtendedVan\":\"\",\"FifthWheelType\":\"\",\"FixedTandem\":\"\",\"FloorType\":\"OTHER\",\"FuelType\":\"DIESEL\",\"GearRatio\":\"4.1\",\"GVW\":\"33000\",\"Headboard\":\"\",\"InsulatedBody\":\"\",\"LiftGate\":\"NO\",\"LiftGateModel\":\"\",\"LiftGateType\":\"\",\"LiterEngine\":\"10\",\"LogisticPosts\":\"\",\"ManufacturerCode\":\"FRTL\",\"ManufacturerName\":\"FREIGHTLINER\",\"Model\":\"M2 106\",\"MultiTemp\":\"\",\"OdometerReading\":\"438699\",\"OdometerReadingRange\":\"400,001 - 450,000 MI.\",\"OdometerReadingRangeAsis\":\"\",\"OdometerReadingRangeSpecialized\":\"\",\"OdometerReadingUnitCode\":\"MI\",\"PlywoodLining\":\"\",\"PowerLocks\":\"\",\"PowerMirrors\":\"\",\"PowerWindows\":\"\",\"ProductCode\":\"2285202019\",\"ProductName\":\"VEHICLE\",\"ProductStatus\":\"AVAILABLE-FOR-SALE\",\"ProductSubtypeCode\":\"100\",\"ProductSubtypeName\":\"STAKE AND FLATBED TRUCKS\",\"ProductTypeCode\":\"1\",\"ProductTypeName\":\"TRUCK\",\"PtoPump\":\"\",\"Ramp\":\"NO\",\"RearAxleManufacturer\":\"DETR\",\"RearAxleModel\":\"DA-RS-21-4 21K\",\"RearAxleType\":\"SINGLE AXLE\",\"RearDoorType\":\"\",\"RefeerEngineHours\":\"\",\"RefrigeratorManufacturer\":\"\",\"RefrigeratorModel\":\"\",\"RoadReadyPackage\":\"\",\"RoadSideDoor\":\"\",\"SeatType\":\"BUCKET\",\"SideGate\":\"NO\",\"SideKitTarp\":\"\",\"SingleFuelTank\":\"\",\"SleeperSize\":\"\",\"SleeperSizeType\":\"\",\"SpecialEquipmentCategoryCode\":\"\",\"SpecialEquipmentCategoryName\":\"\",\"SteelConstruction\":\"\",\"SupplierName\":\"RYDER\",\"SuspensionManufacturer\":\"FRTL\",\"SuspensionModel\":\"AIRLINER 21,000#\",\"SuspensionType\":\"AIR RIDE\",\"Tier\":\"RYDER VERIFIED™\",\"TranslucentRoof\":\"\",\"TransmissionManufacturer\":\"FULL\",\"TransmissionModel\":\"FSO-8406A\",\"TransmissionSpeeds\":\"6\",\"TransmissionType\":\"MANUAL\",\"VinNumber\":\"1FVACXCY4EHFU228\",\"WetKit\":\"\",\"WheelBase\":\"267\",\"WheelPlan\":\"\",\"WheelType\":\"STEEL\",\"WoodSlats\":\"NO\",\"Year\":\"2014\",\"FinalPrice\":\"26276\",\"FinalPriceCurrencyCode\":\"USD\",\"CityName\":\"CHARLOTTE\",\"StateName\":\"NORTH CAROLINA\"},\"Images\": {\"image1\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101.jpg\",\"image2\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-1.jpg\",\"image3\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-2.jpg\",\"image4\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-3.jpg\",\"image5\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-4.jpg\",\"image6\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-5.jpg\",\"image7\":\"https://res.cloudinary.com/qa-ryder-trucks/image/upload/v1/usca/541101-6.jpg\"},\"Prices\":{\"ListPrice\" : \"26276\"}}'\n"
				+ "		   ,''\n" + "           ,'"+vehicleId+"'\n" + "		   ,'2019-05-20 07:15:01.150'\n"
				+ "           )";
		
		System.out.println(newsql);
	}

	public static void main(String[] args) throws SQLException {
		DBSampleConnection2 db2 = new DBSampleConnection2();
		db2.connectToDB();
		//db2.sqlStatement("1234", "abcd", "xyz", "mno");
	}

}

/*
 * sp_start_job { [@job_name =] 'job_name' | [@job_id =] job_id } [ ,
 * [@error_flag =] error_flag] [ , [@server_name =] 'server_name'] [ ,
 * [@step_name =] 'step_name'] [ , [@output_flag =] output_flag]
 * 
 * 
 * 
 * EXEC msdb.dbo.sp_start_job N'UVS - Transformation_00_10' ;  String storedProc
 * = "{call stored_proc(" + someVariable + ")}";
 * 
 * /SQL "\"\UVS\UVS_MAGAZINE_PUBLISHER_FEED_0014\"" /SERVER MIAVDETEDB01
 * /CHECKPOINTING OFF /SET
 * "\"\Package.Variables[User::v_threads].Properties[Value]\"";1 /SET
 * "\"\Package.Variables[User::v_thread].Properties[Value]\"";0 /REPORTING E
 * 
 * 
 * 
 * 
 * 
 */