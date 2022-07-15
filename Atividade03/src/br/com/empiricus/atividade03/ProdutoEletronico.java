package br.com.empiricus.atividade03;

public class ProdutoEletronico {
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto produto eletrônico, 
	 * defina as instancias deste objeto e apresente as informações deste objeto no console.
	 */
	
	private String marcaProduto;
	public void setMarcaProduto(String marca) {
		this.marcaProduto = marca;
	}
	public String getMarcaProduto() {
		return marcaProduto;
	}
	
	private String modeloProduto;
	public void setModeloProduto(String modelo) {
		this.modeloProduto = modelo;
	}
	public String getModeloProduto() {
		return modeloProduto;
	}
	
	private double precoProduto;
	public void setPrecoProduto(double preco) {
		this.precoProduto = preco;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	
	private int estoqueProduto;
	public void setEstoqueProduto(int estoque) {
		this.estoqueProduto = estoque;
	}
	public int getEstoqueProduto() {
		return estoqueProduto;
	}
	
	private int garantiaProdutoEmMeses;
	public void setGarantiaProduto(int garantia) {
		this.garantiaProdutoEmMeses = garantia;
	}
	public int getGarantiaProduto() {
		return garantiaProdutoEmMeses;
	}
	
	public void mostrarProduto() {
		System.out.println("-----------------------------");
		System.out.println("Marca: " + marcaProduto);
		System.out.println("Modelo: " + modeloProduto);
		System.out.println("Preço: " + precoProduto);
		System.out.println("Em estoque: " + estoqueProduto);
		System.out.println("Garantia: " + garantiaProdutoEmMeses + " meses");
		System.out.println("-----------------------------");
	}
	
	public void atualizarEstoque(int quantidadeVendidos) {
		estoqueProduto -= quantidadeVendidos;
	}
	
	public double calcularDesconto(int desconto) {
		return precoProduto * (desconto/100.0); 
	}
}
