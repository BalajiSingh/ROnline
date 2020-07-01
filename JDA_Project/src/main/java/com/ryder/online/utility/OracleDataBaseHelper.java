package com.ryder.online.utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class OracleDataBaseHelper {


public String getValueFromDataBase(String CustomerName, String ExternalShipmentNumber, String ColumnName) throws SQLException {


	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("not successfull");
	}
	System.out.println("connection successfull");

	


//String URL = "jdbc:oracle:thin:@//roldb03-scan:1521/rolst";
	String URL = "jdbc:oracle:thin:@roldb03-scan:1521/rolst";
String USER = "rtracread";
String PASS = "rtracread";
Properties info = new Properties( );
info.put("user","rtracread" );
info.put("password","rtracread");
Statement stmt = null;
PreparedStatement pstmt = null;
CallableStatement cstmt = null;
ResultSet rs = null;
// String SQL = "Update Employees SET age = ? WHERE id = ?";
 String SQL = "select * from Transaction_history where customernum ='"+CustomerName+"' AND "+ColumnName+" ='"+ExternalShipmentNumber+"'";
 Connection conn =null;
 String value = null;
try {
 conn = DriverManager.getConnection(URL,USER,PASS);
String SQLC = "{call getEmpName (?, ?)}";
cstmt = conn.prepareCall (SQLC);
stmt = conn.createStatement( );
pstmt = conn.prepareStatement(SQL);
rs = stmt.executeQuery(SQL);
while(rs.next()){

 value =rs.getString(ColumnName);
System.out.println(value);
//int id = rs.getInt(1);
//if( rs.wasNull( ) ) {
//   id = 0;
//}
}
System.out.println("conn manager successfull");
return value;
}
catch (SQLException e) {
	e.getStackTrace();
	System.out.println(e.getMessage());
	System.out.println("un successfull");
}
finally {
		rs.close();
	   stmt.close();
	   pstmt.close();
	   cstmt.close();
	   try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }

	}
return value;
}

}
