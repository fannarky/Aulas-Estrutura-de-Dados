package Projeto07;

import listaestatica.ListaEstatica;

public class ListaEstaticaOrdenada extends ListaEstatica{
	
	public ListaEstaticaOrdenada(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean adiciona(int elemento) {
		for(int i = 0 ; i < vetor.length ; i ++) {
			int vlrAnterior = vetor[i];
			
			if(vetor[i] >= elemento || vlrAnterior == 0) {
				int valorAntigo;
				valorAntigo = vetor[i];
				vetor[i] = elemento;
				if(valorAntigo > 0)
					adiciona(valorAntigo);
				return true;
			}
			
			
		}
		
		return false;
		
	}
	
	@Override
	public void exibe() {
		System.out.println("Lista: ");
		for(int i = 0 ; i < vetor.length ; i ++)
			System.out.print(vetor[i] + "\t");
		
		System.out.println();
	}

}
