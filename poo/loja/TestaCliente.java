package poo.loja;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		 // Instancia dois objetos da Classe Cliente
        Cliente cliente1 = new Cliente("raquel", 123, 34, 59315513, "teste@gmail.com");
        
        Cliente cliente2 = new Cliente("ana", 456, 23, 59315518, "teste02@gmail.com");

        // Exibe as informações dos objetos instanciados
        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();
	}

}
