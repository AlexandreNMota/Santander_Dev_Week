package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.correntista;
import com.dio.santander.bankline.api.model.movimentacao;
import com.dio.santander.bankline.api.model.movimentacao_tipo;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	public void save(NovaMovimentacao novaMovimentacao) {
		
		Double valor = novaMovimentacao.getTipo()==movimentacao_tipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		movimentacao movimentacao = new movimentacao();
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setValor(valor);
		movimentacao.setTipo(novaMovimentacao.getTipo());
		
		correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		repository.save(movimentacao);
	}

}
