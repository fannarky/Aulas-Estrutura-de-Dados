package ExemploAbstract;

public class Horista extends Funcionario {

	private int horas;
	
	private double valorHora;
	
	public Horista(int hora, double valorHora, int codigo, String nome) {
		super(codigo, nome);
		
		this.horas = hora;
		
		this.valorHora = valorHora;
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

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return this.horas * this.valorHora;
	}

	@Override
	public String toString() {
		return "Horista ["+ super.toString() +" ,horas=" + this.horas + ", valorHora=" + this.valorHora + ", salario: "+ String.format("R$ %.2f", calculaSalario()) +"]";
	}

	
}
