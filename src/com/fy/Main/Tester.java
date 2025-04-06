package com.fy.Main;

import com.fy.Metodos.AddClientes;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//realizando prueba de subida a github haha
		Faz interfaz = new Faz();
		interfaz.crearGUI();
		AddClientes metodosclientes = new AddClientes();
		metodosclientes.AbrirBaseDatos();
		//metodosclientes.AgregarClientes("nuevo dato", "nueva base", 4);
		//metodosclientes.AgregarClientes("Selvin", "san", 4);
		//metodosclientes.Recorrerlista();
		//metodosclientes.EliminarCliente("nuevo dato");
		//metodosclientes.Recorrerlista();
		metodosclientes.guardarBaseDatos();
	}

}
