package com.excercise100frasesmatonasjdbc.fmmvc;
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseutil {
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s?%s";
	
	public static Connection getConnection() {
		String dbms = "mysql";
		String host = "localhost";
		String port = "3306";
		String dataBase = "frases_matonas";
		String user = "root";
		String pass = "root";
		String timeZone = "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String url = String.format(URL_FORMAT, dbms, host, port, dataBase, timeZone);
		
		System.out.println(url);
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
