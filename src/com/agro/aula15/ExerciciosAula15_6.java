package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("digite o segundo numero: ");
		double numero2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double numero3 = scan.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O primeiro numero é maior que os outros: " + numero1);
		}else if(numero2 > numero1) {
			System.out.println("O segundo numero é maior que os outros: " + numero2);
		}else {
			System.out.println("O terceiro numero é o maior");
		}
	}

}
