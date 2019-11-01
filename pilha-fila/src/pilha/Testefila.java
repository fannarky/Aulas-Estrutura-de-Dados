package pilha;

public class Testefila {

	public static void main(String[] args) {
		
		Fila f = new Fila(5);
		
		f.insert("a");
		f.insert("b");
		f.insert("c");
		f.insert("d");
		f.insert("e");
		f.insert("f");
		
		System.out.println(f.isFull());
		
		f.exibe();
		
		System.out.println(f.pool());
		
		f.exibe();
		
	}
}
