package collections;

public abstract class Pessoa {

	private String nomePessoa;
	private int idadePessoa;
	private String email;

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public abstract void enviarEmail(String mensagem);

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", idadePessoa=" + idadePessoa + ", email="
				+ email + "]";
	}
}
