package br.com.empiricus.atividade01;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setNomeCliente("Daniel");
		cliente1.setCPFCliente("111.111.111-11");
		cliente1.setSaldoCliente((float) 2999.9);
		
		cliente1.mostrarCliente();
		cliente1.comprar("TV", 2300, "Saldo");
	}

}
