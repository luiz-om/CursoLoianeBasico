package com.agro.aula27;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numeroConta = 1234;

		conta.depositar(100);
		boolean saqueEfetuado = conta.sacar(10);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.mostrarSaldo();
		} else {
			System.out.println("Desculpe saque nao realizado.");
		}

	}

}
