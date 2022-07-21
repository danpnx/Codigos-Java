package aluno;

public class Aluno {

	/*
	 * Escreva uma classe para representar um Aluno. Adicione atributos
	 * relacionados às características de um Aluno, como nome, matrícula, curso
	 * que está matriculado, nome de 3 disciplinas que está cursando e as notas
	 * dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
	 * aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva
	 * um programa para testar essa classe, que pede as informações do aluno ao
	 * usuário e ao final informa o nome das disciplinas, mostra as notas e
	 * mostra se o aluno for aprovado ou não.
	 */

	private String nomeAluno;
	private String matriculaAluno;
	private String cursoAluno;
	private String[] disciplinasMatriculadas = new String[3];
	private double[] notasDisciplinas = new double[3];

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

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

	public double[] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public boolean verificarAprovacao(String disciplina) {
		boolean aprovacao = false;
		for (int index = 0; index < this
				.getDisciplinasMatriculadas().length; index++) {
			if (this.getDisciplinasMatriculadas()[index].equals(disciplina)) {
				if (this.getNotasDisciplinas()[index] >= 7.0) {
					aprovacao = true;
				}
			}
		}
		return aprovacao;
	}
}
