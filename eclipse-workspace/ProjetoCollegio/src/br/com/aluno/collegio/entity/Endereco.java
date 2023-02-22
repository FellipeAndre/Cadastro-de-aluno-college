package br.com.aluno.collegio.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Endereco {
	
	
	private Integer id;
	private String cep;
	private String rua;
	private String complemeto;
	private String cidade;
	private String estado;
	private String municipio;
	
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemeto() {
		return complemeto;
	}
	public void setComplemeto(String complemeto) {
		this.complemeto = complemeto;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", complemeto=" + complemeto + ", cidade=" + cidade
				+ ", estado=" + estado + ", municipio=" + municipio + "]";
	}

}
