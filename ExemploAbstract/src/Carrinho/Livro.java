package Carrinho;

public class Livro extends Produto {

	String nome;
	
	String autor;
	
	String isbm;

	public Livro(int codigo, double precoProduto, String nome, String autor, String isbm) {
		super(codigo, precoProduto);
		this.nome = nome;
		this.autor = autor;
		this.isbm = isbm;
	}


	@Override
	public String toString() {
		return "Livro " +super.toString()+ " [nome=" + nome + ", autor=" + autor + ", isbm=" + isbm + "]";
	}


	@Override
	public double getValorTributo() {
		// TODO Auto-generated method stub
		return super.getPrecoProduto() * 1.1;
	}
	
	
	
	
	
	

}
