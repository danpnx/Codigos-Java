package questao01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		/*
		 * O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escreva um sistema que leia o custo de fábrica de um carro e imprima na tela
		 * o custo ao consumidor.
		 */

		/*
		 * custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos
		 */
		Scanner input = new Scanner(System.in);
		double custoFabrica = 0.0;
		final int porcentagemDistribuidor = 28;
		final int porcentagemImpostos = 45;
		double custoConsumidor = 0.0;

		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = input.nextDouble();
		custoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor / 100)
				+ (custoFabrica + porcentagemImpostos * 100);
		System.out.print("O custo ao consumidor é de R$ " + custoConsumidor + ".");
	}
}
