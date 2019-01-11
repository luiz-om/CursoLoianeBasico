package com.agro.aula24;

public class TesteCarro {

	public static void main(String[] args) {
				Carro van = new Carro();
				van.marca = "fiat";
				van.modelo = "Ducato";
				van.numeroPassageiros = 10;
				van.capacidadeCombustivel =100;
				van.consumoCombustivel = 0.2;
				
				System.out.println(van.marca);
				System.out.println(van.modelo);
				System.out.println(van.numeroPassageiros);
				System.out.println(van.capacidadeCombustivel);
				System.out.println(van.consumoCombustivel);
	}

}
