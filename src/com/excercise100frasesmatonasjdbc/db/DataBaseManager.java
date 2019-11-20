package com.excercise100frasesmatonasjdbc.db;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import com.excercise100frasesmatonasjdbc.model.Frase;
import com.excercise100frasesmatonasjdbc.model.Persona;

public class DataBaseManager {
	private Connection conn;
	
	public DataBaseManager(Connection conn) {
		this.conn = conn;
	}
	
	public void crearPersona(Persona persona) {
		/*
		String query = "insert into persona(nombre, edad, carrera) " 
				+ "values(" + persona.getNombre() +", "
				+ persona.getEdad() + ", "
				+ persona.getCarrera() + ");";
		*/
		String query = "insert into persona(nombre, edad, carrera) " 
				+ "values(" +persona.toString() + ");";
		
		Statement stmnt = null;
		
		try {
			stmnt = conn.createStatement();
			stmnt.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void crearFrase(Frase frase) {
		String query = "insert into persona(nombre, edad, carrera) " 
				+ "values(" +frase.toString() + ");";
		
		Statement stmnt = null;
	}
	
	public void crearFrasePersona(int idPersona, int idFrase) {
		
	}
	
	public List<Persona> consultarPersonas(){
		return null;
	} 
	
	public List<Frase> consultarFrases(){
		return null;
	}
	
	public List<Frase> consultarFrasePersona(int idPersona){
		return null;
	}
}
