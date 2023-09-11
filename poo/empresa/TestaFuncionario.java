package poo.empresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Maria da Silva", "maria@gmail.com", 80010000, 20, 'F');
		Funcionario funcionario2 = new Funcionario("João dos Santos", "joãoa@gmail.com", 40028922, 43, 'M');
		
        funcionario1.visualizar();
        System.out.println();
        funcionario2.visualizar();
	

	}

}
