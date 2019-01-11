package com.agro.aula19;

public class Exercicio2 {

	public static void main(String[] args) {
		double[] a = new double[8];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
	
		
		double[] b = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i] * 2;
			
			System.out.println(b[i]);
		}

	}

}
