package Exercicio2;

import java.util.ArrayList;

public class Imagem {
	private ArrayList<Figura> f;
	
	public Imagem() {
		f = new ArrayList<>();
	}
	
	public void adicionaFigura(Figura f) {
		this.f.add(f);
	}
	
	public void exibeFiguras() {
		for(Figura f : this.f) {
			System.out.println(f);
		}
	}
	
	public void exibeSomaAreas() {
		double soma = 0;
		for(Figura f : this.f) {
			soma += f.calcularArea();
		}
		System.out.println(soma);
	}
	
	public void exibeFiguraAreaMaior20() {
		for(Figura f : this.f) {
			if(f.calcularArea() > 20) {
				System.out.println(f);
			}
		}
	}
	
	public void exibeQuadrado() {
		for(Figura f : this.f) {
			if ( f instanceof Quadrado) {
				System.out.println(f);
			}
		}
	}
	
	
}
