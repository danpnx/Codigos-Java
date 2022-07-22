package exercicio01;

public class Cliente {

	/*
	 * Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
	 * Faça um programa para solicitar os dados de vários clientes e armazenar em um
	 * ArrayList até que se digite um número de ID negativo. Em seguida exiba os
	 * dados de todos os clientes via SystemOut, formatando cada objeto separado por
	 * linhas.
	 */

	// caracteristicas de um objeto / entidade
	private int id;
	private String nome;
	private int idade;
	private String telefone;

	// Cliente cl1 = new Cliente();
	// Overload
	Cliente() {
	};

	// Cliente cl1 = new Cliente("23", "Daniel", "26", "99482135");
	Cliente(int id, String nome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// comportamento de um objeto / entidade
	// String
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone="
				+ telefone + "]";
	}
}
