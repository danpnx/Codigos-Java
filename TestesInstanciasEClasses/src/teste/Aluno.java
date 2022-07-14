package teste;

public class Aluno {

	String nomeAluno;
	byte idadeAluno;
	String cursoAluno;
	String matriculaAluno;
	float[] notasAluno = new float[5];

	void showAluno() {
		System.out.println("Nome: " + nomeAluno);
		System.out.println("Idade: " + idadeAluno);
		System.out.println("Curso: " + cursoAluno);
		System.out.println("Matricula: " + matriculaAluno);
		System.out.print("| ");
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Nota " + (i+1) + ": " + notasAluno[i] + "  ");
		}
		System.out.print(" |");
	}
}
