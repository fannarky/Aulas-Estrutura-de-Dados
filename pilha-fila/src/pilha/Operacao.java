package pilha;

public class Operacao {
	private ContaBancaria objConta;
	
	private String tipoOperacao;
	
	private double valor;

	public Operacao(ContaBancaria objConta, String tipoOperacao, double valor) {
		super();
		this.objConta = objConta;
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Operacao [objConta=" + objConta + ", tipoOperacao=" + tipoOperacao + ", valor=" + valor + "]";
	}
	
	
}
