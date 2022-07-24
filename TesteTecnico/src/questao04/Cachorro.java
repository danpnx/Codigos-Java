package questao04;

public class Cachorro extends Animal {

	@Override
	void emitirSom() {
		System.out.println("*sniff* *sniff* au au .. au au");
	}

	public void correr() {
		System.out.println("Cachorro correndo...");
	}
}
