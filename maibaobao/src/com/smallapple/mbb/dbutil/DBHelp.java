package com.smallapple.mbb.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class DBHelp {
	private Connection conn;
	private PreparedStatement prep;
	public DBHelp(){
		try {
			  Context context = new InitialContext();       
			  DataSource source = (DataSource)context.lookup("java:comp/env/jdbc/conn");
			  this.conn=source.getConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int update(String sql) throws SQLException{
		prep=conn.prepareStatement(sql);
		return prep.executeUpdate();
				
	}
	public int update(String sql,Object...arr) throws SQLException{
		prep=conn.prepareStatement(sql);
		for(int i=0;i<arr.length;i++){
			prep.setObject(i+1,arr[i]);
		}
		return prep.executeUpdate();
				
	}
	
	
	
	public ResultSet select(String sql) throws SQLException{
		prep=conn.prepareStatement(sql);
		return prep.executeQuery();
	}
	
	
	public ResultSet select(String sql,Object...arr) throws SQLException{
		prep=conn.prepareStatement(sql);
		for(int i=0;i<arr.length;i++){
			prep.setObject(i+1,arr[i]);
		}
		//System.out.println(prep);
		return prep.executeQuery();
	}

}
