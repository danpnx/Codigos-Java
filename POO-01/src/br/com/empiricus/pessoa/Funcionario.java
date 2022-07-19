package br.com.empiricus.pessoa;

public class Funcionario extends Pessoa{

	private double salarioFuncionario;
	private String setorTrabalho;
	private String funcaoTrabalho;
	
	public void setSalarioFuncionario(double salario) {
		this.salarioFuncionario = salario;
	}
	public double getSalarioFuncionario() {
		return this.salarioFuncionario;
	}
	
	public void setSetorTrabalho(String setor) {
		this.setorTrabalho = setor;
	}
	public String getSetorTrabalho() {
		return this.setorTrabalho;
	}
	
	public void setFuncaoTrabalho(String funcao) {
		this.funcaoTrabalho = funcao;
	}
	public String getFuncaoTrabalho() {
		return this.funcaoTrabalho;
	}
	
	public void mostrarSalario() {
		System.out.println("Salário: " + this.salarioFuncionario);
	}
	
	public double saldoSalario(int diasTrabalhados) {
		return (this.salarioFuncionario/30) * diasTrabalhados;
	}
	
	public double feriasTrabalhistas() {
		return (this.salarioFuncionario/3) + this.salarioFuncionario;
	}
	
	public double feriasProporcionais(int numeroMesesTrabalhados) {
		double valorFeriasProporcionais = (this.salarioFuncionario/12) * numeroMesesTrabalhados;
		return valorFeriasProporcionais + (this.salarioFuncionario/3);
	}
}
