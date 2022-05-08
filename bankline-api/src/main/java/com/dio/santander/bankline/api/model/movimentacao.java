package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.annotation.*;

@Entity
@Table(name="tab_movimentacao")
public class movimentacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "valor")
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private movimentacao_tipo tipo;
	
	@Column(name="idConta")
	private Integer idConta;
	
	
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	
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

}
