package br.com.aluno.collegio.entity;

import java.time.LocalDate;

public class Responsavel {

	private String nome;
	private String cpf;
	private Integer idade;
	private String Profissao;
	private String estadoCivil;
	private String raca;
	private String nacionalidade;
	private LocalDate dataNasc;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	private Aluno dadosDoAluno;

	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno getDadosDoAluno() {
		return dadosDoAluno;
	}

	public void setDadosDoAluno(Aluno dadosDoAluno) {
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
		return "Pais [ cpf=" + cpf + ", idade=" + idade + ", Profissao=" + Profissao + ", estadoCivil=" + estadoCivil
				+ ", dadosDoAluno:[Nome:" + dadosDoAluno.getNome() + "RG: " + dadosDoAluno.getRg() + "Idade: "
				+ dadosDoAluno.getIdade() + ", endereco=" + endereco + "]";
	}

}
