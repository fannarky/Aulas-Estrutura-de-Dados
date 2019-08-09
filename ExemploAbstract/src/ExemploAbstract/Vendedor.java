package ExemploAbstract;

public class Vendedor extends Funcionario{
	
	
	private double vendas;
	
	private double taxa;
	
	public Vendedor(int codigo, String nome, double vendas, double taxa) {
		super(codigo, nome);
		
		this.vendas = vendas;
		this.taxa = taxa;
	}

	@Override
	public double calculaSalario() {
		return vendas * taxa;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return super.toString() + "[vendas=" + vendas + ", taxa=" + taxa + ", salario : " + calculaSalario() + "]";
	}
	
	
}
