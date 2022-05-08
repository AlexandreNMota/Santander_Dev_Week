package com.dio.santander.bankline.api.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dio.santander.bankline.api.model.movimentacao_tipo;

public class NovaMovimentacao {

	
	private String descricao;
	
	private Double valor;
	
	private movimentacao_tipo tipo;	
	
	private Integer idConta;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public movimentacao_tipo getTipo() {
		return tipo;
	}

	public void setTipo(movimentacao_tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	

}
