package com.agro.pack;

import java.util.Scanner;

public class Aula13Exercicios7 {

	public static void main(String[] args) {
		System.out.println("AREA DE UM QUADRADO");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho dos lados do quadrado: ");
		
		double ladoQuadrado = scan.nextDouble();
		
		double areaquadrado = Math.pow(ladoQuadrado, 2);
		areaquadrado *= areaquadrado;
		
		System.out.println("A area do quadrado elevado ao quadrado é: " + areaquadrado);
	}

}
