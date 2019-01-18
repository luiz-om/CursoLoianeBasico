package com.agro.aula27;

public class ContaCorrente {

	int numeroConta;
	double saldo;

	public boolean sacar(double valorSaque) {
		if (saldo >= valorSaque) {
			saldo -= valorSaque;

			return true;

		} else {
			return false;
		}
	}

	void depositar(double valorDeposito) {
		saldo += valorDeposito;

	}

	void mostrarSaldo() {
		System.out.println("Seu saldo é: " + saldo);

	}
}
