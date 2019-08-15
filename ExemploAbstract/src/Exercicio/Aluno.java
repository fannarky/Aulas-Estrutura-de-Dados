package Exercicio;

public abstract class Aluno {

	private String nome;
	public int ra;
	private int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract double calculaMedia();

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
