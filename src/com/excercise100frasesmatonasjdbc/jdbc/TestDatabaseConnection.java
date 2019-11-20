package com.excercise100frasesmatonasjdbc.jdbc;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import org.junit.Test;



public class TestDatabaseConnection {

	@Test
	public void testConnection() {
		Connection connection = DatabaseUtil.getConnection();
		assertNotNull("No se realiz� la conecci�n", connection);
		
		try {
			
			connection.close();
			assertTrue("no se cerr� la conneccion",	connection.isClosed());
		} catch (Exception e) {

			
		}
	}
}
