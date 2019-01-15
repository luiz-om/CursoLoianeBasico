package com.agro.aula24;

import java.text.DecimalFormat;

public class TesteLampada {

	public static void main(String[] args) {
		

		Lampada lampada = new Lampada();

		lampada.marca = "fiatalis";
		lampada.modelo = "Led";
		lampada.voltagem= 110;
		lampada.ciclos = 1500033;
		
		DecimalFormat df = new DecimalFormat("#,###.#");
		
		
		System.out.println("Informações da lampada: ");
		System.out.println("Marca: " + lampada.marca);
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Voltagem: " + lampada.voltagem);
		System.out.println("Ciclos: " + df.format(lampada.ciclos) );

	}

}
