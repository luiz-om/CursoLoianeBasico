package com.agro.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 1; // conunt ou cont
		int max = 10;

		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("valor de i: " + i);
			i++; // i= i + i; ou i+= i;
		}
		System.out.println(i);

		do {
			i++;
			System.out.println("valor de i: " + i);
		} while (i < 15);
		System.out.println(i);

	}
}
