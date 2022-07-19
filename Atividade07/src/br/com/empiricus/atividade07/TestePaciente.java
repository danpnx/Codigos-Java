package br.com.empiricus.atividade07;

public class TestePaciente {

	public static void main(String[] args) {
		Paciente paciente01 = new Paciente();
		paciente01.setNomePaciente("Daniel Nunes");
		paciente01.setSexoPaciente('M');
		paciente01.setDiagnosticoPaciente("O paciente apresenta falta de ar constante, além de dores de cabeça.");
		paciente01.setPacienteAlergico(true);
		
		paciente01.mostrarPaciente();
		paciente01.mudarMedicacao("Polaramine");
	}

}
