package br.com.empiricus.construtor;

public class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	
	public void setNome(String nome) {
		this.nome= nome; 
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return this.sexo;
	}
	
	// Sobrecarga de construtor
	Pessoa(String nome, int idade, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		System.out.println("Construtor pessoa com três parametros");
	}
	Pessoa(String nome, int idade){
		System.out.println("Construtor pessoa com dois parametros");
		this.nome = nome;
		this.idade = idade;
	}
	Pessoa(){
		System.out.println("Construtor pessoa com os atributos já inicializados");
		this.nome = "Daniel";
		this.idade = 26;
		this.sexo = 'M';
	}
}
