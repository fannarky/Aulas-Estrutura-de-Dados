package pilha;

import java.net.SocketTimeoutException;

public class FilaCircular {

	int inicio;
	
	int fim;
	
	int tamanho;
	
	int[] fila;
	
	public FilaCircular(int tamVetor) {
		this.fila = new int[tamVetor];
		
		this.tamanho = 0;
		
		this.inicio = 0;
		
		this.fim = 0;
		
	}
	
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	public boolean isFull() {
		return this.tamanho == this.fila.length;
	}
	
	public void insert(int elem) {
		if(isFull()) {
			System.out.println("Fila cheia");
			return;
		}
		
		this.fila[fim] = elem;
		fim = (fim + 1) % fila.length;
		tamanho ++;
	}
	
	public int peek() {
		return this.fila[inicio];
	}
	
	public int pool() {
		if(this.isEmpty())
			return -1;
		
		int aux = fila[inicio];
		inicio = (inicio +1) % fila.length;
		tamanho --;
		
		return aux;
	}
	
	public void exibe() {
		if(this.isEmpty()) {
			System.out.println("não tem nada");
		}else {
			int aux = inicio;
			for (int i = 0; i < tamanho; i++) {
				System.out.println(this.fila[aux]);
				++aux = aux % fila.length;
			}
		}
	}
	
}
