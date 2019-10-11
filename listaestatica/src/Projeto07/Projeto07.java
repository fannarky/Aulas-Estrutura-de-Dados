package Projeto07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class Projeto07 {

	public static void main(String[] args) {
		ListaObj<Aluno> lista = new ListaObj<Aluno>(10);
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("Olá, o que deseja fazer? ");
			System.out.println("1 - Adicionar um aluno");
			System.out.println("2 - Exibir lista de alunos");
			System.out.println("3 - Gravar a lista em um arquivo txt");
			System.out.println("4 - Fim");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.next();
				System.out.println("Digite o RA do aluno: ");
				int RA = sc.nextInt();
				System.out.println("Digite a nota do aluno: ");
				double nota = sc.nextDouble();
				
				Aluno al = new Aluno(RA, nome, nota);
				lista.adiciona(al);
				break;
			case 2:
				lista.exibe();
				break;
			case 3:
				if(lista.getTamanho() == 0) {
					System.out.println("Lista vazia, não há nada para gravar");
				}else {
					gravaArquivoTxt(lista);
				}
				
				lista.limpa();
				break;
			case 4:
				System.out.println("Finalizado! ");
				break;
			default: 
				System.out.println("Opção inválida");
				break;
			}
		}while(opcao != 4);

	}

	private static void gravaArquivoTxt(ListaObj<Aluno> lista) {
		// TODO Auto-generated method stub
		FileWriter f = null;
		Formatter s = null;
		boolean erro = false;
		
		try {
			f = new FileWriter("Aluno.txt", true);
			s = new Formatter(f);
		}catch(IOException ex) {
			System.err.println("Erro ao abrir o arquivo " +ex.getMessage());
			System.exit(1);
		}
		
		try {
			for(int i = 0 ; i < lista.getTamanho() ; i++) {
				Aluno a = lista.getElemento(i);
				s.format("%d %s %.2f%n", a.getRA(), a.getNome(), a.getNota());
			}
		}catch(FormatterClosedException ex) {
			System.out.println("Erro ao gravar no arquivo, "+ ex.getMessage());
			erro = true;
		}
		finally {
			s.close();
			try {
				f.close();
			}catch(IOException ex) {}
		}
		
	}
	
	private static void gravaArquivoCsv(ListaObj<Aluno> lista) {
		// TODO Auto-generated method stub
		FileWriter f = null;
		Formatter s = null;
		boolean erro = false;
		
		try {
			f = new FileWriter("Aluno.csv", true);
			s = new Formatter(f);
		}catch(IOException ex) {
			System.err.println("Erro ao abrir o arquivo " +ex.getMessage());
			System.exit(1);
		}
		
		try {
			for(int i = 0 ; i < lista.getTamanho() ; i++) {
				Aluno a = lista.getElemento(i);
				s.format("%d %s %.2f%n", a.getRA(), a.getNome(), a.getNota());
			}
		}catch(FormatterClosedException ex) {
			System.out.println("Erro ao gravar no arquivo, "+ ex.getMessage());
			erro = true;
		}
		finally {
			s.close();
			try {
				f.close();
			}catch(IOException ex) {}
		}
		
	}
	
	public static void leExibeArquivoTxt() {
		FileReader arq = null;
		Scanner entrada = null;
		
		try {
			arq = new FileReader("aluno.txt");
			entrada = new Scanner(arq);
		}catch(IOException ex) {
						
		}
		
		
		try {
			
			System.out.printf("%-10d%-10s%7.2f \n", "Ra", "NOME", "NOTA");
			while(entrada.hasNext()) {
				int RA = entrada.nextInt();
				String nome = entrada.next();
				double nota = entrada.nextDouble();
				
				System.out.printf("\n %-10d%-10s%7.2f", RA, nome, nota);
			}
		}catch(Exception ex) {
			
		}
		
		try {
			entrada.close();
			arq.close();
		}catch(Exception ex) {}
	}

}
