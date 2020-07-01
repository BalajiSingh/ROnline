//package com.ryder.online.api.util;
//
///**
// * @Author Mitul Patel
// *
// *04/03/2020
// *
// */
//
//import com.cucumber.uvs.ecom.helper.Generic.GenericHelper;
//import com.cucumber.uvs.ecom.settings.ObjectRepo;
//
//import java.sql.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SQLDBOps {
//
//	static String url = ObjectRepo.reader.getDBURL();
//	static String username = ObjectRepo.reader.getDBUsername();
//	static String password = ObjectRepo.reader.getDBPassword();
//	static Connection db;
//
//
//	// Connect to SQL Server Database. Get credentials from config file and establish the connectivity.
//	public static Connection DBSQLConnection() throws SQLException {
//		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		} catch (ClassNotFoundException e) {
//			e.getMessage();
//		}
//		db = DriverManager.getConnection("jdbc:sqlserver://" + url, username, password);
//		return db;
//
//	}
//
//
//	//Retrieve Application URL and credentials from APP_USER_INFO Table and Create Hashmap
//    public static Map<? extends String, ? extends String> getApplicationUserInfoData() throws SQLException{
//
//    	HashMap<String, String> Appdata = new HashMap<String, String>();
//    	String AppName = GenericHelper.getAppShortName();
//    	DBSQLConnection();
//        try{
//
//        	String SQLStatment = "SELECT * FROM [RydMonApp].[dbo].[APP_USER_INFO] WHERE [APP_SHORT_NAME] = '" + AppName + "'";
//
//        	Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = statement.executeQuery(SQLStatment);
//
//            ResultSetMetaData Rsmetadata = resultSet.getMetaData();
//            int numberOfColumns = Rsmetadata.getColumnCount();
//
//            while (resultSet.next()) {
//                  if (numberOfColumns > 1)
//                    Appdata.put("AppShortName" , resultSet.getString(resultSet.findColumn("APP_SHORT_NAME")));
//                  	Appdata.put("AppName" , resultSet.getString(resultSet.findColumn("APP_FULL_NAME")));
//                    Appdata.put("AppURL"  , resultSet.getString(resultSet.findColumn("APP_URL")));
//                    Appdata.put("AppUsername" , resultSet.getString(resultSet.findColumn("APP_USER_ID")));
//                    Appdata.put("AppPassword" , resultSet.getString(resultSet.findColumn("APP_USER_PASSWORD")));
//                    Appdata.put("AppLastName" , resultSet.getString(resultSet.findColumn("APP_USER_OTHERNAME")));
//                    Appdata.put("APP_TRANSACTION_ID" , resultSet.getString(resultSet.findColumn("APP_TRAN_ID")));
//            }
//
//            statement.close();
//            db.close();
//        } catch(Exception ex) {
//            System.err.print("Exception: ");
//            System.err.println(ex.getMessage());
//        }
//		return Appdata;
//    }
//
//  //Retrieve Incident Creation Details from APP_SERVICENOW_INCIDENT_DETAILS and APP_ERROR_REFERENCE Tables and store in Hashmap
//    public static Map<? extends String, ? extends String> getServiceNowIncidentCreationDetails() throws SQLException{
//
//    	HashMap<String, String> Appdata = new HashMap<String, String>();
//    	String AppName = ObjectRepo.AppDetails.get("AppShortName");
//    	DBSQLConnection();
//        try{
//
//        	String SQLStatment = "SELECT " +
//        		      		  "A.[APP_SHORT_NAME]"  +
//        		    	      ",A.[APP_BUSINESS_SERVICE]"  +
//        		    	      ",A.[APP_SERVICENOW_DESC]"  +
//        		    	      ",A.[APP_INCIDENT_IMPACT]"  +
//        		    	      ",A.[APP_INCIDENT_URGENCY]"  +
//        		    	      ",A.[APP_PRIMARY_WORKGROUP]"  +
//        		    	      ",A.[APP_INCIDENT_SUMMARY]"  +
//                              ",A.[APP_PRIMARY_EMAIL]"  +
//        		    		  ",B.[ERROR_DESC]"  +
//        		    	  "FROM [RydMonApp].[dbo].[APP_SERVICENOW_INCIDENT_DETAILS] as A, [RydMonApp].[dbo].[APP_ERROR_REFERENCE] as B "  +
//        		    	"WHERE A.[APP_SERVICENOW_DESC] = B.[ERROR_REF_ID] AND A.[APP_SHORT_NAME] = '" + AppName + "'";
//
//         	Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = statement.executeQuery(SQLStatment);
//
//            ResultSetMetaData Rsmetadata = resultSet.getMetaData();
//            int numberOfColumns = Rsmetadata.getColumnCount();
//
//            while (resultSet.next()) {
//                  if (numberOfColumns > 1)
//                  	Appdata.put("BUSINESS_SERVICE" , resultSet.getString(resultSet.findColumn("APP_BUSINESS_SERVICE")));
//                    Appdata.put("ERROR_DESC"  , resultSet.getString(resultSet.findColumn("ERROR_DESC")));
//                    Appdata.put("INCIDENT_IMPACT" , resultSet.getString(resultSet.findColumn("APP_INCIDENT_IMPACT")));
//                    Appdata.put("INCIDENT_URGENCY" , resultSet.getString(resultSet.findColumn("APP_INCIDENT_URGENCY")));
//                    Appdata.put("INCIDENT_PRIMARY_WORKKGROUP" , resultSet.getString(resultSet.findColumn("APP_PRIMARY_WORKGROUP")));
//                    Appdata.put("INCIDENT_SUMMARY" , resultSet.getString(resultSet.findColumn("APP_INCIDENT_SUMMARY")));
//                    Appdata.put("APP_PRIMARY_EMAIL" , resultSet.getString(resultSet.findColumn("APP_PRIMARY_EMAIL")));
//                    Appdata.put("APP_SERVICENOW_DESC" , resultSet.getString(resultSet.findColumn("APP_SERVICENOW_DESC")));
//            }
//
//            statement.close();
//            db.close();
//        } catch(Exception ex) {
//            System.err.print("Exception: ");
//            System.err.println(ex.getMessage());
//        }
//		return Appdata;
//    }
//
//  //Retrieve Application URL and credentials from APP_USER_INFO Table and Create Hashmap
//    public static void findExistingIncidentNumber(String TRAN_ID) throws SQLException{
//
//
////    	if (ObjectRepo.AppDetails.get("AppURL").contains("http://ride.ryder.com/")) {
////    		TRAN_ID = "RIDE001";
////    	}else {
////    		TRAN_ID = ObjectRepo.AppDetails.get("APP_TRANSACTION_ID");
////    	}
//
//    	DBSQLConnection();
//        try{
//
//        	String SQLStatment = "SELECT [INCIDENT_NUMBER], [INCIDENT_SYS_ID_SERVICENOW] FROM [RydMonApp].[dbo].[APP_INCIDENT_TRACKER] WHERE [APP_TRAN_ID] = '" + TRAN_ID + "'";
//      	    Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = statement.executeQuery(SQLStatment);
//
//            ResultSetMetaData Rsmetadata = resultSet.getMetaData();
//            int numberOfColumns = Rsmetadata.getColumnCount();
//
//            while (resultSet.next()) {
//                  if (numberOfColumns > 1)
//                	  ObjectRepo.IncidentSysID=  resultSet.getString(resultSet.findColumn("INCIDENT_SYS_ID_SERVICENOW"));
//                  	  ObjectRepo.IncidentNo = resultSet.getString(resultSet.findColumn("INCIDENT_NUMBER"));
//               }
//
//            statement.close();
//            db.close();
//        } catch(Exception ex) {
//            System.err.print("Exception: ");
//            System.err.println(ex.getMessage());
//        }
//
//    }
//
//
//  //Retrieve Application URL and credentials from APP_USER_INFO Table and Create Hashmap
//    public static Map<? extends String, ? extends String> setErrorMap() throws SQLException{
//
//    	DBSQLConnection();
//        try{
//
//        	String SQLStatment = "SELECT * FROM [RydMonApp].[dbo].[APP_ERROR_REFERENCE]";
//      	    Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = statement.executeQuery(SQLStatment);
//
//            ResultSetMetaData Rsmetadata = resultSet.getMetaData();
//            int numberOfColumns = Rsmetadata.getColumnCount();
//            String ErrorCode = null;
//            String ErrorDesc;
//            while (resultSet.next()) {
//                  if (numberOfColumns > 1)
//                	  ErrorCode = resultSet.getString(resultSet.findColumn("ERROR_REF_ID"));
//                	  ErrorDesc = resultSet.getString(resultSet.findColumn("ERROR_DESC"));
//                	  ObjectRepo.ErrorList.put(ErrorCode, ErrorDesc);
//               }
//
//            statement.close();
//            db.close();
//        } catch(Exception ex) {
//            System.err.print("Exception: ");
//            System.err.println(ex.getMessage());
//        }
//		return null;
//
//    }
//
//  //Create Execution Status data entry in APP_EXEC_STATUS table to maintain execution log along with Service Now incident Number
//    public static void InsertExecutionData(String AppName, String ExecutionStatus, Timestamp currentTime, String ExeFailureReason, Timestamp appsLaunchTime, Timestamp appsLoginTime, String IncidentNo, String UpdatedBy) throws SQLException{
//    	DBSQLConnection();
//
//    	if(ExeFailureReason != null && !ExeFailureReason.isEmpty() && ExeFailureReason.contains("WAR")){
//            ExecutionStatus = "PASSED";
//        }
//
//    	try{
//        	String SQLStatment ;
//        	if(appsLoginTime == null) {
//        		SQLStatment = "INSERT INTO [dbo].[APP_EXEC_STATUS]" +
//          	           "([APP_SHORT_NAME] ,[APP_EXEC_STATUS],[EXEC_DATETIME],[ERROR_REF_ID],[APP_LAUNCH_TIME],[APP_LOGIN_TIME],[INCIDENT_NUMBER],[UPDATED_BY])" +
//          	           	"VALUES ('" +
//     	                    AppName + "','"+
//     	                    ExecutionStatus + "','"+
//      	                    currentTime + "','"+
//     	                    ExeFailureReason + "','" +
//     	                    appsLaunchTime + "'," +
//     	                    null + ",'" +
//     	                    IncidentNo + "','"+
//     	                    UpdatedBy +"')";
//        	}else {
//        		SQLStatment = "INSERT INTO [dbo].[APP_EXEC_STATUS]" +
//          	           "([APP_SHORT_NAME] ,[APP_EXEC_STATUS],[EXEC_DATETIME],[ERROR_REF_ID],[APP_LAUNCH_TIME],[APP_LOGIN_TIME],[INCIDENT_NUMBER],[UPDATED_BY])" +
//          	           	"VALUES ('" +
//     	                    AppName + "','"+
//     	                    ExecutionStatus + "','"+
//      	                    currentTime + "','"+
//     	                    ExeFailureReason + "','" +
//     	                    appsLaunchTime + "','" +
//     	                    appsLoginTime + "','" +
//     	                    IncidentNo + "','"+
//     	                    UpdatedBy +"')";
//        	}
//
//
//        	System.out.println(SQLStatment);
//        	Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            statement.execute(SQLStatment);
//
//            statement.close();
//            db.close();
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//  //If Scenario is failed and Incident is created then Create data entry in APP_INCIDENT_TRACKER table to tService Now incident Number
//    public static void InsertIncidentTrackerData(String TransactionID,  String IncidentNo, String Incident_Sysid) throws SQLException{
//    	DBSQLConnection();
//
//        try{
//        	String SQLStatment = "INSERT INTO [dbo].[APP_INCIDENT_TRACKER]" +
//     	           "([APP_TRAN_ID] ,[INCIDENT_NUMBER],[INCIDENT_SYS_ID_SERVICENOW])" +
//     	           	"VALUES ('" +
//     	           		TransactionID + "','"+
//     	           		IncidentNo + "','"+
//     	           	Incident_Sysid +"')";
//
//        	Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            statement.execute(SQLStatment);
//
//            //statement.close();
//            db.close();
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//
//  //Retrieve Application URL and credentials from APP_USER_INFO Table and Create Hashmap
//    public static void RemoveServiceNowIncidentFromIncidentTrackerOnceResolved(String SysID) throws SQLException{
//
//    	//String SysID = ObjectRepo.IncidentSysID;
//    	DBSQLConnection();
//        try{
//
//        	String SQLStatment = "DELETE FROM [RydMonApp].[dbo].[APP_INCIDENT_TRACKER] WHERE [INCIDENT_SYS_ID_SERVICENOW] = '" + SysID + "'";
//      	    Statement statement = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            statement.execute(SQLStatment);
//            db.close();
//        } catch(Exception ex) {
//            System.err.print("Exception: ");
//            System.err.println(ex.getMessage());
//        }
//
//    }
//
//    public static Date convertDbltoTime(Timestamp x) throws ParseException
//    {
//    	String s = ""+x;
//    	SimpleDateFormat format = new SimpleDateFormat("sss");
//    	Date date =  format.parse(s);
//    	return date;
//    }
//
//}
//
