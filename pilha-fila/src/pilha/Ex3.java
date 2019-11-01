package pilha;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		PilhaObj<Operacao> d = new PilhaObj<>(3);
		Scanner sc = new Scanner(System.in);
		int countOperacoes = 0;
		
		ContaBancaria c1 = new ContaBancaria(12311, 500);
		
		ContaBancaria c2 = new ContaBancaria(33122, 400);
		int op = 0;
		do {
			System.out.println("Digite a opera��o: "
					+ "\n1- debitar valor"
					+ "\n2- depositar valor"
					+ "\n3- Desfazer opera��o"
					+ "\n4- Sair");
			
			op = sc.nextInt();
			
			
			switch(op) {
			case 1:
				System.out.println("Digite o valor do d�bito: ");
				double valor = sc.nextDouble();
				
				c1.debitar(valor);
				
				Operacao op2 = new Operacao(c1, "d�bito", valor);
				
				d.push(op2);
			break;
			case 2:
				System.out.println("Digite o valor do dep�sito: ");
				double deposito = sc.nextDouble();
				
				c1.debitar(deposito);
				
				Operacao op3 = new Operacao(c1, "d�bito", deposito);
				
				d.push(op3);
				break;
			case 3:
				System.out.println("Digite a qtde de opera��es que ser�o desfeitas:");
				int qtdeOps = sc.nextInt();
			break;
			case 4:
				System.out.println("FIM!");
			break;
			default: 
			
			break;
			}
		}while(op == 4);
		
	}
}
