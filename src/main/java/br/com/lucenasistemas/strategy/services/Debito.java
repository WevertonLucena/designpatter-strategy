package br.com.lucenasistemas.strategy.services;

import br.com.lucenasistemas.strategy.interfaces.FormaPagamento;

public class Debito implements FormaPagamento {

	@Override
	public void efetuarPagamento() {
		
		System.out.println("Pagou com cartão de débito");
		
	}

}
