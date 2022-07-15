package br.com.empiricus.atividade03;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico processador = new ProdutoEletronico();
		
		processador.setMarcaProduto("AMD");
		processador.setModeloProduto("100-100000065BOX");
		processador.setPrecoProduto(2700.50);
		processador.setEstoqueProduto(42);
		processador.setGarantiaProduto(6);
		
		processador.mostrarProduto();
		
		processador.atualizarEstoque(12);
		System.out.println("Estoque atualizado: " + processador.getEstoqueProduto());
		
		System.out.println("Valor do desconto: " + processador.calcularDesconto(41));
	}

}
