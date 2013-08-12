package br.com.revti.lombokTest.model;

import lombok.Data;

@Data
public class Usuario extends Pessoa {
	private String usuario;
	private String senha;
}
