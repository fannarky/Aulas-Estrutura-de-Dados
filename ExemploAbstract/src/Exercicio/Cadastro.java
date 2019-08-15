package Exercicio;
//pi*raio²
import java.util.ArrayList;

public class Cadastro {
	private ArrayList<Aluno> a;
	
	public Cadastro() {
		a = new ArrayList<Aluno>();
	}
	
	public void adicionaAluno(Aluno a) {
		this.a.add(a);
	}
	
	public void exibeTodos() {
		System.out.println("Lista de Alunos: ");
		for(Aluno a : this.a) {
			System.out.println(a);
		}
		System.out.println();
	}
	
	public void exibeAlunoGraduacao() {
		for(Aluno a : this.a) {
			if( a instanceof AlunoGraduacao ) {
				System.out.println(a);
			}
		}
	}
	
	public void exibeAprovados() {
		for(Aluno a : this.a) {
			if(a.calculaMedia() >= 5) {
				System.out.println(a);
			}
		}
	}
	
	public Aluno buscaAluno(int id) {
		for(Aluno a : this.a) {
			if(a.ra == id) {
				return a;
			}
		}
		return null;
	}
	
	
}
