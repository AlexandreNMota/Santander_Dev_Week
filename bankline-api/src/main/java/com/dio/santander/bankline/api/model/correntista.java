package com.dio.santander.bankline.api.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="tab_correntista")
public class correntista {
	
	// Class Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(length=20)	
	private String cpf;
	
	@Column(length=20)	
	private String nome;
	
	@Embedded
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
