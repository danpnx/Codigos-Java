package br.com.empiricus.atividade01;

public class Cliente {
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto cliente, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 */
	
	private String nomeCliente;
	public void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	private String cpfCliente;
	public void setCPFCliente(String cpf) {
		this.cpfCliente = cpf;
	}
	public String getCPFCliente() {
		return cpfCliente;
	}
	
	private float saldoCliente;
	public void setSaldoCliente(float saldo) {
		this.saldoCliente = saldo;
	}
	public float getSaldoCliente() {
		return saldoCliente;
	}
	
	public void mostrarCliente() {
		System.out.println("-- PERFIL --");
		System.out.println("Nome: " + nomeCliente);
		System.out.println("CPF: " + cpfCliente);
		System.out.println("Saldo: " + saldoCliente);
	}
	
	public void comprar(String item, float preco, String formaPagamento) {
		System.out.println("Item: " + item);
		System.out.println("Preço: " + preco);
		System.out.println("Forma de pagamento: " + formaPagamento);
		switch(formaPagamento) {
		case "Saldo": {
				if(preco > saldoCliente) {
					System.out.println("Transação inválida. Saldo insuficiente");
				} else {
					saldoCliente -= preco;
					System.out.println("Compra realizada com sucesso!");
				}
				break;
			}
		case "Cartão": {
				System.out.println("Realizando operação...");
				System.out.println("Compra realizada com sucesso!");
			}
		}
	}
}
