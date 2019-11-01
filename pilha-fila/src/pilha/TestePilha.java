package pilha;

public class TestePilha {
	
	public static void main(String[] args)
	{
		Pilha p = new Pilha(5);
		
		p.push(1);
		
		p.push(1);
		
		p.push(1);
		
		p.push(1);
		
		p.push(1);
		
		p.push(1);
		
		p.exibe();
		
		System.out.println(p.peek());
	}
	
}
