package Exercicio3;

public class Perfume extends Produto implements Tributavel {

	public String fragrancia;
	
	public Perfume(int codigo, String descricao, double preco, String fragrancia) {
		super(codigo, descricao, preco);
		// TODO Auto-generated constructor stub
		this.fragrancia = fragrancia;
	}

	@Override
	public double getValorTributo() {
		return super.getPreco() * 0.27;
	}

}
