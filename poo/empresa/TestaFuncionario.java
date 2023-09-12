package poo.empresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		Vendedor funcionario1 = new Vendedor("Maria da Silva", "maria@gmail.com", 80010000, 20, 'F', 2400.23);
		Gerente funcionario2 = new Gerente("João dos Santos", "joãoa@gmail.com", 40028922, 43, 'M', "Operacional");
		
        funcionario1.visualizar();
        funcionario2.visualizar();
	

	}

}
