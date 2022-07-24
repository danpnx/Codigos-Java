package questao02;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		/*
		 * Escreva um sistema que receba valores de base e altura de um triângulo e
		 * verifique se são valores válidos (positivos maiores que zero). Em caso
		 * afirmativo, calcule e imprima na tela a área do triângulo.
		 */
		Scanner input = new Scanner(System.in);
		double baseTriangulo;
		double alturaTriangulo;
		double areaTriangulo;

		System.out.println("Digite um valor para a base do triângulo: ");
		baseTriangulo = input.nextDouble();
		while (baseTriangulo <= 0) {
			System.out.println("Valor inválido! Digite um número positivo maior que zero: ");
			baseTriangulo = input.nextDouble();
		}

		System.out.println("Digite um valor para a altura do triângulo: ");
		alturaTriangulo = input.nextDouble();
		while (alturaTriangulo <= 0) {
			System.out.println("Valor inválido! Digite um número positivo maior que zero: ");
			alturaTriangulo = input.nextDouble();
		}

		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;
		System.out.println("A área do triângulo de base " + baseTriangulo + " e altura "
				+ alturaTriangulo + " é: " + areaTriangulo);
	}
}
