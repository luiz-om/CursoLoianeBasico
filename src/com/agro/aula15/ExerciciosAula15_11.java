package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do seu salario para calcular seu aumento: ");

		double salario = scan.nextDouble();
		double valorAumento = 0;
		int percentual=0;
		if (salario <= 280) {
			percentual = 20;
		} else if (salario >= 280 && salario <= 700) {
			percentual =15;
		} else if (salario >= 700 && salario <= 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual =5;	
		}
		
		valorAumento = (salario / 100) * percentual;
		double salarioAjustado = (salario + valorAumento);
		System.out.println("Seu salario é R$ " + salario);
		System.out.println("Valor do aumento R$ " + valorAumento);
		System.out.println("Porcentagem de aumento do salario " + percentual + "%");
		System.out.println("O valor do seu salario com o reajuste é R$ " + salarioAjustado);

	}
}
