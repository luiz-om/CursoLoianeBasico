package com.agro.aula15;

import java.util.Scanner;

/**
 * @author luizf
 *
 */
public class ExerciciosAula15_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra para saber se é vogal ou consoante.");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("É uma vogal");
		}else {
			System.out.println("É uma consoante");
		}
	}

}
