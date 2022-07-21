package aluno;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno01 = cadastrarAluno();
		informarAprovacao(aluno01);
	}

	public static Aluno cadastrarAluno() {
		Scanner input = new Scanner(System.in);
		String nome;
		String matricula;
		String curso;
		String[] disciplinas = new String[3];
		double[] notas = new double[3];

		System.out.print("Nome do aluno: ");
		nome = input.next();
		System.out.print("Matricula: ");
		matricula = input.next();
		System.out.print("Curso: ");
		curso = input.next();
		for (int index = 0; index < disciplinas.length; index++) {
			System.out.print((index + 1) + "a. disciplina: ");
			disciplinas[index] = input.next();
			input.nextLine();
			System.out.print("Nota da " + (index + 1) + "a. disciplina: ");
			notas[index] = input.nextDouble();
		}
		Aluno alunoTemp = new Aluno();
		alunoTemp.setNomeAluno(nome);
		alunoTemp.setMatriculaAluno(matricula);
		alunoTemp.setCursoAluno(curso);
		alunoTemp.setDisciplinasMatriculadas(disciplinas);
		alunoTemp.setNotasDisciplinas(notas);

		return alunoTemp;
	}

	public static void informarAprovacao(Aluno aluno) {
		System.out.println("Disciplinas e notas referentes ao aluno "
				+ aluno.getNomeAluno());
		for (int index = 0; index < aluno
				.getDisciplinasMatriculadas().length; index++) {
			System.out.println(
					"Disciplina: " + aluno.getDisciplinasMatriculadas()[index]);
			if (aluno.getNotasDisciplinas()[index] >= 7.0) {
				System.out
						.println("Nota: " + aluno.getNotasDisciplinas()[index]);
				System.out.println("Aprovado!");
			} else {
				System.out
						.println("Nota: " + aluno.getNotasDisciplinas()[index]);
				System.out.println("Reprovado!");
			}
		}
	}
}