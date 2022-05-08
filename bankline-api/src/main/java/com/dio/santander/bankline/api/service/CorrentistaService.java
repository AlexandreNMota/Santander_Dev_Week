package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.model.conta;

@Service
public class CorrentistaService {
	@Autowired
	private CorrentistaRepository repository;
	public void save(NovoCorrentista novoCorrentista) {
		correntista correntista = new correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome( novoCorrentista.getNome());
		
		conta conta = new conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		correntista.setConta(conta);
		repository.save(correntista);
	}
}
