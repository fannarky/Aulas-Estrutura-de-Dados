package listaestatica;

public class ListaEstatica {

	protected int[] vetor;
	protected int nroElementos;
	
	public ListaEstatica(int tamanho) {
		nroElementos = 0;
		vetor = new int[tamanho];
	}
	
	public boolean adiciona(int elemento) {
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
				System.out.print(vetor[i] + "\t");
			System.out.println();
		}
		
	}
	
	public int busca(int valor) {
		for(int i = 0 ; i < nroElementos ; i++)
		{
			if(vetor[i] == valor) {
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
	
	public boolean removeElemento(int elem) {
		return removePeloIndice(busca(elem));
	}
	
	
	
	
	
	
}
