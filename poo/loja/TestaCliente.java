package poo.loja;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		
        PessoaFisica cliente1 = new PessoaFisica();
        
        PessoaJuridica cliente2 = new PessoaJuridica();

        System.out.println("Digite os dados do usuario\n");
        cliente1.id();
        cliente1.nome();
        cliente1.tipo();
        cliente1.idade();
        cliente1.email();
        cliente1.telefone();
      
        System.out.println("\nDigite agora os dados do usuario PJ");
        cliente2.id();
        cliente2.nome();
        cliente2.tipo();
        cliente2.idade();
        cliente2.email();
        cliente2.telefone();
        
        System.out.println("\nDados dos usuarios\n");
        
        cliente1.visualizar();
        cliente2.visualizar();
	}

}
