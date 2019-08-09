package Exercicio;

public class AlunoGraduacao extends Aluno{
	
	private double nota1;
	private double nota2;

	public AlunoGraduacao(String nome, int idade, double nota1, double nota2) {
		super(nome, idade);
		// 
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}

	@Override
	public double calculaMedia() {
		// TODO Auto-generated method stub
		return (this.nota1 * 0.4) + (this.nota2 * 0.6);
	}

	@Override
	public String toString() {
		return "AlunoGraduacao ["+ super.toString() +" ,nota1=" + nota1 + ", nota2=" + nota2 + ", Nota: " + calculaMedia() + "]";
	}
	
	
	
	
}
