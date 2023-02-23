package com.cursoceat.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaramos el objeto de la clase 'Scanner'
		Scanner input = new Scanner(System.in);
		
		// Creo mi objeto 1 -> miCta
		System.out.print("Indique el nombre: ");
		String nombre = input.nextLine();
		System.out.print("Indique el DNI: ");
		String miDni = input.nextLine();
		CuentaCorriente miCta = new CuentaCorriente(nombre, miDni);
		// Preguntamos el importe a ingresar
		System.out.print("Indique la cantidad a ingresar: ");
		double miIngreso = input.nextDouble();
		input.nextLine(); // Vaciamos el buffer del scanner
		// Actualizamos el saldo según el importe ingresado
		miCta.ingreso(miIngreso);
		// Preguntamos el banco
		System.out.print("Nombre del Banco: ");
		CuentaCorriente.setNombreBanco(input.nextLine());
		// Preguntamos el importe a retirar
		System.out.print("Indique la cantidad a retirar: ");
		double miEgreso = input.nextDouble();
		input.nextLine(); // Vaciamos el buffer del scanner
		// Actualizamos el saldo restando el importe retirado
		miCta.egreso(miEgreso);
		// Creamos el Gestor 1
		Gestor miGestor1 = new Gestor("Jose Luis Valcarcel", "06585858M");
		miCta.miGestor = miGestor1;
		// Mostramos la información
		miCta.mostrarInformacion();
		
		// Creo mi objet 2 -> miCta2
		System.out.println("**********Creo el objeto 2************");
		System.out.print("Indique el DNI: ");
		miDni = input.nextLine();
		System.out.print("Indique el saldo inicial al crear la cuenta: ");
		double saldoInicial = input.nextDouble();
		input.nextLine(); // Vaciamos el buffer del scanner
		CuentaCorriente miCta2 = new CuentaCorriente(miDni, saldoInicial);
		System.out.print("Indique el nombre: ");
		miCta2.nombre = input.nextLine();
		// Creo mi Gestor 2
		Gestor miGestor2 = new Gestor("Beatriz López", "06585858B");
		miCta2.miGestor = miGestor2;
		System.out.println("Datos de la cuenta 1");
		miCta.mostrarInformacion();
		System.out.println("Datos de la cuenta 2");
		miCta2.mostrarInformacion();
		
		
		// Cerramos el objeto de la clase 'Scanner'
		input.close();
	}

}
