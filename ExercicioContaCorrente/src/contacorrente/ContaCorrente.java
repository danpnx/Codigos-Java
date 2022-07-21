package contacorrente;

public class ContaCorrente {

	/*
	 * Cria uma classe para representar uma conta corrente que possui um número,
	 * um saldo, um status que informa se ela é especial ou não, um limite.
	 * Desenvolva métodos para realizar saque (verificando se o cliente pode
	 * realizar saques), depositar dinheiro, consultar saldo e verificar se o
	 * cliente está usando cheque especial ou não. Desenvolva um programa para
	 * testar essa classe.
	 */

	private String numeroContaCorrente;
	private double saldoContaCorrente;
	private boolean statusContaCorrente;
	private double limiteContaCorrente;

	ContaCorrente() {

	};

	ContaCorrente(String numeroConta, double saldoConta, boolean statusConta,
			double limiteConta) {
		this.numeroContaCorrente = numeroConta;
		this.saldoContaCorrente = saldoConta;
		this.statusContaCorrente = statusConta;
		this.limiteContaCorrente = limiteConta;
	};

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}

	// Retorna true ou false, ou seja, se o cliente é especial ou não
	public boolean isStatusContaCorrente() {
		return statusContaCorrente;
	}

	public void setStatusContaCorrente(boolean statusContaCorrente) {
		this.statusContaCorrente = statusContaCorrente;
	}

	public double getLimiteContaCorrente() {
		return limiteContaCorrente;
	}

	public void setLimiteContaCorrente(double limiteContaCorrente) {
		this.limiteContaCorrente = limiteContaCorrente;
	}

	public void realizarSaque(double valorSaque) {
		if (this.getSaldoContaCorrente() >= valorSaque) {
			this.setSaldoContaCorrente(
					this.getSaldoContaCorrente() - valorSaque);
		} else {
			System.out
					.println("Saldo insuficiente para a realização do saque.");
		}
	}

	public void depositarDinheiro(double valorDeposito) {
		this.setSaldoContaCorrente(
				this.getSaldoContaCorrente() + valorDeposito);
	}

	public void consultarSaldo() {
		System.out.println("Saldo: " + this.getSaldoContaCorrente());
	}
}
