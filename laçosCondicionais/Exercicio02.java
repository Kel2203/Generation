package laçosCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
//		mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é 
//		positivo ou negativo. Veja os exemplos abaixo:

		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um némero: ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			if (num >= 0) {
		        System.out.println("O número " + num + " é par e positivo");
		        }else {
		        	System.out.println("O número " + num + " é par e negativo");
		        }
		}else {
		    System.out.println("O número " + num + " é ímpar e " + (num >= 0 ? "positivo" : "negativo"));
		}


	}

}
