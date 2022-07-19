package br.com.empiricus.pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		Efetivo funcEfetivo01 = new Efetivo("Hugo", 29, "Rua 1, Numero 1", 
				3000.00, "Tecnologia", "Desenvolvedor Mobile", 15);
		funcEfetivo01.mostrarFuncionarioEfetivo();
		
		System.out.println("----------------");
		
		Estagiario funcEstagiario01 = new Estagiario("Juan", 20, "Rua 2, Numero 2", 1212.00, "Financeiro", "Estágio", 12);
		funcEstagiario01.mostrarFuncionarioEstagiario();
		
		System.out.println("----------------");
		
		Cliente cliente01 = new Cliente("William", 35, "Rua 3, Numero 3", true, args);
		cliente01.inativarCliente(6);
		String[] produtosTeste = {"Bota", "Console", "Camiseta"};
		cliente01.atualizarProdutosAdquiridos(produtosTeste);
		String[] produtosTeste2 = {"Guitarra", "Smartphone"};
		cliente01.atualizarProdutosAdquiridos(produtosTeste2);
		cliente01.mostrarCliente();
	}
}