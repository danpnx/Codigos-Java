package questao04;

import java.util.Scanner;

public class Questao4_1 {

	public static void main(String[] args) {

		/*
		 * 4.1 Implemente um programa que crie os 3 tipos de animais definidos no
		 * exercício anterior e invoque o método que emite o som de cada um de forma
		 * polimórfica, isto é, independente do tipo de animal.
		 */
		Scanner input = new Scanner(System.in);
		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Preguica minhaPreguica = new Preguica();

		System.out.println("Digite o nome do cachorro: ");
		meuCachorro.setNomeAnimal(input.nextLine());
		System.out.println("Digite a idade do cachorro: ");
		meuCachorro.setIdadeAnimal(Integer.parseInt(input.nextLine()));

		System.out.println("Digite o nome do cavalo: ");
		meuCavalo.setNomeAnimal(input.nextLine());
		System.out.println("Digite a idade do cavalo: ");
		meuCavalo.setIdadeAnimal(Integer.parseInt(input.nextLine()));

		System.out.println("Digite o nome da preguiça: ");
		minhaPreguica.setNomeAnimal(input.nextLine());
		System.out.println("Digite a idade da preguiça: ");
		minhaPreguica.setIdadeAnimal(Integer.parseInt(input.nextLine()));

		meuCachorro.emitirSom();
		meuCavalo.emitirSom();
		minhaPreguica.emitirSom();
	}
}
