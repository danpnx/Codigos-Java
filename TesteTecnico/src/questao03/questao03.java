package questao03;

import java.util.Scanner;

public class questao03 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.
		 */

		Scanner input = new Scanner(System.in);
		double numeroDigitado;
		double somaNumerosDigitados = 0.0;

		do {
			System.out.println("Digite um número: ");
			numeroDigitado = input.nextInt();
			if (numeroDigitado == 0) {
				break;
			} else {
				somaNumerosDigitados += numeroDigitado;
			}
		} while (numeroDigitado != 0);

		if (somaNumerosDigitados == 0.0) {
			System.out.println("A soma dos números digitados é igual a " + somaNumerosDigitados
					+ " pois nenhum número diferente de zero foi digitado pelo usuário.");
		} else {
			System.out.println("A soma dos números digitados é igual a: " + somaNumerosDigitados);
		}
	}
}
