package com.fy.objetos;

public class Clientes {
	private int id;
	private String nombre;
	private String apellido;
	private int dpi;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDpi() {
		return dpi;
	}
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	public String toString() {
		String clienteString = (getNombre()+","+getApellido()+","+getDpi());
		return clienteString ;
		
	}
}
