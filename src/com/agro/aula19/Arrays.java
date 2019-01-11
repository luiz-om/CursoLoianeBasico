package com.agro.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] a = new double[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		double[] b = new double[5];
		
		for (int i = 0; i < b.length; i++) {
			b =a;
			System.out.println(b[i]);
		}
	}

}
