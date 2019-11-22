package com.excercise100frasesmatonasjdbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
		String query = "insert into frase(contenido, cantidad, fechaDesde) " 
				+ "values(" +frase.toString() + ");";
		
		Statement stmnt = null;
		
		try {
			stmnt = conn.createStatement();
			stmnt.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void crearFrasePersona(int idPersona, int idFrase) {
		
	}
	
	public List<Persona> consultarPersonas(){
		String query = "select * from persona";
		Statement stmnt = null;
		ResultSet rs = null;
		List<Persona> listPersonas = null;
		
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(query);
			listPersonas = new ArrayList<>();
			
			while(rs.next()) {
				Persona persona = new Persona();
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getInt("edad"));
				persona.setCarrera(rs.getString("carera"));
				persona.setFecha(rs.getDate("fecha"));
				
				listPersonas.add(persona);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return listPersonas;
	} 
	
	public List<Frase> consultarFrases(){
		return null;
	}
	
	public List<Frase> consultarFrasePersona(int idPersona){
		return null;
	}
}
