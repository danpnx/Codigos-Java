package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteCollections {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Professor> listaProfessores = new ArrayList<>();
		ArrayList<Character> opcoesMenu = new ArrayList<>();
		Collections.addAll(opcoesMenu, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k');
		char escolhaMenu;

		do {
			mostrarMenu();
			System.out.print("Escolha uma opção: ");
			escolhaMenu = Character.toLowerCase(input.next().charAt(0));
			if (input.hasNextLine()) {
				input.nextLine();
			}

			while (opcoesMenu.contains(escolhaMenu) == false) {
				System.out.print("Escolha inválida. Digite novamente: ");
				escolhaMenu = Character.toLowerCase(input.next().charAt(0));
			}

			switch (escolhaMenu) {
			case 'a': {
				Aluno alunoTemp = cadastrarAluno();
				listaAlunos.add(alunoTemp);
				break;
			}
			case 'b': {
				Professor professorTemp = cadastrarProfessor();
				listaProfessores.add(professorTemp);
				break;
			}
			case 'c': {
				String nome;
				String mensagem;
				int contador = 0;
				System.out.println("Digite o nome do aluno que deseja enviar email: ");
				nome = input.nextLine();
				System.out.println("Digite a mensagem que deseja enviar: ");
				mensagem = input.nextLine();
				for (Aluno aluno : listaAlunos) {
					if (aluno.getNomePessoa().equals(nome)) {
						aluno.enviarEmail(mensagem);
					} else {
						contador++;
					}
				}

				if (contador == listaAlunos.size()) {
					System.out.println("Aluno(a) não encontrado no sistema.");
				}
				break;
			}
			case 'd': {
				String nome;
				String mensagem;
				int contador = 0;
				System.out.println("Digite o nome do(a) professor(a) que deseja enviar email: ");
				nome = input.nextLine();
				System.out.println("Digite a mensagem que deseja enviar: ");
				mensagem = input.nextLine();
				for (Professor professor : listaProfessores) {
					if (professor.getNomePessoa().equals(nome)) {
						professor.enviarEmail(mensagem);
					} else {
						contador++;
					}
				}

				if (contador == listaProfessores.size()) {
					System.out.println("Professor(a) não encontrado no sistema.");
				}
				break;
			}
			case 'e': {
				char escolha;
				String nome;
				int contador = 0;
				System.out.println(
						"Digite o nome do(a) aluno(a) que deseja marcar a presença no sistema: ");
				nome = input.nextLine();
				System.out.print("O(A) aluno(a) estava presente na sala de aula? Y/N: ");
				escolha = Character.toUpperCase(input.next().charAt(0));
				while (escolha != 'Y' && escolha != 'N') {
					System.out.println("Opção inválida. Digite novamente. Y/N: ");
					escolha = Character.toUpperCase(input.next().charAt(0));
				}
				for (Aluno aluno : listaAlunos) {
					if (aluno.getNomePessoa().equals(nome)) {
						if (escolha == 'Y') {
							aluno.marcarPresenca(true);
						} else {
							aluno.marcarPresenca(false);
						}
					} else {
						contador++;
					}
				}

				if (contador == listaAlunos.size()) {
					System.out.println("Aluno(a) não encontrado no sistema");
				}
				break;
			}
			case 'f': {
				char escolha;
				String nome;
				int contador = 0;
				System.out.println(
						"Digite o nome do(a) professor(a) que deseja marcar a presença no sistema: ");
				nome = input.nextLine();
				System.out.print("O(A) professor(a) lecionou a aula? Y/N: ");
				escolha = Character.toUpperCase(input.next().charAt(0));
				while (escolha != 'Y' && escolha != 'N') {
					System.out.println("Opção inválida. Digite novamente. Y/N: ");
					escolha = Character.toUpperCase(input.next().charAt(0));
				}
				for (Professor professor : listaProfessores) {
					if (professor.getNomePessoa().equals(nome)) {
						if (escolha == 'Y') {
							professor.marcarPresenca(true);
						} else {
							professor.marcarPresenca(false);
						}
					} else {
						contador++;
					}
				}

				if (contador == listaProfessores.size()) {
					System.out.println("Professor(a) não encontrado no sistema");
				}
				break;
			}
			case 'g': {
				String nome;
				String resultadoPesquisa = "";
				int contador = 0;
				System.out.println("Digite o nome do(a) aluno(a) que aplicar a pesquisa: ");
				nome = input.nextLine();
				for (Aluno aluno : listaAlunos) {
					if (aluno.getNomePessoa().equals(nome)) {
						resultadoPesquisa = aluno.aplicarPesquisa();
					} else {
						contador++;
					}
				}
				if (resultadoPesquisa == "") {
					continue;
				} else {
					System.out.println(resultadoPesquisa);
				}

				if (contador == listaAlunos.size()) {
					System.out.println("Aluno(a) não encontrado no sistema");
				}
				break;
			}
			case 'h': {
				String nome;
				String resultadoPesquisa = "";
				int contador = 0;
				System.out.println("Digite o nome do(a) professor(a) que aplicar a pesquisa: ");
				nome = input.nextLine();
				for (Professor professor : listaProfessores) {
					if (professor.getNomePessoa().equals(nome)) {
						resultadoPesquisa = professor.aplicarPesquisa();
					} else {
						contador++;
					}
				}
				if (resultadoPesquisa == "") {
					continue;
				} else {
					System.out.println(resultadoPesquisa);
				}

				if (contador == listaProfessores.size()) {
					System.out.println("Professor(a) não encontrado no sistema");
				}
				break;
			}
			case 'i': {
				String nome;
				int contador = 0;
				System.out.println("Digite o nome do(a) aluno(a) que deseja observar: ");
				nome = input.nextLine();
				for (Aluno aluno : listaAlunos) {
					if (aluno.getNomePessoa().equals(nome)) {
						System.out.println(aluno.toString());
					} else {
						contador++;
					}
				}

				if (contador == listaAlunos.size()) {
					System.out.println("Aluno(a) não encontrado no sistema");
				}
				break;
			}
			case 'j': {
				String nome;
				int contador = 0;
				System.out.println("Digite o nome do(a) professor(a) que deseja observar: ");
				nome = input.nextLine();
				for (Professor professor : listaProfessores) {
					if (professor.getNomePessoa().equals(nome)) {
						System.out.println(professor.toString());
					} else {
						contador++;
					}
				}

				if (contador == listaProfessores.size()) {
					System.out.println("Professor(a) não encontrado no sistema");
				}
				break;
			}
			}
		} while (escolhaMenu != 'k');
		input.close();
	}

	public static void mostrarMenu() {
		System.out.println("a. Cadastrar Aluno");
		System.out.println("b. Cadastrar Professor");
		System.out.println("c. Enviar email para um aluno");
		System.out.println("d. Enviar email para um professor");
		System.out.println("e. Marcar presença de um aluno");
		System.out.println("f. Marcar presença de um professor");
		System.out.println("g. Aplicar pesquisa a um aluno");
		System.out.println("h. Aplicar pesquisa a um professor");
		System.out.println("i. Mostrar curso e disciplinas matriculadas de um aluno");
		System.out.println("j. Mostrar salário e disciplina lecionada de um professor");
		System.out.println("k. Sair");
		System.out.println("----------------");
	}

	public static Aluno cadastrarAluno() {
		Scanner input = new Scanner(System.in);
		System.out.println("................");
		Aluno alunoTemp = new Aluno();
		String[] disciplinasTemp = new String[alunoTemp.getDisciplinasMatriculadas().length];
		System.out.println("Digite o nome do aluno: ");
		alunoTemp.setNomePessoa(input.nextLine());
		System.out.print("Digite a idade do aluno: ");
		alunoTemp.setIdadePessoa(input.nextInt());
		input.nextLine();
		System.out.print("Digite o email do aluno: ");
		alunoTemp.setEmail(input.next());
		input.nextLine();
		System.out.println("Digite o curso do aluno: ");
		alunoTemp.setCursoAluno(input.nextLine());
		for (int index = 0; index < alunoTemp.getDisciplinasMatriculadas().length; index++) {
			System.out.println("Digite a " + (index + 1) + "a. disciplina: ");
			disciplinasTemp[index] = input.nextLine();
		}
		alunoTemp.setDisciplinasMatriculadas(disciplinasTemp);

		return alunoTemp;
	}

	public static Professor cadastrarProfessor() {
		Scanner input = new Scanner(System.in);
		System.out.println("................");
		Professor professorTemp = new Professor();
		System.out.println("Digite o nome do professor: ");
		professorTemp.setNomePessoa(input.nextLine());
		System.out.print("Digite a idade do professor: ");
		professorTemp.setIdadePessoa(input.nextInt());
		input.nextLine();
		System.out.print("Digite o email do professor: ");
		professorTemp.setEmail(input.next());
		input.nextLine();
		System.out.print("Digite o salario do professor: ");
		professorTemp.setSalarioProfessor(input.nextDouble());
		input.nextLine();
		System.out.println("Digite a disciplina lecionada pelo professor: ");
		professorTemp.setDisciplinaLecionada(input.nextLine());

		return professorTemp;
	}
}