package com.agro.pack;

import java.util.Scanner;

public class Aula13Exercicios5 {

	public static void main(String[] args) {
		System.out.println("CONVERSÃO DE METROS EM CENTRIMETROS\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero para converter em metros: ");
		
		float metros = scan.nextFloat();
		float centimetros = metros*100;
		System.out.println("O numero " + metros + " convertido para centimetros é " + centimetros + " cm");

	}

}
