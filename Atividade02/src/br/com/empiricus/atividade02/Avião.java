package br.com.empiricus.atividade02;

public class Avião {

	/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto avião, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 */
	
	private String marca;
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	private String modelo;
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	private String motor;
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getMotor() {
		return motor;
	}
	
	private int alcance;
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	public int getAlcance() {
		return alcance;
	}
	
	private int velocidadeMaximaCruzeiroKMpH;
	public void setVelocidadeMaximaCruzeiroKMpH(int velocidadeMaxima) {
		this.velocidadeMaximaCruzeiroKMpH = velocidadeMaxima;
	}
	public int getVelocidadeMaximaCruzeiroKMpH() {
		return velocidadeMaximaCruzeiroKMpH;
	}
	
	private int altitudeMaximaFt;
	public void setAltitudeMaximaFt(int altitudeMaxima) {
		this.altitudeMaximaFt = altitudeMaxima;
	}
	public int getAltitudeMaximaFt() {
		return altitudeMaximaFt;
	}
	
	public void mostrarAviao() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Motor: " + motor);
		System.out.println("Alcance: " + alcance + " km");
		System.out.println("Velocidade Máxima de Cruzeiro: " + velocidadeMaximaCruzeiroKMpH + " km/h");
		System.out.println("Altitude Máxima de Operação: " + altitudeMaximaFt + " ft");
	}
	
}
