package ExemploAbstract;

public abstract class Funcionario {
	
	private String nome;
	private int codigo;
	public static int contVendedor;
	
	public Funcionario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		contVendedor++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public abstract double calculaSalario();
	
	@Override
	public String toString() {
		return "Nome do Funcionario " + this.nome + ", Código: "+ this.codigo;
	}
	
	
}
