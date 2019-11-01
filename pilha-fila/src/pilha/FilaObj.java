package pilha;

public class FilaObj<T> {
	
	int tamanho;
	
	T[] fila;
	
	int aux;
	
	public FilaObj(int tamanho) {
		this.fila = (T[]) new Object[tamanho];
		this.tamanho = 0;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public boolean isFull() {
		return this.tamanho == this.fila.length;
	}
	
	public void insert(T info) {
		if(this.isFull()) {
			this.tamanho --;
			System.out.println("Fila completa !");			
		}
		else {
			this.fila[tamanho] = info;
			tamanho++;
			this.aux++;
		}
	}
	
	public T peek() {
		if(this.isEmpty()){
			System.out.println("Fila vazia!");
			return null;
		}
		
		return this.fila[0];
		
	}
	
	public T pool() {
		T aux = this.fila[0];
		for (int i = 0; i < this.tamanho+1; i++) {
			if(i+1 < this.tamanho+1)
				this.fila[i] = this.fila[i+1];
			else
				this.fila[i] = null;
		}
		
		tamanho --;
		
		return aux;
	}
	
	public T confere() {
		return this.fila[0];
	}
	
	public void exibe() {
		System.out.println("mostrando a lista");
		for (int i = 0; i < this.fila.length; i++) {
			if(this.fila[i] == null)
				return;
			System.out.println(this.fila[i]);
		}
	}

}
