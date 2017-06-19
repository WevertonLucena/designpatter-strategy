package br.com.lucenasistemas.strategy.services;

import br.com.lucenasistemas.strategy.interfaces.FormaPagamento;

public class Credito implements FormaPagamento {

	@Override
	public void efetuarPagamento() {
		
		System.out.println("pagou com cartão de crédito.");
		
	}

}
