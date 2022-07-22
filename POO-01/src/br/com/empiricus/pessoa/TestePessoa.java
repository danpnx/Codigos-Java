package br.com.empiricus.pessoa;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Efetivo[] funcionariosEfetivos = new Efetivo[0];
		char opcaoMenu = '0';

		do {
			String nextLineCatch;
			System.out.println("------------------------------");
			mostrarMenu();
			System.out.print("Digite uma opção: ");
			opcaoMenu = scanner.next().charAt(0);
			while (opcaoMenu != '1' && opcaoMenu != '2' && opcaoMenu != '3' && opcaoMenu != '4'
					&& opcaoMenu != '5' && opcaoMenu != '6' && opcaoMenu != '7') {
				System.out.println("Opção inválida! Digite novamente: ");
				if (scanner.hasNextLine()) {
					nextLineCatch = scanner.nextLine();
				}
				opcaoMenu = scanner.next().charAt(0);
			}
			if (opcaoMenu == '1') {
				System.out.println(".........................................");
				funcionariosEfetivos = cadastrarEfetivo(funcionariosEfetivos);
			} else if (opcaoMenu == '2') {
				System.out.println(".........................................");
				System.out.print("Digite o nome do funcionário: ");
				if (scanner.hasNextLine()) {
					nextLineCatch = scanner.nextLine();
				}
				String nomeParaBuscar = scanner.nextLine();
				mostrarEfetivo(funcionariosEfetivos, nomeParaBuscar);
			} // CONTINUAR DAQUI
		} while (opcaoMenu != '7');

		scanner.close();
	}

	public static void mostrarMenu() {

		System.out.println("1. Cadastrar Funcionário Efetivo");
		System.out.println("2. Mostrar Funcionário Efetivo");
		System.out.println("3. Cadastrar Estagiário");
		System.out.println("4. Mostrar Estagiário");
		System.out.println("5. Cadastrar Cliente");
		System.out.println("6. Mostrar Cliente");
		System.out.println("7. Sair");
	}

	public static Efetivo[] cadastrarEfetivo(Efetivo[] funcionariosEfetivos) {
		Scanner scanner = new Scanner(System.in);
		Efetivo[] funcionariosEfetivosTemp = new Efetivo[funcionariosEfetivos.length + 1];
		Efetivo novoEfetivo = new Efetivo();
		System.out.print("Nome do funcionário: ");
		novoEfetivo.setNomePessoa(scanner.nextLine());
		System.out.print("Idade do funcionário: ");
		novoEfetivo.setIdadePessoa(scanner.nextInt());
		scanner.nextLine(); // evita erro de entrada de dados
		System.out.print("Endereço do funcionário: ");
		novoEfetivo.setEnderecoPessoa(scanner.nextLine());
		System.out.print("Salário do funcionário: ");
		novoEfetivo.setSalarioFuncionario(scanner.nextDouble());
		scanner.nextLine(); // evita erro de entrada de dados
		System.out.print("Setor de trabalho: ");
		novoEfetivo.setSetorTrabalho(scanner.nextLine());
		System.out.print("Função de trabalho: ");
		novoEfetivo.setFuncaoTrabalho(scanner.nextLine());
		System.out.print("Tempo de empresa(em meses): ");
		novoEfetivo.setTempoDeEmpresaEmMeses(scanner.nextInt());
		scanner.nextLine();

		for (int i = 0; i < funcionariosEfetivosTemp.length; i++) {
			if (i < funcionariosEfetivos.length) {
				funcionariosEfetivosTemp[i] = funcionariosEfetivos[i];
			} else {
				funcionariosEfetivosTemp[i] = novoEfetivo;
			}
		}
		return funcionariosEfetivosTemp;
	}

	public static void mostrarEfetivo(Efetivo[] funcionariosEfetivos, String nomeParaBuscar) {
		int contadorBusca = 0;

		if (funcionariosEfetivos.length == 0) {
			System.out.println("*** Não há nenhum funcionário efetivo cadastrado no sistema ***");
		} else {
			for (Efetivo funcionario : funcionariosEfetivos) {
				if (funcionario.getNomePessoa().equals(nomeParaBuscar)) {
					funcionario.mostrarPessoa();
				} else {
					contadorBusca++;
				}
			}
		}

		if (contadorBusca == funcionariosEfetivos.length) {
			System.out.println("Funcionário não identificado no sistema");
		}
	}
}