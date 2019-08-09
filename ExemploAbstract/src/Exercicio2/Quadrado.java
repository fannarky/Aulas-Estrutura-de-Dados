package Exercicio2;

public class Quadrado extends Figura{

	
	private double largura;
	
	public Quadrado(String cor, double espessura, double largura, double altura) {
		super(cor, espessura);
		// TODO Auto-generated constructor stub
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return largura * largura;
	}

	@Override
	public String toString() {
		return "Quadrado [largura=" + largura + ", altura=" + altura + ", Área: " + calcularArea() + "]";
	}
	
	
	
	
}
