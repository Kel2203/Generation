package laçosCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
		 e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/
		
		
			Scanner sc = new Scanner(System.in);
			int A, B, C, soma;
			
			System.out.println("Digite o valor de A: ");
			A = sc.nextInt();
			
			System.out.println("Digite o valor de B: ");
			B = sc.nextInt();
			
			System.out.println("Digite o valor de C: ");
			C = sc.nextInt();
			
			soma = A + B;
			
			
			
			if(soma > C ) {
				System.out.println(A + " + " + B + " = " + soma + " > " + C );
				System.out.println("A Soma de " + A + " + " + B + " é Maior do que " + C + "!");
			} else if(soma < C) {
				System.out.println(A + " + " + B + " = " + soma + " < " + C );
				System.out.println("A Soma de " + A + " + " + B + " é Menor do que " + C + "!");
			}else {
				System.out.println(A + " + " + B + " = " + soma + " = " + C );
				System.out.println("A Soma de " + A + " + " + B + " é Igual a " + C + "!");
			}

	}

}
