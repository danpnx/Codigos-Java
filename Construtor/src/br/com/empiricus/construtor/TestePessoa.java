package br.com.empiricus.construtor;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa("Edu", 29);
		Pessoa pessoa02 = new Pessoa("Neto", 35, 'M');
		Pessoa pessoa03 = new Pessoa();
		System.out.println(pessoa01.getNome());
		System.out.println(pessoa01.getIdade());
		System.out.println(pessoa02.getNome());
		System.out.println(pessoa02.getIdade());
		System.out.println(pessoa02.getSexo());
		System.out.println(pessoa03.getNome());
		System.out.println(pessoa03.getIdade());
		System.out.println(pessoa03.getSexo());
	}

}
