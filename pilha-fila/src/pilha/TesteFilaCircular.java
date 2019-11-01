package pilha;

public class TesteFilaCircular {
	public static void main(String[] args) {
		FilaCircular f = new FilaCircular(5);
		
		f.insert(4);
		
		f.insert(5);
		
		f.insert(6);
		
		f.insert(7);
		
		f.insert(8);
		
		f.insert(9);
		
		System.out.println(f.peek());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
		
		System.out.println(f.pool());
	}
}
