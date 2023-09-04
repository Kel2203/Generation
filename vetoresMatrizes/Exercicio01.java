package vetoresMatrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//		Dado um vetor contendo 10 números inteiros não ordenados e 
//		não repetidos, construa um algoritmo que consiga pesquisar dados 
//		no vetor, onde o usuário irá digitar um número e o 
//		programa deve exibir na tela a posição deste número no vetor. 
//		Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” 
//		deve ser exibida na tela.

		Scanner sc = new Scanner(System.in);

		int encontrar, posicao = -1, i, num[] = new int[10];

		for(i = 0; i < num.length; i++ ) {
		    System.out.print("Digite o " + (i + 1) + "º Número: ");
		    num[i] = sc.nextInt();
		}

		System.out.print("Digite o número que você deseja encontrar: ");
		encontrar = sc.nextInt();
		
		for (i = 0; i < num.length; i++) {
            if (num[i] == encontrar) {
                posicao = i;
                break; 
            }
        }

		if (posicao != -1) {
            System.out.println("O número " + encontrar + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + encontrar + " não foi encontrado!");
        }
		
	}

}
