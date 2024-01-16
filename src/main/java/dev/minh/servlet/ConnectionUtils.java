package dev.minh.servlet;
import java.sql.*;
import java.sql.Connection;

public class ConnectionUtils {

	 public static Connection getMySQLConnection()
	            throws SQLException, ClassNotFoundException {
	         String hostName = "localhost";
	         String dbName = "user_account";
	         String userName = "root";
	         String password = "";
	         String connectionURL = "jdbc:mysql://"
	                 + hostName + ":3306/" + dbName;
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn = DriverManager.getConnection(connectionURL,
	                     userName,password);
	        return conn;
	    }

	
}
