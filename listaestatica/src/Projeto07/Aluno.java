package Projeto07;

public class Aluno {

	private int RA;
	private String nome;
	private double nota;
	public Aluno(int rA, String nome, double nota) {
		super();
		RA = rA;
		this.nome = nome;
		this.nota = nota;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Aluno [RA=" + RA + ", nome=" + nome + ", nota=" + nota + "]";
	}
	
	
}
