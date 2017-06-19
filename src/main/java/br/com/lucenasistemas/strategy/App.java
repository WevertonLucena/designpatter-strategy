package br.com.lucenasistemas.strategy;

import br.com.lucenasistemas.strategy.model.Cliente;
import br.com.lucenasistemas.strategy.services.Boleto;
import br.com.lucenasistemas.strategy.services.Credito;
import br.com.lucenasistemas.strategy.services.Debito;

public class App {
	
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Pedro");
		Cliente cliente2 = new Cliente("João");
		Cliente cliente3 = new Cliente("Maria");
		
		cliente1.pagar(new Credito());
		cliente2.pagar(new Debito());
		cliente3.pagar(new Boleto());
		
		
	}

}
