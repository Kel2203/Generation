package poo.empresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		Vendedor funcionario1 = new Vendedor();
		Gerente funcionario2 = new Gerente();
		
        
        System.out.println("Digite os dados do Id Vendedor\n");
        
        funcionario1.nome();
        funcionario1.genero();
        funcionario1.id();
        funcionario1.idade();
        funcionario1.email();
        funcionario1.telefone();
      
        System.out.println("\nDigite agora os dados do Id do Gerente");
        funcionario2.nome();
        funcionario2.genero();
        funcionario2.id();
        funcionario2.idade();
        funcionario2.email();
        funcionario2.telefone();
        
        System.out.println("\nDados dos Funcionarios\n");
        
        funcionario1.visualizar();
        funcionario2.visualizar();
	}

}
