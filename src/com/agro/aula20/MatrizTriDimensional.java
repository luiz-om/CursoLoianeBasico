package com.agro.aula20;

import java.util.Scanner;

public class MatrizTriDimensional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("digite o numero: ");
			numeros[i] = scan.nextInt();
			//System.out.println(numeros[i]);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + " ");
		}
	
		
	}

}
