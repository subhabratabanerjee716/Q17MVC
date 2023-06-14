package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Form;

public class DatabaseOperation {
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum","root","1234");
		
		
		return c;
		
	}
	
	
	public static void insert(Form f) throws ClassNotFoundException, SQLException {
		
		
		Connection c =DatabaseOperation.getConnection();
		
		PreparedStatement stmt = c.prepareStatement("insert into forum (topic,description,content) values(?,?,?)");
		
		stmt.setString(1,f.getTitle());
		
		stmt.setString(2,f.getDesc());
		
		stmt.setString(3,f.getContent());
		
		stmt.execute();
		
		System.out.println("insert query executed ,  hoorah!!");
		
		
		
		
	}
	
	public static ResultSet select() throws ClassNotFoundException, SQLException {
		
		Connection c =DatabaseOperation.getConnection();
		
		Statement stmt = c.createStatement();
		
		
		ResultSet r = stmt.executeQuery("select * from forum");
		
		return r;
		
		
	}

}
