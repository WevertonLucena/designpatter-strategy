package br.com.lucenasistemas.strategy.services;

import br.com.lucenasistemas.strategy.interfaces.FormaPagamento;

public class Boleto implements FormaPagamento {

	@Override
	public void efetuarPagamento() {
	
		System.out.println("Pagou com boleto.");
		
	}

}
