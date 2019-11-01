package pilha;

public class TesteFilaOBJ {
	public static void main(String[] args) {
		FilaObj<Integer> f = new FilaObj<>(5);
		FilaObj<Integer> g = new FilaObj<>(5);

		int[] v3 = {
			3,
			10,
			-6,
			8,
			22,
			-30
		};
		
		for(int i = 0 ; i < v3.length ; i++) {
			if(v3[i]>0)
				f.insert(v3[i]);
			else
				g.insert(v3[i]);
		}
		
		f.exibe();
		System.out.println();
		g.exibe();
	}
}
