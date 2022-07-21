package br.com.empiricus.lojavirtual;

public class Notebook extends Produto {

	String tamanhoTela;
	String CPU;
	String RAM;

	Notebook(String produto, String marca, double preco, int estoque,
			String tela, String cpu, String ram) {
		super(produto, marca, preco, estoque);
		this.tamanhoTela = tela;
		this.CPU = cpu;
		this.RAM = ram;
	}

	public String getTamanhoTela() {
		return this.tamanhoTela;
	}

	public String getCPU() {
		return this.CPU;
	}

	public String getRAM() {
		return this.RAM;
	}

	@Override
	/*
	 * void mostrarProduto() { System.out.printf("%s%n" + "%tMarca: %s%n" +
	 * "%tPreço: %d%n" + "%tQuantidade em estoque: %d%n" +
	 * "%tTamanho de tela: %s%n" + "%tCPU: %s%n" + "%tRAM: %s%n",
	 * this.getNomeProduto(), this.getMarcaProduto(), this.getPrecoProduto(),
	 * this.getQtdEstoque(), this.tamanhoTela, this.CPU, this.RAM); }
	 */

	public String toString() {
		return this.getNomeProduto() + "\n" + "\tMarca: "
				+ this.getMarcaProduto() + "\n" + "\tPreço: "
				+ this.getPrecoProduto() + "\n" + "\tQuantidade em estoque: "
				+ this.getQtdEstoque() + "\n" + "\tTamanho de tela: "
				+ this.tamanhoTela + "\n" + "\tCPU: " + this.CPU + "\n"
				+ "\tRAM: " + this.RAM + "\n";

	}
}