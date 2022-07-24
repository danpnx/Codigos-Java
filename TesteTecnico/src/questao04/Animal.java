package questao04;

public abstract class Animal {

	private String nomeAnimal;
	private int idadeAnimal;

	abstract void emitirSom();

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
}
