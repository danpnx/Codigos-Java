package questao04;

public class Cavalo extends Animal {

	@Override
	void emitirSom() {
		System.out.println("*Cavalo relinchando*...");
	}

	public void correr() {
		System.out.println("Cavalo correndo...");
	}
}
