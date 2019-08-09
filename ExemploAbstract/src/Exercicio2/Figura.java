package Exercicio2;

public abstract class Figura {

	private String cor;
	
	private double espessura;
	
	
	
	public Figura(String cor, double espessura) {
		
		this.cor = cor;
		this.espessura = espessura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getEspessura() {
		return espessura;
	}

	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}

	public abstract double calcularArea();

	@Override
	public String toString() {
		return "Figura [cor=" + cor + ", espessura=" + espessura + "]";
	}
	
	
	
	
}
