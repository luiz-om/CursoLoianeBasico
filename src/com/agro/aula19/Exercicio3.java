package com.agro.aula19;

public class Exercicio3 {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		int tamanhoArray = 19;
		int[] a = new int[tamanhoArray];
		int[] b = new int[a.length];
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = n + 1;
			n++;
			b[i] = a[i] * 2;

			// System.out.println(b[i]);

			// System.out.println(b);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		// int[] b = new int[a.length];

		/*
		 * for (int i = 0; i < a.length; i++) { b[i] = a[i] * a[i] ;
		 * 
		 * System.out.println(b[i]); }
		 */
	}
}
