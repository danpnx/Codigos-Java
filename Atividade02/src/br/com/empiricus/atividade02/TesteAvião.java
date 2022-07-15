package br.com.empiricus.atividade02;

public class TesteAvião {

	public static void main(String[] args) {
		Avião aviao1 = new Avião();
		
		aviao1.setMarca("Embraer");
		aviao1.setModelo("Preator 600");
		aviao1.setMotor("HTF7500E");
		aviao1.setAlcance(7_441);
		aviao1.setVelocidadeMaximaCruzeiroKMpH(863);
		aviao1.setAltitudeMaximaFt(13_716);
		
		aviao1.mostrarAviao();

	}

}
