package Exercicio3;

import java.util.ArrayList;

public class Tributo {
	private ArrayList<Tributavel> l;

	public Tributo() {
		l = new ArrayList<>();
	}
	
	public void adicionaTributavel(Tributavel t) {
		l.add(t);
	}
	
	public void calculaTotalTributo() {
		double sum = 0;
		for(Tributavel t : l) {
			sum += t.getValorTributo();
		}
		System.out.println("Total dos tributos: " + sum);
	}
	
	
}
