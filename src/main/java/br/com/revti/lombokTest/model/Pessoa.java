package br.com.revti.lombokTest.model;

import lombok.Data;

@Data
public abstract class Pessoa extends ModelClass {
	private String nome;
	private String cpf;
	private String rg;
	private String email;
}
