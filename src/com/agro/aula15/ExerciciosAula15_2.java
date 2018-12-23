package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero para saber se ele é negativo ou positivo: ");
		
		double numero = scan.nextDouble();
		if (numero >=0) {
			System.out.println("O numero é positivo.");

		}else {
			System.out.println("O numero é negativo.");

		}
	}

}
