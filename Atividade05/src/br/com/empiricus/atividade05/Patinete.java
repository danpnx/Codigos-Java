package br.com.empiricus.atividade05;

public class Patinete {
	
	/* 5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto patinete, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 */
	
	private String marcaPatinete;
	public void setMarcaPatinete(String marca) {
		this.marcaPatinete = marca;
	}
	public String getMarcaPatinete() {
		return marcaPatinete;
	}
	
	private String modeloPatinete;
	public void setModeloPatinete(String modelo) {
		this.modeloPatinete = modelo;
	}
	public String getModeloPatinete() {
		return modeloPatinete;
	}
	
	private int quantidadeRodas;
	public void setQuantidadeRodas(int rodas) {
		this.quantidadeRodas = rodas;
	}
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	
	private boolean patineteEletrico;
	public void setPatineteEletrico(boolean eletrico) {
		this.patineteEletrico = eletrico;
	}
	public boolean getPatineteEletrico() {
		return patineteEletrico;
	}
	
	public void mostrarPatinete() {
		System.out.println("Marca: " + marcaPatinete);
		System.out.println("Modelo: " + modeloPatinete);
		System.out.println("Quantidade de rodas: " + quantidadeRodas);
		if(patineteEletrico) {
			System.out.println("Patinete elétrico");
		} else {
			System.out.println("Patinete não-elétrico");
		}
	}
}