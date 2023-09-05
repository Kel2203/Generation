package collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
		inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via 
		teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a 
		posição deste número na Collection. Caso o número não seja encontrado, ele deverá exibir 
		na tela a mensagem: O número NN não foi encontrado!*/
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(5);
		array.add(1);
		array.add(3);
		array.add(4);
		array.add(9);
		array.add(7);
		array.add(8);
		array.add(10);
		array.add(6);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		int posicao = array.indexOf(num);
        if (posicao != -1) {
            System.out.println("O número " + num + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }

	}

}
