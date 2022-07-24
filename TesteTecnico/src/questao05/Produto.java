package questao05;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
 *trabalhar com Collection do tipo ArrayList do Java para manipular os dados desse
 *estoque, o programa deverá atender as seguintes funcionalidades:
 *- Armazenar dados da ArrayList
 *- Remover dados da ArrayList;
 *- Atualizar dados da ArrayList. - Apresentar todos os dados da ArrayList.
 */

public class Produto {

	private String nomeProduto;
	private int quantidadeEstoque;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	Produto() {

	};

	Produto(String produto, int estoque) {
		this.nomeProduto = produto;
		this.quantidadeEstoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [Nome: " + nomeProduto + ", Em estoque: " + quantidadeEstoque + "]";
	}
}