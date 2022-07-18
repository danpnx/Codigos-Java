package br.com.empiricus.atividade05;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete pat01 = new Patinete();
		pat01.setMarcaPatinete("Shell");
		pat01.setModeloPatinete("SR-5S");
		pat01.setQuantidadeRodas(2);
		pat01.setPatineteEletrico(true);
		
		pat01.mostrarPatinete();

	}

}
