package br.com.empiricus.atividade06;

public class ContaBancaria {

	/* 6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 * */
	
	private String agencia;
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getAgencia() {
		return agencia;
	}
	
	private String conta;
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getConta() {
		return conta;
	}
	
	private double saldo;
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	private double limite;
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}
	
	private double fatura;
	public void setFatura(double fatura) {
		this.fatura = fatura;
	}
	public double getFatura() {
		return fatura;
	}
	
	public void pagar(double valor, String metodo) {
		switch(metodo) {
		case "Pix": {
				if(saldo >= valor) {
					saldo -= valor;
					System.out.println("Pix realizado com sucesso!");
				} else {
					System.out.println("Saldo insuficiente para realizar o pagamento com Pix");
				}
				break;
			}
		case "Fatura": {
				if(saldo >= valor) {
					saldo -= valor;
					fatura = 0;
					System.out.println("Fatura paga com sucesso!");
				} else {
					System.out.println("Saldo insuficiente para realizar o pagamento da fatura");
				}
				break;
			}
		}
	}
	public void mostrarConta() {
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("Fatura: " + fatura);
	}
}
