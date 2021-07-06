package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection connection;
	
	public static Connection getConnection() {
	
		if(connection == null) {
			try {	
				
				// necess�rio para aplica��es web
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				connection = DriverManager.getConnection("jdbc:mysq'l://localhost/if_delivery", "root", "vale123");
				
			} catch (SQLException e) {
				
				throw new RuntimeException(e);
			}
		} 
			return connection;

	
	}	
}