package poo.empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerente extends Funcionario implements Id {

	private String nome, email, setor;
	private int telefone, idade;
	private char genero;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void id() {
		try {
		System.out.print("Digite o setor do usuario: ");
		sc.nextLine();
		setor = sc.nextLine();}
		
		catch(InputMismatchException e) {
			
			System.err.println("Não é permitido inserir números inteiros!");
			
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
	public void genero() {
		try {
		System.out.print("Digite o "+ "M" + " para masculino, " + "F" + " para feminino ou "+ "N" + " para não se aplica: ");
		genero = sc.next().charAt(genero);	}
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
		 System.out.println("Nome: " + nome);
		 System.out.println("Gênero: " + genero);
		 System.out.println("Idade: " + idade);
		 System.out.println("Setor : " + setor);
		 System.out.println("Email: " + email);
		 System.out.println("Telefone: " + telefone);
		 System.out.println("---------------------------------------------------");
		 
	
	}
	
}
