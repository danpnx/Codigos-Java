package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Aluno extends Pessoa implements SalaDeAula {

	private String cursoAluno;
	// um aluno deve estar sempre matriculado em três disciplinas
	private String[] disciplinasMatriculadas = new String[3];

	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public String[] getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}

	public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}

	@Override
	public void enviarEmail(String mensagem) {
		System.out.println("Mensagem: " + mensagem);
		System.out.println("Enviando mensagem para o aluno " + this.getNomePessoa() + "...");
		System.out.println("Mensagem enviada.");
	}

	@Override
	public void marcarPresenca(boolean presenca) {
		if (presenca) {
			System.out.println("O aluno estava presente em sala de aula.");
		} else {
			System.out.println("O aluno não estava presente em sala de aula.");
		}

	}

	@Override
	public String aplicarPesquisa() {
		Scanner input = new Scanner(System.in);
		String respostaPesquisa = "";
		char escolhaResposta;
		System.out.println("1. O que você achou da aula de hoje?");
		System.out.println("a) Gostei do tema e da forma como o(a) professor(a) conduziu.");
		System.out.println(
				"b) Tive dificuldade de acompanhar a aula mas consegui captar alguns assuntos.");
		System.out.println("c) Não consegui entender nada do que foi ensinado.");

		System.out.print("Digite a sua resposta: ");
		escolhaResposta = Character.toUpperCase(input.next().charAt(0));

		while (escolhaResposta != 'A' && escolhaResposta != 'B' && escolhaResposta != 'C') {
			System.out.print("Resposta inválida. Digite novamente: ");
			escolhaResposta = Character.toUpperCase(input.next().charAt(0));
		}

		if (escolhaResposta == 'A') {
			respostaPesquisa = "Gostei do tema e da forma como o(a) professor(a) conduziu.";
		} else if (escolhaResposta == 'B') {
			respostaPesquisa = "Tive dificuldade de acompanhar a aula mas consegui captar alguns assuntos.";
		} else if (escolhaResposta == 'C') {
			respostaPesquisa = "Não consegui entender nada do que foi ensinado.";
		}
		if (input.hasNextLine()) {
			input.nextLine();
		}

		return respostaPesquisa;
	}

	@Override
	public String toString() {
		return "Aluno [cursoAluno=" + cursoAluno + ", disciplinasMatriculadas="
				+ Arrays.toString(disciplinasMatriculadas) + "]";
	}
}
