package com.fy.Main;
import javax.swing.*;

import com.fy.Metodos.AddClientes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Faz {
	AddClientes metodosclientes = new AddClientes();
	
	 private JFrame frame;
	    private JTextField matriculaField;
	    private JTextField marcaField;
	    private JTextField modeloField;
	    private JTextField descripcionField;
	    private JTextField costoField;


	    void crearGUI() {
	        frame = new JFrame("Taller");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(6, 2));

	        panel.add(new JLabel("Matrícula:"));
	        matriculaField = new JTextField();
	        panel.add(matriculaField);

	        panel.add(new JLabel("Marca:"));
	        marcaField = new JTextField();
	        panel.add(marcaField);

	        panel.add(new JLabel("Modelo:"));
	        modeloField = new JTextField();
	        panel.add(modeloField);

	        panel.add(new JLabel("Descripción:"));
	        descripcionField = new JTextField();
	        panel.add(descripcionField);

	        panel.add(new JLabel("Costo:"));
	        costoField = new JTextField();
	        panel.add(costoField);

	        JButton agregarButton = new JButton("Agregar");
	       agregarButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               agregarVehiculo();
	        }});

	        JButton guardarButton = new JButton("Guardar");
	        guardarButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                guardarDatos();
	            }
	        });{

	        panel.add(agregarButton);
	        panel.add(guardarButton);

	        frame.add(panel, BorderLayout.CENTER);
	        frame.pack();
	        frame.setVisible(true);
	    }
}	
	   private void agregarVehiculo() {
	    	 String nombre = matriculaField.getText();
	         String apellido = marcaField.getText();
	         int dpi = Integer.parseInt(modeloField.getText());
	         
	         metodosclientes.AgregarClientes(nombre, apellido, dpi);
	     }
	   


	    private void guardarDatos() {
	         metodosclientes.guardarBaseDatos();
	     }
	    }
	       
