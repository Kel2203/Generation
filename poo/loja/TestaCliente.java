package poo.loja;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		
        PessoaFisica cliente1 = new PessoaFisica(
        		"Mario dos Santos", 
        		123, 34, 59315513, 
        		"mario@gmail.com", 
        		"12345678910"
        		);
        PessoaJuridica cliente2 = new PessoaJuridica(
        		"Ana Barbosa",
        		"12312312312", 
        		456, 
        		23, 
        		59315518, 
        		"ana_barb@gmail.com"
        		);

    
        cliente1.visualizar();
        cliente2.visualizar();
	}

}
