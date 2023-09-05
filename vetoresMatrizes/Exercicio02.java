package vetoresMatrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//			Todos os elementos da Diagonal Principal
//			Todos os elementos da Diagonal Secundária
//			A Soma de todos os elementos da Diagonal Principal
//			A Soma de todos os elementos da Diagonal Secundária

		Scanner sc = new Scanner(System.in);

		int i, j, soma = 0, somaSec = 0, matriz[][] = new int[3][3];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Digite o elemento na posição [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal da matriz:");

		for (i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
			soma += matriz[i][i];
		}
		System.out.println();
		System.out.println("Diagonal secundária da matriz:");
		for (i = 0; i < 3; i++) {
			System.out.print(matriz[i][3 - 1 - i] + " ");
			somaSec += matriz[i][3 - 1 - i];
		}
		System.out.println();

		System.out.println("A soma dos elementos da diagonal principal é: " + soma);
		System.out.println("A soma dos elementos da diagonal secundaria é: " + somaSec);

		sc.close();

	}

}
