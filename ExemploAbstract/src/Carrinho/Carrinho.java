package Carrinho;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Vendavel> cart;

	public Carrinho() {
		this.cart = new ArrayList<Vendavel>();
	}
	
	public void adicionarVendavel(Vendavel v) {
		cart.add(v);
	}
	
	public double calculaTotalVenda() {
		double total = 0;
		for(Vendavel p : cart) {
			total += p.getValorVenda();
		}
		return total;
	}
	
	public void exibeItensCarrinho() {
		for(Vendavel p : cart) {
			System.out.println(p.toString());
		}
	}
	
	
}
