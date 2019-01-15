package com.agro.aula27;

public class Lampada {
	String marca;
	String modelo;
	int voltagem;
	boolean ligado;

	void ligar() {
		ligado = true;
	}

	void desligar() {
		ligado = false;
	}

	void mostrarEstado() {
		if(ligado){
			System.out.println("lampada ligada." );
		}else {
			System.out.println("lampada desligada.");
		}
	}
}
