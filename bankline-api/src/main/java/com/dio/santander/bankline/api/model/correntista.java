package com.dio.santander.bankline.api.model;

public class correntista {
	
	// Class Attributes
	private Integer id;
	private String cpf;
	private String nome;
	
	private conta conta; // atributo conta do tipo Conta [classe criada]
	
	// conta setter and getter
	public conta getConta() {
		return conta;
	}
	public void setConta(conta  conta) {
		this.conta = conta;
	}
	
	// id setter and getter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	// cpf setter and getter
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// nome setter and getter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
