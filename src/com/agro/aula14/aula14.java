package com.agro.aula14;

import java.util.Scanner;

public class aula14 {

	public static void main(String[] args) {
		//IF ELSE
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("Desculpe para acessar o conteudo "
					+ "é preciso ser maior de 18 anos");
		}

	}

}
