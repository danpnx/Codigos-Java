package testesgerais;

import java.util.Arrays;

public class TesteArrays {

	public static void main(String[] args) {
		// equals -> compara se são iguais
		// copyOf -> copia um array para outro, pede o novo tamanho do array e retorna
		// esse novo array
		//

		String[] listaNomes = { "Daniel", "Pedro", "Matheus" };
		System.out.println("Lista nomes desatualizada: ");
		for (String nome : listaNomes) {
			System.out.printf("\t %s \n", nome);
		}

		listaNomes = atualizarListaNomes(listaNomes, "Sabryna");
		System.out.println("Lista nomes atualizado: ");
		for (String nome : listaNomes) {
			System.out.printf("\t %s \n", nome);
		}
	}

	public static String[] atualizarListaNomes(String[] listaNomes, String novoNome) {
		String[] arrayTemp = Arrays.copyOf(listaNomes, listaNomes.length + 1);
		arrayTemp[arrayTemp.length - 1] = novoNome;
		return arrayTemp;
	}
}