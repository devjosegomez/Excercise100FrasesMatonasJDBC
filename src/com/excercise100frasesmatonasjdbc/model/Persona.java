package com.excercise100frasesmatonasjdbc.model;

public class Persona {
	private int idPersona;
	private String nombre;
	private int edad;
	private String carrera;
	
	public int getIdPersona() {
		return this.idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCarrera() {
		return this.carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}
