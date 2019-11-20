package com.excercise100frasesmatonasjdbc.model;

public class Frase {
	private int idFrase;
	private String contenido;
	private int cantidad;
	private String fechaDesde;
	
	public int getIdFrase() {
		return idFrase;
	}
	
	public void setIdFrase(int idFrase) {
		this.idFrase = idFrase;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getFechaDesde() {
		return this.fechaDesde;
	}
	
	public void setfechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
}
