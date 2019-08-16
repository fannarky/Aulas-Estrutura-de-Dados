package Exercicio3;

import Exercicio.Aluno;
import Exercicio.AlunoFundamental;
import Exercicio.AlunoGraduacao;
import Exercicio.AlunoPos;
import Exercicio.Cadastro;

public class ExemploInterface {
	public static void main(String[] args) {
		Alimento a1 = new Alimento(1, "maçã", 3.5, 70);
		Perfume p1 = new Perfume(1, "pErFuMÊ", 70, "Água do mar");
		Servico s1 = new Servico("limpar casa", 150);
		Tributo t1 = new Tributo();
		
		t1.adicionaTributavel(a1);
		t1.adicionaTributavel(p1);
		t1.adicionaTributavel(s1);
		
		t1.calculaTotalTributo();
	}

}
