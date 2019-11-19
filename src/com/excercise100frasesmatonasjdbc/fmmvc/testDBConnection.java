package com.excercise100frasesmatonasjdbc.fmmvc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;

import org.junit.Test;

public class testDBConnection {
	
	@Test
	public void testConnection() {
		Connection connection = databaseutil.getConnection();
		assertNotNull("No se realizo la conexion", connection);
		
		try {
			connection.close();
			assertTrue("No se cerro la conexion", connection.isClosed());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
