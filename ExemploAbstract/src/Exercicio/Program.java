package Exercicio;

public class Program {

	public static void main(String[] args) {
		Aluno a1 = new AlunoFundamental("Juquinha", 10, 10, 5.5, 3.8, 10);
		Aluno a2 = new AlunoGraduacao("Lilica", 20, 10, 3.1);
		Aluno a3 = new AlunoPos("Cebolita", 30, 8, 7.3, 10);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		
		Cadastro cad = new Cadastro();
		cad.adicionaAluno(a1);
		cad.adicionaAluno(a2);
		cad.adicionaAluno(a3);
		
		cad.exibeTodos();
		cad.exibeAprovados();
		cad.exibeAlunoGraduacao();
		cad.buscaAluno(3);
		
		
	}

}
