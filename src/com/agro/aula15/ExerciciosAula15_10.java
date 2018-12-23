package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o turno em que você estuda: M-Matutino V-Vespertino ou N-Noturno");

		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom Dia!!");
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!!");
		}else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!!");
		}else {
			System.out.println("Valor invalido!!");
		}
		switch(turno){
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!");
		default: System.out.println("VAlor inválido!"); break;
		}
	}
}
	
	
	