package com.agro.aula25;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do "
				+ "carro é: " 
				+ capacidadeCombustivel * consumoCombustivel + " km/l");
	}
	double obterAutonomia(){
		double calculo = capacidadeCombustivel * consumoCombustivel;
		return calculo;
	}
	
}
