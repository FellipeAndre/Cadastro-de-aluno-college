package br.com.aluno.collegio;

public class Aluno extends Pessoa{
	
	private String nome;
	private String rg;
	private Integer idade;
	
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
