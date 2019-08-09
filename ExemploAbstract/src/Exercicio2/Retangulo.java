package Exercicio2;

public class Retangulo extends Figura {

	
	private double largura;
	
	private double altura;
	

	public Retangulo(String cor, double espessura, double largura, double altura) {
		super(cor, espessura);
		
		this.largura = largura;
		this.altura = altura;
		
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return largura * altura;
	}


	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + ", Area: " + calcularArea() + "]";
	}
	
	

}
