package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicios01 {

	public static void main(String[] args) {
		
//		Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
//		O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e 
//		deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//		Mostre na tela todas as cores que foram adicionadas. 
//		Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.


		
		
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> cores = new ArrayList<>();

	        System.out.println("Digite 5 cores:");
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Cor " + (i + 1) + ": ");
	            String cor = sc.nextLine();
	            cores.add(cor);
	        }
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	        Collections.sort(cores);

	        System.out.println("\nOrdenar as cores: ");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	}

}
