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
			System.out.println("Digite a operação: "
					+ "\n1- debitar valor"
					+ "\n2- depositar valor"
					+ "\n3- Desfazer operação"
					+ "\n4- Sair");
			
			op = sc.nextInt();
			
			
			switch(op) {
			case 1:
				System.out.println("Digite o valor do débito: ");
				double valor = sc.nextDouble();
				
				c1.debitar(valor);
				
				Operacao op2 = new Operacao(c1, "débito", valor);
				
				d.push(op2);
			break;
			case 2:
				System.out.println("Digite o valor do depósito: ");
				double deposito = sc.nextDouble();
				
				c1.debitar(deposito);
				
				Operacao op3 = new Operacao(c1, "débito", deposito);
				
				d.push(op3);
				break;
			case 3:
				System.out.println("Digite a qtde de operações que serão desfeitas:");
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
