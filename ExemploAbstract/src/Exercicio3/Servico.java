package Exercicio3;

public class Servico implements Tributavel {

	private String descricao;
	
	private double preco;
	
	public Servico(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}



	@Override
	public double getValorTributo() {
		// TODO Auto-generated method stub
		return preco * 0.12;
	}

}
