package com.fy.Metodos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fy.objetos.Clientes;

public class AddClientes {
	
	public static List<Clientes> listaClientes = new ArrayList<>();
	String linea;
	
	public void AbrirBaseDatos() {
		try {
			BufferedReader persona = new BufferedReader(new FileReader("BaseDatos.txt"));
			while((linea= persona.readLine()) != null) {
				baseALista();
			}
			persona.close();
			//AgregarClientes("ultimo", "cliente", 34);
			Recorrerlista();
			//AgregarClientes("Jonathan", "ramos carino", 23);
			guardarBaseDatos();
		}
		catch(java.io.FileNotFoundException i) {
		System.out.println("desea crear la basee de datos");
		guardarBaseDatos();
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("error en lineas");
		}
		catch(IOException e){
			System.out.println("error en " + e); 
		} 
	}
	
	//inicio del 2do paso
	public void baseALista() {
		String nombre;
		String apellido;
		int edad;
		String[] lineaCliente = linea.split(",");
		/*for(String dato:lineaCliente) {
		}*/
		nombre = lineaCliente[0];
		apellido = lineaCliente[1];
		edad = Integer.parseInt(lineaCliente[2]);
		//System.out.println(nombre+" "+apellido+" "+edad);
		AgregarClientes(nombre, apellido, edad);
	}
	
	//
	public Clientes AgregarClientes(String nombre, String apellido, int edad) {	
		Clientes nuevoCliente = new Clientes();
		nuevoCliente.setNombre(nombre);
		nuevoCliente.setApellido(apellido);
		nuevoCliente.setDpi(edad);
		listaClientes.add(nuevoCliente);
		return nuevoCliente;
	}
	
	
	//
	public void Recorrerlista() {
		for(Clientes recorrido:listaClientes) {
			System.out.println(recorrido.getDpi());
			System.out.println(recorrido.getNombre());
		}
	}
	
	
	
	public void guardarBaseDatos() {
		try {
		Clientes cliente = new Clientes();
		FileWriter ActualizarBase = new FileWriter("BaseDatos.txt", false);
		BufferedWriter archivoNuevo = new BufferedWriter(ActualizarBase);
		for(Clientes cliente1:listaClientes) {
			archivoNuevo.write(cliente1.toString());
			archivoNuevo.newLine();
		}
		archivoNuevo.close();
		System.out.println("archivo guardado con exito");
		} catch(IOException e) {
			System.out.println("error desconocido >:v");
		}
	}
	
	public void EliminarCliente(String nombreRecibido) {
		listaClientes = listaClientes.stream()
			.filter(cliente -> !cliente.getNombre().equals(nombreRecibido))
			.collect(Collectors.toList());
	}
}
