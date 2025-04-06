package com.fy.Metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fy.objetos.Clientes;

public class Facturacion {
	public String clienteNombre;
	public String clienteApellido;
	public int Dpi;
	
	public void FacturaNueva() {
		try {
			BufferedReader abrirCliente = new BufferedReader(new FileReader("cliente1.txt"));
			String linea = abrirCliente.readLine();
			String[] datos = linea.split(",");
			
		} catch(IOException e){}
		System.out.println("hubo un error desconocido");
	}
}
