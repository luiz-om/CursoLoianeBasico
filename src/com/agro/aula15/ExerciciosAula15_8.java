package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Digite o valor do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Digite o valor do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O primeiro produto é  o mais barato, realizar compra!");
		}else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O segundo produto é  o mais barato, realizar compra!");
		}else if (produto3 <= produto1 && produto3 <= produto2) {
			System.out.println("O terceiro produto é  o mais barato, realizar compra!");
		}
		
	}
}
