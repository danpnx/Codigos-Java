package teste;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		char sexo;
		int idade;
		double salario;
		boolean estudante;

		System.out.print("Digite se é um estudante: ");
		estudante = Boolean.parseBoolean(input.nextLine());
		System.out.print("Digite o seu nome: ");
		nome = input.nextLine();

	}

}
