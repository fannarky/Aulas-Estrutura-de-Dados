package Carrinho;

import Exercicio3.Tributavel;

public abstract class Produto implements Tributavel {
	private int codigo;
	
	private double precoProduto;

	public Produto(int codigo, double precoProduto) {
		super();
		this.codigo = codigo;
		this.precoProduto = precoProduto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", precoProduto=" + precoProduto + "]";
	}
	
	
}
