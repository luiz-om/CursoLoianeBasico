package com.agro.pack;

import java.util.Scanner;

public class Aula13Exercicios3 {

	public static void main(String[] args) {
		
		Scanner nt = new Scanner(System.in);
		
		System.out.println("Digite um numero para soma: ");
		int numero1 = nt.nextInt();
		System.out.println("Digite outro numero para soma: ");
		int numero2 = nt.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos dois numero é: " + soma);
		

	}

}
