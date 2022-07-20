package br.com.empiricus.pessoa;

public class Efetivo extends Funcionario {

	private int tempoDeEmpresaEmMeses;

	public void setTempoDeEmpresaEmMeses(int meses) {
		this.tempoDeEmpresaEmMeses = meses;
	}

	public int getTempoDeEmpresaEmMeses() {
		return this.tempoDeEmpresaEmMeses;
	}

	Efetivo() {
	}

	Efetivo(String nome, int idade, String endereco, double salario,
			String setor, String funcao, int meses) {
		this.setNomePessoa(nome);
		this.setIdadePessoa(idade);
		this.setEnderecoPessoa(endereco);
		this.setSalarioFuncionario(salario);
		this.setSetorTrabalho(setor);
		this.setFuncaoTrabalho(funcao);
		this.setTempoDeEmpresaEmMeses(meses);
	}

	@Override
	public void mostrarPessoa() {
		System.out.println("Nome: " + this.getNomePessoa());
		System.out.println("Idade: " + this.getIdadePessoa());
		System.out.println("Endereço: " + this.getEnderecoPessoa());
		System.out.println("Salário: " + this.getSalarioFuncionario());
		System.out.println("Setor: " + this.getSetorTrabalho());
		System.out.println("Função: " + this.getFuncaoTrabalho());
		int tempoDeEmpresa = 0;
		if (this.tempoDeEmpresaEmMeses / 12 >= 1) {
			tempoDeEmpresa = this.tempoDeEmpresaEmMeses / 12;
			System.out.printf("Tempo de empresa: %d anos e %d meses.%n",
					tempoDeEmpresa, (this.tempoDeEmpresaEmMeses % 12));
		} else {
			System.out.println("Tempo de empresa: " + this.tempoDeEmpresaEmMeses
					+ " meses.");
		}
	}
}
