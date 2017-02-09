package br.com.caelum.tarefas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnectionMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/fj21", "root", "Ds881536");
		} catch (SQLException exc) {
			throw new RuntimeException(exc);
		} catch (ClassNotFoundException exc) {
			exc.printStackTrace();
			throw new RuntimeException(exc);
		}
	}
}
