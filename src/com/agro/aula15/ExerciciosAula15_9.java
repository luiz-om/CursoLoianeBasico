package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int numero3 = scan.nextInt();

		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			// num1 é o menor
			// num3 é o maior
			// num1 <num2 < num3
			System.out.println(numero3 + "\n" + numero2 + "\n" + numero1);
		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			// num1 é o menor
			// num2 é o maior
			// num1 < num3 < num2
			System.out.println(numero2 + "\n" + numero3 + "\n" + numero1);
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			// num2 é o menor
			// num3 é o maior
			// num2 < num1 < num3
			System.out.println(numero3 + "\n" + numero1 + "\n" + numero2);
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1) {
			// num2 é o menor
			// num1 é o maior
			// num2 < num3 < num1
			System.out.println(numero1 + "\n" + numero3 + "\n" + numero2);
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
			// num3 é o menor
			// num2 é o maior
			// num3 < num1 < num2
			System.out.println(numero2 + "\n" + numero1 + "\n" + numero3);
		} else if (numero3<= numero1 && numero3 <= numero2 && numero2 <= numero1) {
			//num3 é o menor
			//num1 é o maior
			//num3 < num2 < num1
			System.out.println(numero1 + "\n" + numero2 + "\n" + numero3);
		}
	}
}
