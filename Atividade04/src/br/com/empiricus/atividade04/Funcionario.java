package br.com.empiricus.atividade04;

public class Funcionario {

	/*
	 * Crie uma classe funcionário e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto funcionário, defina as
	 * instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 * */
	
	private String nomeFuncionario;
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	private int idadeFuncionario;
	public int getIdadeFuncionario() {
		return idadeFuncionario;
	}

	public void setIdadeFuncionario(int idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}
	
	private String departamento;
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	private double salario;
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void mostrarFuncionario() {
		
		System.out.println("-- Dados do funcionario --");
		System.out.println("Nome: " + nomeFuncionario);
		System.out.println("Idade: " + idadeFuncionario);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario: R$ " + salario);
	}
	
	public double calcularCustoFuncionario() {
		
		return salario * (1 + (68.2/100));
	}
}