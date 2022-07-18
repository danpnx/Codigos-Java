package br.com.empiricus.atividade06;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta01 = new ContaBancaria();
		conta01.setAgencia("0123");
		conta01.setConta("00112233-4");
		conta01.setSaldo(1500.00);
		conta01.setLimite(700);
		conta01.setFatura(485);
		
		conta01.mostrarConta();
		
		conta01.pagar(conta01.getFatura(), "Fatura");
		System.out.println("--------------------------");
		conta01.mostrarConta();
	}

}
