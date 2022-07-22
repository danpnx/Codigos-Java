package br.com.empiricus.contacorrente;

import java.util.Scanner;

public class Main {

	/*
	 * Conta Corrente - Cria uma classe para representar uma conta corrente que
	 * possui um número, um saldo, um status que informa se ela é especial ou não,
	 * um limite. Desenvolva métodos para realizar saque (verificando se o cliente
	 * pode realizar saques), depositar dinheiro, consultar saldo e verificar se o
	 * cliente está usando cheque especial ou não. Desenvolva um programa para
	 * testar essa classe.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContaCorrente minhaConta = new ContaCorrente();

		System.out.println("Digite o seu numero: ");
		minhaConta.numero = input.nextLine();

		System.out.println("Digite o seu saldo: ");
		minhaConta.saldo = input.nextDouble();
		input.nextLine(); // Limpa o buffer do scanner
		// numerico M(int, double, float, byte...), boolean, caractere

		System.out.println(
				"Digite \'true\' caso a conta seja especial ou \'false\' para o contrário: ");
		minhaConta.especial = input.nextBoolean();
		input.nextLine(); // Limpa o buffer do scanner

		System.out.println("Digite o limite: ");
		minhaConta.limite = input.nextDouble();
		input.nextLine();

		System.out.println("Digite um valor para o saque: ");
		double valorSaque = input.nextDouble();
		input.nextLine();

		if (minhaConta.realizarSaque(valorSaque)) {
			System.out.println("Saque realizado com sucesso.");
			minhaConta.consultarSaldo();
		} else {
			System.out.println("Impossível realizar o saque.");
		}

		System.out.println("Digite um valor para depositar: ");
		double valorDeposito = input.nextDouble();
		input.nextLine();
		minhaConta.depositarDinheiro(valorDeposito);
		minhaConta.consultarSaldo();
		minhaConta.verificarEspecial();

		input.close();
	}
}