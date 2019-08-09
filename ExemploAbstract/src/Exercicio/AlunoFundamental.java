package Exercicio;

//continuada * 0.4 + semestral * 0.6
public class AlunoFundamental extends Aluno{

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public AlunoFundamental(String nome, int idade, double nota1, double nota2, double nota3, double nota4) {
		super(nome, idade);
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		
	}

	@Override
	public double calculaMedia() {
		// TODO Auto-generated method stub
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}

	@Override
	public String toString() {
		return "AlunoFundamental [aluno: "+super.toString()+" ,nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ ", Valor da Média" + calculaMedia() + "]";
	}
	
	
	
}
