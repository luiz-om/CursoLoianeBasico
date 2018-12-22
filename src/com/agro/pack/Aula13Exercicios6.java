package com.agro.pack;

import java.util.Scanner;

public class Aula13Exercicios6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("AREA DO CIRCULO");
		
		System.out.println("Digite o raio do circulo: ");
		
		float raio = scan.nextFloat();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		
		System.out.println("A area do circulo é: "+area);
				
	}

}
