package pilha;

public class PilhaObj<T> {
	 	private int topo;

	    private T[] pilha;

	    private int tamPilha;

	    public PilhaObj(int tamPilha){
	        this.pilha = (T[]) new Object[tamPilha];
	        this.topo = -1;
	        this.tamPilha = tamPilha;
	    }

	    public boolean isEmpty(){
	        return this.topo == -1;
	    }

	    public void push(T info){
	    	System.out.println(this.topo);
	    	topo++;
	        if(this.topo == (pilha.length)){
	        	topo--;
	            System.out.println("Pilha cheia!!!");
	            return;
	        }else{
	            this.pilha[this.topo] = info;
	            System.out.println("inserido com sucesso !");
	        }
	    }

	    public T peek(){
	        if(this.isEmpty())
	            return null;

	        return this.pilha[this.topo];
	    }

	    public void exibe(){
	        if(this.isEmpty()){
	            System.out.println("Pilha não retornou resultados !!!");
	        }else{
	            for(int i = 0 ; i < this.pilha.length ; i ++){
	                System.out.println(this.pilha[i]);
	            }
	        }
	    }
}
