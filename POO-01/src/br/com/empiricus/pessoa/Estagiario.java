package br.com.empiricus.pessoa;

public class Estagiario extends Funcionario {

	private int tempoContratoEmMeses;

	public void setTempoContratoEmMeses(int contrato) {
		this.tempoContratoEmMeses = contrato;
	}

	public int getTempoContratoEmMeses() {
		return this.tempoContratoEmMeses;
	}

	Estagiario() {
	}

	Estagiario(String nome, int idade, String endereco, double salario,
			String setor, String funcao, int contrato) {
		this.setNomePessoa(nome);
		this.setIdadePessoa(idade);
		this.setEnderecoPessoa(endereco);
		this.setSalarioFuncionario(salario);
		this.setSetorTrabalho(setor);
		this.setFuncaoTrabalho(funcao);
		this.setTempoContratoEmMeses(contrato);
	}

	@Override
	public void mostrarPessoa() {
		System.out.println("Nome: " + this.getNomePessoa());
		System.out.println("Idade: " + this.getIdadePessoa());
		System.out.println("Endereço: " + this.getEnderecoPessoa());
		System.out.println("Salário: " + this.getSalarioFuncionario());
		System.out.println("Setor: " + this.getSetorTrabalho());
		System.out.println("Função: " + this.getFuncaoTrabalho());
		System.out.println("Tempo de contrato: "
				+ this.getTempoContratoEmMeses() + " meses.");
	}
}
