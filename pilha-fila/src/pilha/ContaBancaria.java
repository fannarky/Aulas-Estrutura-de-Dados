package pilha;

public class ContaBancaria {
	private int numero;
	private double saldo;
	
	public ContaBancaria(int numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
		System.out.println(saldo);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println(saldo);
	}
}
