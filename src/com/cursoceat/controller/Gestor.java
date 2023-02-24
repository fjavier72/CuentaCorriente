package com.cursoceat.controller;

public class Gestor {

	// Atributos
	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	// Constructores
	public Gestor(String nombreGestor, String telefono, double importeMax) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}
	
	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = 10000;
	}

	// Getter
	public String getTelefono() {
		return telefono;
	}
	
	// Métodos
	void mostrarInfoGestor() {
		System.out.println("Nombre: " + this.nombreGestor + "\nTeléfono: " + this.telefono +
				"\nImporte máximo: " + this.importeMax + " €");
	}
	
}
