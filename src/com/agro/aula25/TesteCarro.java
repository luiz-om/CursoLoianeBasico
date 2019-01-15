package com.agro.aula25;



public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 10;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		System.out.println("teste " + van.obterAutonomia());
		System.out.println("teste " + van.capacidadeCombustivel);
	}

}
