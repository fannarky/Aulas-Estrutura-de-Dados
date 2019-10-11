package listaestatica;

import Projeto07.ListaObj;

public class Teste {

	public static void main(String[] args) {
		ListaObj<String> t = new ListaObj<>(5);
		
		if(t.adiciona("Elemento1"))
			System.out.println("Elemento adicionado");
		
		if(t.adiciona("Elemento2"))
			System.out.println("Elemento adicionado");
		
		if(t.adiciona("Elemento3"))
			System.out.println("Elemento adicionado");
		
		if(t.adiciona("Elemento4"))
			System.out.println("Elemento adicionado");
		
		if(t.adiciona("Elemento5"))
			System.out.println("Elemento adicionado");
		
		
		if(t.busca("Elemento5") == 1)
			System.out.println("Elemento encontrado");
		
		t.exibe();
		
		if(t.removePeloIndice(4))
			System.out.println("Elemento removido");
		else
			System.out.println("Elemento não encontrado");

		
		if(t.removeElemento("Elemento1"))
			System.out.println("Elemento localizado e removido");
		else
			System.out.println("elemento não localizado");
		
		System.out.println(t.getTamanho());
		
		System.out.println(t.getElemento(3));
		
	}

}
