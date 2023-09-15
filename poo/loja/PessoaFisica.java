package poo.loja;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class PessoaFisica extends Cliente implements Tipo {

	private Optional<String> nome = Optional.empty();
    private Optional<String> email = Optional.empty();
    private Optional<String> cpf = Optional.empty();
	private int id, idade, telefone;
	 
	Scanner sc = new Scanner(System.in);
	
	

	@Override
	public void id() {
		try {
		System.out.print("Digite o id do usuario: ");
		id = sc.nextInt();}
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
			
		}
	}
	@Override
	public void nome() {
		try {
		System.out.print("Digite o Nome: ");
		sc.nextLine();
		String input = sc.nextLine();
        if (!input.isEmpty()) {
            nome = Optional.of(input);
        } else {
            System.out.println("O campo está vazio.");
        }}
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir números inteiros!");
			
		}
		
	}
	@Override
	public void tipo() {
		try {
		System.out.print("Digite o CPF do usuario: ");
		String input = sc.nextLine();
        if (!input.isEmpty()) {
            cpf = Optional.of(input);
        } else {
            System.out.println("O campo está vazio.");
        }	}
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido números inteiros!");
			
		}
	}
	
	@Override
	public void idade() {
		try {
		System.out.print("Digite a idade do usuario: ");
		idade = sc.nextInt();	}
		catch(InputMismatchException e) {
			System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
		}
	}
	
	@Override
	public void email() {
		try {
		System.out.print("Digite o email do usuario: ");
		sc.nextLine();
		String input = sc.nextLine();
        if (!input.isEmpty()) {
            email = Optional.of(input);
        } else {
            System.out.println("O campo está vazio.");
        }
		}
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir números inteiros!");
			
		}
	}
	
	@Override
	public void telefone() {
		
		try {
		System.out.print("Digite o telefone do usuario: ");
		telefone = sc.nextInt();
		
		}catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
			
		}
	}
		
	@Override
	public void visualizar() {
		 System.out.println("---------------------------------------------------");
		 System.out.println("Id: " + id);
		 nome.ifPresent(n -> System.out.println("Nome: " + n));
	     cpf.ifPresent(c -> System.out.println("CPF: " + c));
		 System.out.println("Idade: " + idade);
		 email.ifPresent(e -> System.out.println("Email: " + e));
		 System.out.println("Telefone: " + telefone);
		 System.out.println("---------------------------------------------------");
		 
	
	}
	

}
