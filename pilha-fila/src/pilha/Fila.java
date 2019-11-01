package pilha;

public class Fila {
	
	int tamanho;
	
	String[] fila;
	
	int aux;
	
	public Fila(int tamanho) {
		this.fila = new String[tamanho];
		this.tamanho = 0;
	}
	
	public boolean isEmpty() {
		return this.fila[0].isEmpty() 
				|| this.fila[0] == null;
	}
	
	public boolean isFull() {
		return this.tamanho == this.fila.length;
	}
	
	public void insert(String info) {
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
	
	public String peek() {
		if(this.isEmpty()){
			System.out.println("Fila vazia!");
			return null;
		}
		
		return this.fila[0];
		
	}
	
	public String pool() {
		String aux = this.fila[0];
		for (int i = 0; i < this.tamanho+1; i++) {
			if(i+1 < this.tamanho+1)
				this.fila[i] = this.fila[i+1];
			else
				this.fila[i] = null;
		}
		
		tamanho --;
		
		return aux;
	}
	
	public String confere() {
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
