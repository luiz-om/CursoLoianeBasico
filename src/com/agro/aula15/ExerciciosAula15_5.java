package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >=10) {
			System.out.println("Aprovado com Distin��o.");
		}else if (media >= 7) {
			System.out.println("Parabens voc� esta aprovado!!");
		}else {
			System.out.println("Reprovado");
		}
	}

}
