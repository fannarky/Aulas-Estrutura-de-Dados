package pilha;

public class Pilha {
	 	private int topo;

	    private int[] pilha;

	    private int tamPilha;

	    public Pilha(int tamPilha){
	        this.pilha = new int[tamPilha];
	        this.topo = -1;
	        this.tamPilha = tamPilha;
	    }

	    public boolean isEmpty(){
	        return this.topo == -1;
	    }

	    public void push(int info){
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

	    public int peek(){
	        if(this.isEmpty())
	            return -1;

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
