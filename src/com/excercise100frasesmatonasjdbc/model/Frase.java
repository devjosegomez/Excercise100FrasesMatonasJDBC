package com.excercise100frasesmatonasjdbc.model;

import java.util.Date;

public class Frase {
	private String contenido;
	private int cantidad;
	private Date fechaDesde;
	
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
	
	public Date getFechaDesde() {
		return this.fechaDesde;
	}
	
	public void setfechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	
	public String toString() {
		return String.format("'%s', %d, '%s'", contenido, cantidad, fechaDesde);
	}
}
