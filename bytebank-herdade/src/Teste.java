
public class Teste {

	public static void main(String[] args) {
		FuncionarioTeste f1 = new FuncionarioTeste();
		
		f1.setSalario(3000.0);
		System.out.println(f1.getBonificacao());
		System.out.println(f1.getTipo());
		

		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(1);
		f2.setSalario(5000.0);
		System.out.println(f2.getBonificacao());
		System.out.println(f2.getTipo());
		
	}

}
