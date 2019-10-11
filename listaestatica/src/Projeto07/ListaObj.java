package Projeto07;

public class ListaObj<T> {

	private T[] vetor;
	private int nroElementos;
	private int tamanho;
	
	public ListaObj(int tamanho) {
		nroElementos = 0;
		this.tamanho = tamanho;
		vetor = (T[]) new Object[tamanho];
	}
	
	public boolean adiciona(T elemento) {
		if( nroElementos == vetor.length)
			return false;
		
		vetor[nroElementos++] = elemento;
		return true;
	}
	
	public void exibe() {
		if(nroElementos == 0) {
			System.out.println("Lista vazia");
		}
		else {
			System.out.println("Lista: ");
			for(int i = 0 ; i < nroElementos ; i ++)
				System.out.print(vetor[i].toString() + "\t");
			
			System.out.println();
		}
		
	}
	public int busca(T valor) {
		for(int i = 0 ; i < nroElementos ; i++)
		{
			if(vetor[i].equals(valor)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean removePeloIndice(int indice) {
		if(indice < 0 || indice >= nroElementos)
			return false;
		
		else {
			for(int i = 0 ; i < nroElementos - 1 ; i++) {
				vetor[i] = vetor[i+1];
			}
			nroElementos --;
			
			return true;
		}
	}
	
	public int getTamanho() {
		return nroElementos;
	}
	
	public boolean removeElemento(T elem) {
		return removePeloIndice(busca(elem));
	}
	
	public T getElemento(int indice) {
		if(vetor[indice] != null)
			return vetor[indice];
		
		return null;
		
	}
	
	
	public void limpa() {
		nroElementos = 0;
		vetor = (T[]) new Object[tamanho];
	}

}
