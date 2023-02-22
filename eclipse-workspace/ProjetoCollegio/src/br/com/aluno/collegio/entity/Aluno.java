package br.com.aluno.collegio.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Aluno extends Pessoa{
	
	private String nome;
	private String rg;
	private Integer idade;
	private Long matricula;
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "Filhos [rg=" + rg + "]";
	}
	
	
	
}
