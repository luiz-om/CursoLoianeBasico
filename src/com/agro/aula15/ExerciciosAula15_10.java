package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o turno em que você estuda: M-Matutino V-Vespertino ou N-Noturno");

		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Voce estuda no turno matutino.");
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Voce estuda no turno vespertino.");
		}else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Voce estuda no turno noturno.");
		}else {
			System.out.println("Desculpe turno invalido!");
		}
	}

}
