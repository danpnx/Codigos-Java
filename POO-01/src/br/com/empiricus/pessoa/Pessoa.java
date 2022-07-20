package br.com.empiricus.pessoa;

public abstract class Pessoa {
	private String nomePessoa;
	private int idadePessoa;
	private String enderecoPessoa;
	
	public void setNomePessoa(String nome) {
		this.nomePessoa = nome;
	}
	public String getNomePessoa() {
		return this.nomePessoa;
	}
	
	public void setIdadePessoa(int idade) {
		this.idadePessoa = idade;
	}
	public int getIdadePessoa() {
		return this.idadePessoa;
	}
	
	public void setEnderecoPessoa(String endereco) {
		this.enderecoPessoa = endereco;
	}
	public String getEnderecoPessoa() {
		return this.enderecoPessoa;
	}
	
	public void mostrarPessoa() {
	}
}
