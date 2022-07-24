package questao05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MeuEstoque {
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja, o programa
	 * deverá trabalhar com Collection do tipo ArrayList do Java para manipular os
	 * dados desse estoque, o programa deverá atender as seguintes funcionalidades:
	 * - Armazenar dados da ArrayList - Remover dados da ArrayList; - Atualizar
	 * dados da ArrayList. - Apresentar todos os dados da ArrayList.
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Produto> meuEstoque = new ArrayList<>(); // Lista de estoque
		ArrayList<Character> opcoesMenu = new ArrayList<>(); // Opções do Menu
		Collections.addAll(opcoesMenu, 'a', 'b', 'c', 'd', 'e');
		char escolhaMenu;

		do { // do starts
			menu();
			System.out.println("Escolha uma opção do menu: ");
			escolhaMenu = Character.toLowerCase(input.next().charAt(0));
			input.nextLine();

			while (!opcoesMenu.contains(escolhaMenu)) {
				System.out.println("Opção inválida. Digite novamente: ");
				escolhaMenu = Character.toLowerCase(input.next().charAt(0));
				input.nextLine();
			}

			if (opcoesMenu.contains(escolhaMenu)) { // if starts

				switch (escolhaMenu) { // switch starts
				case 'a': {
					String produto;
					int estoque;

					System.out.println("Digite o nome do produto: ");
					produto = input.nextLine();
					System.out.println("Digite a quantidade do produto em estoque: ");
					estoque = Integer.parseInt(input.nextLine());
					meuEstoque.add(new Produto(produto, estoque));
					System.out.println();
					break; // case break;
				}
				case 'b': {
					String nome;
					int index = 0;
					int contadorFalse = 0;

					System.out.println("Digite o nome do produto que deseja remover: ");
					nome = input.nextLine();

					// Cria um iterator para a minha lista de objetos produto
					Iterator<Produto> iteratorEstoque = meuEstoque.iterator();

					System.out.println("Buscando o produto...");

					while (iteratorEstoque.hasNext()) {
						if (iteratorEstoque.next().getNomeProduto().equals(nome)) {
							System.out.println("Produto encontrado!");
							System.out.println("Removendo o produto...");
							meuEstoque.remove(index);
							System.out.println("Produto removido!");
							break;
						} else {
							contadorFalse++;
						}
						index++;
					}

					if (contadorFalse == meuEstoque.size()) {
						System.out.println("Produto não encontrado no sistema.");
					}

					System.out.println();
					break; // case break;
				}
				case 'c': { // case 'c' starts
					int index = 0;
					int contadorFalse = 0;

					System.out
							.println("Digite o nome do produto que deseja atualizar algum dado: ");
					String nome = input.nextLine();
					System.out.println("Buscando produto...");

					Iterator<Produto> iteratorEstoque = meuEstoque.iterator();

					while (iteratorEstoque.hasNext()) { // while starts

						if (iteratorEstoque.next().getNomeProduto().equals(nome)) { // if starts
							Produto produtoTemp = meuEstoque.get(index);
							ArrayList<Character> menuAtualizar = new ArrayList<>();
							Collections.addAll(menuAtualizar, 'a', 'b', 'c');
							char escolhaAtualizar;

							System.out
									.println("Escolha o que deseja atualizar sobre este produto: ");
							System.out.println("a) Nome");
							System.out.println("b) Estoque");
							System.out.println("c) Sair");
							System.out.println("Digite a opção desejada: ");
							escolhaAtualizar = Character.toLowerCase(input.next().charAt(0));
							input.nextLine();

							while (!menuAtualizar.contains(escolhaAtualizar)) {
								System.out.println("Opção inválida! Digite novamente: ");
								escolhaAtualizar = Character.toLowerCase(input.next().charAt(0));
								input.nextLine();
							}

							switch (escolhaAtualizar) { // switch starts
							case 'a': {
								System.out.println("Digite um novo nome para o produto: ");
								String novoNome = input.nextLine();
								System.out.println("Atualizando...");
//								Produto produtoTemp = meuEstoque.get(index);
								produtoTemp.setNomeProduto(novoNome);
								meuEstoque.set(index, produtoTemp);
								System.out.println("Produto atualizado!");
								break;
							}
							case 'b': {
								System.out.println(
										"Digite a nova quantidade de estoque do produto: ");
								int novoEstoque = Integer.parseInt(input.nextLine());
								System.out.println("Atualizando...");
//								Produto produtoTemp = meuEstoque.get(index);
								produtoTemp.setQuantidadeEstoque(novoEstoque);
								meuEstoque.set(index, produtoTemp);
								System.out.println("Produto atualizado!");
								break;
							}
							case 'c': {
								break;
							}
							} // switch ends
						} else {
							contadorFalse++;
						} // if ends
						index++;
					} // while ends

					if (contadorFalse == meuEstoque.size()) {
						System.out.println("Produto não encontrado no sistema.");
					}

					System.out.println();
					break; // case break;
				} // case 'c' ends
				case 'd': {
					if (meuEstoque.size() == 0) {
						System.out.println("Não há nenhum produto em estoque.");
					} else {
						for (Produto produto : meuEstoque) {
							System.out.println(produto.toString());
						}
					}
					System.out.println();
					break;
				}
				} // switch ends
			} // if ends
		} while (escolhaMenu != 'e'); // do ends
	}

	public static void menu() {
		System.out.println("a) Armazenar dados");
		System.out.println("b) Remover dados");
		System.out.println("c) Atualizar dados");
		System.out.println("d) Apresentar dados");
		System.out.println("e) Sair");
		System.out.println();
	}
}