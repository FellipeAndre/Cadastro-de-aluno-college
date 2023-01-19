package br.com.alunocadastrados.collegio;

public class Filhos extends Pessoa{
	
	private String rg;
	
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
