package br.com.alunocadastrados.collegio;

public class Pais extends Pessoa {

	private String cpf;
	private Integer idade;
	private String Profissao;
	private String estadoCivil;
	private Filhos dadosDoAluno = new Filhos();
	private Endereco endereco = new Endereco();
	
	public Filhos getDadosDoAluno() {
		return dadosDoAluno;
	}
	public void setDadosDoAluno(Filhos dadosDoAluno) {
		this.dadosDoAluno = dadosDoAluno;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		return "Pais [ cpf=" + cpf + ", idade=" + idade + ", Profissao=" + Profissao
				+ ", estadoCivil=" + estadoCivil + ", dadosDoAluno=" + dadosDoAluno + ", endereco=" + endereco + "]";
	}
	
	
}
