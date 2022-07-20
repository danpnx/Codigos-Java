package br.com.empiricus.pessoa;

public class Cliente extends Pessoa {

	private boolean clienteAtivo;
	private String[] produtosAdquiridos;

	public void setClienteAtivo(boolean ativo) {
		this.clienteAtivo = ativo;
	}

	public boolean getClienteAtivo() {
		return this.clienteAtivo;
	}

	public void setProdutosAdquiridos(String[] produtos) {
		this.produtosAdquiridos = produtos;
	}

	public String[] getProdutosAdquiridos() {
		return this.produtosAdquiridos;
	}

	Cliente() {
	}

	Cliente(String nome, int idade, String endereco, boolean ativo,
			String[] produtos) {
		this.setNomePessoa(nome);
		this.setIdadePessoa(idade);
		this.setEnderecoPessoa(endereco);
		this.setClienteAtivo(ativo);
		this.setProdutosAdquiridos(produtos);
	}

	public void mostrarPessoa() {
		System.out.println("Nome: " + this.getNomePessoa());
		System.out.println("Idade: " + this.getIdadePessoa());
		System.out.println("Endereço: " + this.getEnderecoPessoa());
		if (this.getClienteAtivo()) {
			System.out.println("Cliente Ativo");
		} else {
			System.out.println("Cliente Inativo");
		}
		listarProdutosAdquiridos();
	}

	public void inativarCliente(int tempoInativoEmMeses) {
		if (tempoInativoEmMeses >= 6) {
			this.setClienteAtivo(false);
		} else {
			this.setClienteAtivo(true);
		}
	}

	public void atualizarProdutosAdquiridos(String[] produtos) {
		int novoTamanhoDeArray = this.getProdutosAdquiridos().length
				+ produtos.length;
		String[] produtosTemporario = new String[novoTamanhoDeArray];
		for (int i = 0; i < this.getProdutosAdquiridos().length; i++) {
			produtosTemporario[i] = this.getProdutosAdquiridos()[i];
		}
		for (int i = this.getProdutosAdquiridos().length,
				j = 0; i < produtosTemporario.length; i++, j++) {
			produtosTemporario[i] = produtos[j];
		}

		this.setProdutosAdquiridos(produtosTemporario);
	}

	public void listarProdutosAdquiridos() {
		for (String produto : this.getProdutosAdquiridos()) {
			System.out.println("Produto adquirido: " + produto);
		}
	}
}
