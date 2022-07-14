package br.com.empiricus.foreach;

public class TesteForEach {

	public static void main(String[] args) {
		String[] nomes = {"Daniel", "Vitor", "Eric", "Daniel", "Pedro", "Marcell", "Daniel"};
		int contador = 0;
		
		for(String nome: nomes) {
			if(nome == "Daniel") {
				contador++;
			}
		}
		
		System.out.println("O numero de repeticoes é: " + contador);
	}

}
