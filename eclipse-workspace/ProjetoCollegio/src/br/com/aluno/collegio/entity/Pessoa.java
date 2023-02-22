package br.com.aluno.collegio.entity;

import java.time.LocalDate;

public abstract class Pessoa {


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
	
	@Override
	public String toString() {
		return "Pessoa [ raca=" + raca + ", nacionalidade=" + nacionalidade + ", dataNasc=" + dataNasc
				+ "]";
	}
	
}
