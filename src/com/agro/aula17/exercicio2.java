package com.agro.aula17;

import java.util.Scanner;

public class exercicio2 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean senhaDiferente =  false;
		System.out.println("Digite seu nome: ");
		String nomeUsuario = scan.next();
		String  senhaUsuario;
		do {
			
			
			System.out.println("Digite sua senha: ");
			senhaUsuario = scan.next();
			
			if (senhaUsuario.toUpperCase().equals(nomeUsuario.toUpperCase())) {
				
				System.out.println("Desculpe a senha nao pode ser igual ao nome!!");
			}else if (senhaUsuario.length() < 3) {
				System.out.println("Senha muito curta");
			}
			else {
				System.out.println("Senha cadastrada com sucesso.");
				senhaDiferente = true;
			}
			
		} while (!senhaDiferente);
		
		System.out.println("Obrigado por utilizar nossos serviços");
		System.out.println("Nome de usuario: " + nomeUsuario + "\n" + "Senha: " + senhaUsuario);
	}
}
