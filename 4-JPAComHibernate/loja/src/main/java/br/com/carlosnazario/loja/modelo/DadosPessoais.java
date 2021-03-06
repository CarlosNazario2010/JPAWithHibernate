package br.com.carlosnazario.loja.modelo;

import javax.persistence.Embeddable;

/*
 * Embeddable (embutivel) significa que esta classe pode ser embutida em 
 * uma Entidade
 */

@Embeddable
public class DadosPessoais {

	private String nome;
	private String cpf;
	
	public DadosPessoais() {}
	
	public DadosPessoais(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
}
