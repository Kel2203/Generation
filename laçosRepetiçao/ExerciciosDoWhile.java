package laçosRepetiçao;

import java.util.Scanner;

public class ExerciciosDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;

        System.out.println("Digite números inteiros (digite 0 para encerrar):");

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if (num > 0) {
                soma += num;
            }
        } while (num != 0);


        System.out.println("A soma dos números positivos é: " + soma);
    

	}

}
