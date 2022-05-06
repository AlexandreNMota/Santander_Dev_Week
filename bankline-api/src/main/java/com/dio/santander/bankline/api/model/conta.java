package com.dio.santander.bankline.api.model;

public class conta {
	
	private Long numero;
	private Double saldo;
	
	// número da conta  setter and getter
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	// saldo setter and getter
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
