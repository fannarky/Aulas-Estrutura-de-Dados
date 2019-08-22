package Carrinho;

public class DVD extends Produto{

	String nome;
	
	String gravadora;
	
	public DVD(int codigo, double precoProduto, String nome, String gravadora) {
		super(codigo, precoProduto);
		this.nome = nome;
		this.gravadora = gravadora;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	@Override
	public String toString() {
		return "DVD " +super.toString()+ " [nome=" + nome + ", gravadora=" + gravadora + "]";
	}

	@Override
	public double getValorTributo() {
		// TODO Auto-generated method stub
		return super.getPrecoProduto() * 1.2;
	}

}
