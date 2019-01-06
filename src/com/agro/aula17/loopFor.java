package com.agro.aula17;

import java.util.Scanner;

public class loopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		
		do {
			int nota = 0;
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scan.nextInt();
			if (nota >0 && nota <=10) {
				notaValida = true;
				System.out.println("Obrigado, nota valida!!");
			}else {
				System.out.println("Desculpe nota invalida");
			}
		} while (!notaValida);

	}

}
