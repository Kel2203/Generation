package poo.loja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaFisica extends Cliente implements Tipo {

	private String nome, email, cpf;
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
		nome = sc.nextLine();}
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir números inteiros!");
			
		}
		
	}
	@Override
	public void tipo() {
		try {
		System.out.print("Digite o CPF do usuario: ");
		cpf = sc.nextLine();	}
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
		email = sc.nextLine();}
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
		 System.out.println("Nome: " + nome);
		 System.out.println("CPF: " + cpf);
		 System.out.println("Idade: " + idade);
		 System.out.println("Email: " + email);
		 System.out.println("Telefone: " + telefone);
		 System.out.println("---------------------------------------------------");
		 
	
	}
	

}
