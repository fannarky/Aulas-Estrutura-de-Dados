package Exercicio;

public class AlunoPos extends Aluno{

	private double nota1;
	private double nota2;
	private double notaMonografia;
	
	public AlunoPos(String nome, int idade, double nota1, double nota2, double notaMonografia) {
		super(nome, idade);
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaMonografia = notaMonografia;
	}

	@Override
	public double calculaMedia() {
		// TODO Auto-generated method stub
		return (nota1 + nota2 + notaMonografia)/3;
	}

	@Override
	public String toString() {
		return "AlunoPos ["+super.toString()+" ,nota1=" + nota1 + ", nota2=" + nota2 + ", notaMonografia=" + notaMonografia
				+ ", calculaMedia()=" + calculaMedia() + "]";
	}
	
	

}
