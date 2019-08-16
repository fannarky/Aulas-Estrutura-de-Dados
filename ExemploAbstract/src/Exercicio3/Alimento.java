package Exercicio3;

public class Alimento extends Produto implements Tributavel {

	
	public int quantidadeVitamina;
	
	
	public Alimento(int codigo, String descricao, double preco, int quantidadeVitamina) {
		super(codigo, descricao, preco);
		this.quantidadeVitamina = quantidadeVitamina;
	}

	@Override
	public double getValorTributo() {
		// TODO Auto-generated method stub
		return super.getPreco() * 0.15;
	}

}
