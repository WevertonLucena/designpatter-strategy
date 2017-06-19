package br.com.lucenasistemas.strategy.model;

import br.com.lucenasistemas.strategy.interfaces.FormaPagamento;

public class Cliente {

	private String nome;
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public void pagar(FormaPagamento formaPagamento){
		
		System.out.println(nome);
		formaPagamento.efetuarPagamento();
	}
}
