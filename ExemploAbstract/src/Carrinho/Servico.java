package Carrinho;

public class Servico implements Vendavel {
	
	String descricao;
	
	int codigo;
	
	int qtdhroas;
	
	double valorHora;

	public Servico(String descricao, int codigo, int qtdhroas, double valorHora) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.qtdhroas = qtdhroas;
		this.valorHora = valorHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQtdhroas() {
		return qtdhroas;
	}

	public void setQtdhroas(int qtdhroas) {
		this.qtdhroas = qtdhroas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double getValorVenda() {
		// TODO Auto-generated method stub
		return getValorHora() * getQtdhroas();
	}

	@Override
	public String toString() {
		return "Servico" +super.toString()+ "  [descricao=" + descricao + ", codigo=" + codigo + ", qtdhroas=" + qtdhroas + ", valorHora="
				+ valorHora + "]";
	}

	
}
