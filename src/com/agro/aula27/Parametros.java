package com.agro.aula27;

import java.util.Scanner;

public class Parametros {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 10;
		
		double km =0;
		System.out.println("");
		km = scan.nextDouble();
		System.out.println(van.calcularCombustivel(km)+ "L necessario para fazer a viagem");
		System.out.println(van.valorCombustivel(3.89));
	}

}
