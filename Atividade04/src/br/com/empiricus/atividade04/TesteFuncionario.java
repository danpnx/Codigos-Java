package br.com.empiricus.atividade04;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func01 = new Funcionario();
		
		func01.setNomeFuncionario("Daniel Augusto");
		func01.setIdadeFuncionario(26);
		func01.setDepartamento("Tecnologia");
		func01.setSalario(3000);
		
		func01.mostrarFuncionario();
		System.out.println("Custo do funcionario: " + func01.calcularCustoFuncionario());
	}

}
