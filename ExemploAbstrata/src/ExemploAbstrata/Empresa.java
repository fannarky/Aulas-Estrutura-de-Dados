package ExemploAbstrata;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Funcionario> f;
	
	public Empresa() {
		f = new ArrayList<Funcionario>();
	}
	
	public void adicionaFuncionario(Funcionario f) {
		this.f.add(f);
	}
	
	public void exibeFuncionario() {
		System.out.println("Lista de Funcionarios: ");
		for(Funcionario f : this.f) {
			System.out.println(f);
		}
		System.out.println();
	}
	
	public void exibeTotalSalario() {
		double salario = 0;
		for(Funcionario f : this.f) {
			salario += f.calcSalario();
		}
		System.out.println("Salario total: "+ salario);
	}
	
	public void exibeVendedor() {
		for(Funcionario f : this.f) {
			if(f instanceof Vendedor) {
				System.out.println(f);
			}
		}
	}
	
	public Funcionario buscaFunc(int id) {
		for (Funcionario f : this.f) {
			if(f.getCodigo() == id) {
				return f;
			}
		}
		return null;
	}
}
