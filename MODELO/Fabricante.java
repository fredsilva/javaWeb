package br.com.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Fabricante {
	
	private String Descricao;

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	

}
