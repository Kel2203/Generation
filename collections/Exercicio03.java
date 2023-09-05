package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer.
		/*
		 * O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores
		 * inteiros não repetidos e adicione-os individualmente na Collection Set. Em
		 * seguida, faça o que se pede: Mostre na tela todos os elementos da Collection
		 * Set, utilizando a Classe Iterator.
		 */

		Scanner sc = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º Número: ");
			int valor = sc.nextInt();
			num.add(valor);

		}
		Iterator<Integer> iterator = num.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
