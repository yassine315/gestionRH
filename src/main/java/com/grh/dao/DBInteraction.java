package com.grh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;


public class DBInteraction {
	
static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	
	static final String DB_URL = "jdbc:mysql://localhost/classicmodels?useUnicode=true" + 
		"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
		"serverTimezone=UTC&useSSL=false";
	
	   //  Database credentials
	   private final String USER = "root";
	   private final String PASS = "sahrawia";
	   // connection 
	   private Connection conx;
	   
	   // requete pour le dialogue
	   private Statement stm;
	   
	   //resutSet resulta d'une selection
	   ResultSet rs;
	   
	   public void getConnection() {
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			
		    conx = DriverManager.getConnection(DB_URL,USER,PASS);

		    stm = conx.createStatement();
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	   }
	   
	   public void close() {
		   try {
			stm.close();
			conx.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   public int update(String sql) throws SQLException {
		   
		   int rowsUp = stm.executeUpdate(sql);
		   
		   return rowsUp;
	   }
	   
	   public ResultSet select(String sql) throws SQLException {
		   
		   ResultSet rs = stm.executeQuery(sql);
			
		   return rs;
		   
	   }
	   
	 
}
