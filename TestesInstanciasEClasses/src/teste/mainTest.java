package teste;
import java.util.Scanner;

public class mainTest {

	public static void main(String[] args) {
		Aluno alunoUm = new Aluno();
		
		alunoUm.nomeAluno = "Daniel Nunes";
		alunoUm.idadeAluno = 26;
		alunoUm.cursoAluno = "Ciencia da Computacao";
		alunoUm.matriculaAluno = "1122330";
		alunoUm.notasAluno = escreverNotas();
		alunoUm.showAluno();
	}
	
	public static float[] escreverNotas(){
		Scanner scanner = new Scanner(System.in);
		float[] notas = new float[5];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i+1) + ": ");
			notas[i] = scanner.nextFloat();
		}
		
		return notas; 
	};

}
