package ExemploAbstrata;

public class Vendedor extends Funcionario{
	
	// Atributos
	private double vendas; 	// valor das vendas realizadas no m�s
	private double taxa;	// taxa de comiss�o ganho sobre as vendas
	private static int contVendedor=0; 
	
	
	// Construtor
	public Vendedor(int codigo, String nome, double vendas, double taxa)
	{
		super(codigo, nome);   // chamada do construtor da classe m�e
		this.vendas = vendas;
		this.taxa = taxa;
		contVendedor++;
	}

	// M�todos
	
	
	public static int getContVendedor() {
		return contVendedor;
	}

	// Implementa��o do m�todo abstrato calcSalario
	@Override
	public double calcSalario() {
		return vendas * taxa;
	}

	// M�todo toString
	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + ", vendas=" + vendas +
				", taxa=" + taxa + ", sal�rio=" + calcSalario() +	"]";
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
	
	
	
	

}
