package laçosCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//		Escreva um algoritmo em Java, que leia 3 palavras (String), 
//		que definem as características de um tipo de animal possível 
//		segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
		
		Scanner scan = new Scanner(System.in);
		String palavra1, palavra2, palavra3;
		
        System.out.println("Digite a primeira palavra: ");
        palavra1 = scan.nextLine();

        System.out.println("Digite a segunda palavra: ");
        palavra2 = scan.nextLine();

        System.out.println("Digite a terceira palavra: ");
        palavra3 = scan.nextLine();
		
        if (palavra1.equalsIgnoreCase("vertebrado")) {
        
            if (palavra2.equalsIgnoreCase("mamífero")) {
             
                if (palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Leão");
                } else if (palavra3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Vaca");
                }
            } else if (palavra2.equalsIgnoreCase("ave")) {
              
                if (palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Gavião");
                } else if (palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Águia");
                } else if (palavra3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Canário");
                }
            } else if (palavra2.equalsIgnoreCase("anfíbio")) {
             
                if (palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Sapo");
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
      
            if (palavra2.equalsIgnoreCase("inseto")) {
               
                if (palavra3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Lagarta");
                } else if (palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Joaninha");
                }
            }
        }
		
	}

}
