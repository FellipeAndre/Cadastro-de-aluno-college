package br.com.alunocadastrados.collegio;

public abstract class  Pessoa {


	private String nome;
	private String raca;
	private String nacionalidade;
	private String dataNasc;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", raca=" + raca + ", nacionalidade=" + nacionalidade + ", dataNasc=" + dataNasc
				+ "]";
	}
	
}
