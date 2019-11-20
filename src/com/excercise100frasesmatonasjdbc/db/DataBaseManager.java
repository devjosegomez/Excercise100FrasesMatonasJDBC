package com.excercise100frasesmatonasjdbc.db;

import java.sql.Connection;

public class DataBaseManager {
	private Connection conn;
	
	public DataBaseManager(Connection conn) {
		this.conn = conn;
	}
	
	
}
