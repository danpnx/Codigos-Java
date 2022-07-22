package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
		 * Faça um programa para solicitar os dados de vários clientes e armazenar em um
		 * ArrayList até que se digite um número de ID negativo. Em seguida exiba os
		 * dados de todos os clientes via SystemOut, formatando cada objeto separado por
		 * linhas.
		 */

		Scanner input = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		// ArrayList<tipo de dado: Integer, Double, Character, String> nomeDoObjeto =
		// new ArrayList<>();

		Cliente cl1 = new Cliente(111, "Daniel", 26, "99482135");
		int idTemp = 0;

		do {
			Cliente clienteTemp = new Cliente();
			System.out.println("Digite o ID do cliente: ");
			clienteTemp.setId(Integer.parseInt(input.nextLine()));
			idTemp = clienteTemp.getId();
			if (idTemp < 0) {
				break;
			} else {
				// numerico(double, int, float...), caractere, boolean
				// Integer.parseInt(scanner); / Double.parseDouble(scanner)...
				System.out.println("Digite o nome do cliente: ");
				clienteTemp.setNome(input.nextLine());
				System.out.println("Digite a idade do cliente: ");
				clienteTemp.setIdade(Integer.parseInt(input.nextLine()));
				System.out.println("Digite o telefone do cliente: ");
				clienteTemp.setTelefone(input.nextLine());
				System.out.println();
			}
			listaClientes.add(clienteTemp);
		} while (idTemp > 0);

		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.toString());
		}
	}

	/*
	 * do { System.out.println("Digite o ID do cliente: ");
	 * cl2.setId(Integer.parseInt(input.nextLine())); if(cl2.getId() < 0) { break; }
	 * else { System.out.println("Digite o nome do cliente: ");
	 * cl2.setNome(input.nextLine()); } }while(cl2.getId() < 0);
	 */
}
