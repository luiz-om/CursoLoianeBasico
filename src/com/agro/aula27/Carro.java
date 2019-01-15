package com.agro.aula27;

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
	
	double calcularCombustivel(double km) {
			double qtdCombustivel = km / consumoCombustivel;
			return qtdCombustivel;
	}
	double valorCombustivel(double valorComb) {
		double km = 0;
		double valorCombustivel = km * valorComb;
		return valorCombustivel;
	}
	
}
