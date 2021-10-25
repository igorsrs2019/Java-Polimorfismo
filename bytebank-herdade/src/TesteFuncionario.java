
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nicco = new Funcionario();
	   
		nicco.setNome("Nicco Steppet");
		nicco.setCpf("364.849.888-62");
		nicco.setSalario(2500);
		
		System.out.println("Nome: "+ nicco.getNome());
		System.out.println("Bonificacao: "+ nicco.getBonificacao());
		
	}

}
