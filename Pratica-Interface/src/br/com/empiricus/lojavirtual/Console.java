package br.com.empiricus.lojavirtual;

public class Console extends Produto implements Gaming {

	Console(String produto, String marca, double preco, int estoque) {
		super(produto, marca, preco, estoque);
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Override void mostrarProduto() {
	 * 
	 * 
	 * }
	 */

	public String toString() {
		return this.getNomeProduto() + "\n" + "\tMarca: "
				+ this.getMarcaProduto() + "\n" + "\tPreço: "
				+ this.getPrecoProduto() + "\n" + "\tQuantidade em estoque: "
				+ this.getQtdEstoque() + "\n";
	}

	@Override
	public double aplicarDesconto(int desconto) {
		return this.getPrecoProduto()
				- (this.getPrecoProduto() * desconto / 100);
	}

	@Override
	public double aplicarCashback(double cashback) {
		return this.getPrecoProduto() * cashback / 100;
	}
}
