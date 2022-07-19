package br.com.empiricus.atividade07;

public class Paciente {

	/*
	 * 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto paciente, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 */
	
	private String nomePaciente;
	private char sexoPaciente;
	private String diagnosticoPaciente;
	private boolean pacienteAlergico;
	
	public void setNomePaciente(String nome) {
		this.nomePaciente= nome;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public void setSexoPaciente(char sexo) {
		this.sexoPaciente = sexo;
	}
	public char getSexoPaciente() {
		return sexoPaciente;
	}
	
	public void setDiagnosticoPaciente(String diagnostico) {
		this.diagnosticoPaciente = diagnostico;
	}
	public String getDiagnosticoPaciente() {
		return diagnosticoPaciente;
	}
	
	public void setPacienteAlergico(boolean alergico) {
		this.pacienteAlergico = alergico;
	}
	public boolean getPacienteAlergico() {
		return pacienteAlergico;
	}
	
	public void mostrarPaciente() {
		System.out.println("Nome do paciente: " + nomePaciente);
		if (sexoPaciente == 'M') {
			System.out.println("Sexo: Masculino");
		} else {
			System.out.println("Sexo: Feminino");
		}
		System.out.println("Diagnóstico: " + diagnosticoPaciente);
		if(pacienteAlergico) {
			System.out.println("Paciente alérgico à medicação.");
		} else {
			System.out.println("O paciente não apresentou reações alérgicas ao medicamento.");
		}
	}
	
	public void mudarMedicacao(String medicamento) {
		System.out.println("Paciente alérgico ao medicamento " + medicamento + ".");
		System.out.println("Puxando do banco de dados alternativas de medicamentos e tratamentos para o paciente...");
		System.out.println("Apresentando lista de opções para tratamento");
	}
}
