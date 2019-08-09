package ExemploAbstract;

public class ExemploAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario sec = new Vendedor(1, "José", 123, 0.10);
		
		System.out.println(sec);
		
		Funcionario hor = new Horista(6, 50, 2, "Joao");
		
		System.out.println(hor);
		
		System.out.println(Funcionario.contVendedor);

	}

}
