package br.com.loja.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Estado {
	@Column(length=50, nullable= false)
	private String nome;
	@Column(length=2, nullable= false)
	private String sigla;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
