package collections;

import java.util.Scanner;

public class Professor extends Pessoa implements SalaDeAula {

	private double salarioProfessor;
	private String disciplinaLecionada;

	public String getDisciplinaLecionada() {
		return disciplinaLecionada;
	}

	public void setDisciplinaLecionada(String disciplinaLecionada) {
		this.disciplinaLecionada = disciplinaLecionada;
	}

	public void setSalarioProfessor(double valor) {
		this.salarioProfessor = valor;
	}

	public double getSalarioProfessor() {
		return this.salarioProfessor;
	}

	@Override
	public void enviarEmail(String mensagem) {
		System.out.println("Mensagem: " + mensagem);
		System.out.println("Enviando mensagem para o professor " + this.getNomePessoa() + "...");
		System.out.println("Mensagem enviada.");
	}

	@Override
	public void marcarPresenca(boolean presenca) {
		if (presenca) {
			System.out.println("A aula foi lecionada pelo professor.");
		} else {
			System.out
					.println("O professor não esteve presente em sala de aula e foi substituído.");
		}
	}

	@Override
	public String aplicarPesquisa() {
		Scanner input = new Scanner(System.in);
		String respostaPesquisa = "";
		char escolhaResposta;
		System.out.println("1. O que você achou do desempenho dos alunos na aula de hoje?");
		System.out.println(
				"a) Os alunos foram participativos e mostraram-se interessados no assunto.");
		System.out
				.println("b) Os alunos estavam dispersos e mostraram pouco interesse no assunto.");
		System.out.println("c) Os alunos estavam completamente desinteressados no assunto.");

		System.out.print("Digite a sua resposta: ");
		escolhaResposta = Character.toUpperCase(input.next().charAt(0));

		while (escolhaResposta != 'A' && escolhaResposta != 'B' && escolhaResposta != 'C') {
			System.out.print("Resposta inválida. Digite novamente: ");
			escolhaResposta = Character.toUpperCase(input.next().charAt(0));
		}

		if (escolhaResposta == 'A') {
			respostaPesquisa = "Os alunos foram participativos e mostraram-se interessados no assunto.";
		} else if (escolhaResposta == 'B') {
			respostaPesquisa = "Os alunos estavam dispersos e mostraram pouco interesse no assunto.";
		} else if (escolhaResposta == 'C') {
			respostaPesquisa = "Os alunos estavam completamente desinteressados no assunto.";
		}

		return respostaPesquisa;
	}

	@Override
	public String toString() {
		return "Professor [salarioProfessor=" + salarioProfessor + ", disciplinaLecionada="
				+ disciplinaLecionada + "]";
	}
}
