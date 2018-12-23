package com.agro.aula15;

import java.util.Scanner;

public class ExerciciosAula15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite Seu sexo. M-Masculino, F-Feminino: ");
		String sexo = scan.next();

		
		switch (sexo) {
		case "F": System.out.println("Feminino");break;
		case "M": System.out.println("Sexo Masculimo"); break;
		default : System.out.println("Sexo Invalido");
			break;
		}
	}

}
