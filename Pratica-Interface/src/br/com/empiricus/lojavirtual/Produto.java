package br.com.empiricus.lojavirtual;

abstract class Produto {

	private String nomeProduto;
	private String marcaProduto;
	private double precoProduto;
	private int qtdEstoque;

	Produto(String produto, String marca, double preco, int estoque) {
		this.nomeProduto = produto;
		this.marcaProduto = marca;
		this.precoProduto = preco;
		this.qtdEstoque = estoque;
	}

	public String getNomeProduto() {
		return this.nomeProduto;
	}

	public String getMarcaProduto() {
		return this.marcaProduto;
	}

	public double getPrecoProduto() {
		return this.precoProduto;
	}

	public int getQtdEstoque() {
		return this.qtdEstoque;
	}

	// abstract void mostrarProduto();

	public void atualizarEstoque(int qtdVendidos) {
		this.qtdEstoque -= qtdVendidos;
	};
}
