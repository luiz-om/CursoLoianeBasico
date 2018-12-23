package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O primeiro numero digitado é maior que o segudo.");
		}else {
			System.out.println("O segundo numero digitado é maior que o primeiro.");
		}
	}

}
