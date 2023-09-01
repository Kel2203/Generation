package laçosRepetiçao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
//		Escreva um algoritmo em Java, que leia a idade de várias 
//		pessoas (números inteiros), via teclado e mostre na tela o 
//		total de pessoas cuja idade seja menor que 21 anos e o total 
//		de pessoas cuja idade seja maior que 50 anos. 
//		A leitura dos dados deve ser finalizada ao digitar uma idade negativa. 
		

		Scanner leia = new Scanner(System.in);
		
		int idade;
		int menos21 = 0;
		int mais50 = 0;
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			if(idade < 21) {
				menos21++;
			}else if(idade > 50){
				mais50++;
			}
			System.out.print("Digite outra idade: ");
            idade = leia.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
        System.out.println("Total de pessoas com mais de 50 anos: " + mais50);	
	}

}
