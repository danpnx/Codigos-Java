package contacorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta01 = new ContaCorrente();
		conta01.setNumeroContaCorrente("111");
		conta01.setSaldoContaCorrente(1500);
		conta01.setLimiteContaCorrente(900);
		conta01.setStatusContaCorrente(false);

		System.out.println("Saldo: " + conta01.getSaldoContaCorrente());
		conta01.realizarSaque(300);
		System.out.println(
				"Saldo após o saque: " + conta01.getSaldoContaCorrente());
		conta01.realizarSaque(2000); // impossivel realizar o saque
		conta01.depositarDinheiro(1000);
		System.out.println(
				"Saldo após depósito: " + conta01.getSaldoContaCorrente());
		conta01.consultarSaldo();

	}

}
