package ExemploAbstrata;

public class Horista extends Funcionario {
	
	// Atributos
	private int horas;	        // quantidade de horas trabalhadas no m�s
	private double valorHora;	// valor ganho por hora trabalhada
	
	// Construtor
	
	public Horista(int codigo, String nome, int horas, double valorHora) {
		super(codigo, nome);
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	
	// M�todos
	
	
	@Override
	public double calcSalario() {
		return horas * valorHora;
	}

	
	@Override
	public String toString() {
		return "Horista [" + super.toString() + "\nhoras=" + horas + 
				"\nvalorHora=" + String.format("R$ %.2f",valorHora) ;
				
	}

	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}
