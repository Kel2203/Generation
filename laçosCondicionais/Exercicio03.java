package laçosCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
//		Pessoas com idade entre 60 e 69 anos, só podem doar se não for 
//		a sua primeira doação. Escreva um Algoritmo em Java que obtenha 
//		via teclado o nome do doador (String), a idade (inteiro) do doador e se é a 
//		primeira doação (boolean). De acordo com as Regras para a doação, mostre 
//		na tela se o doador está Apto ou Não Apto para doar sangue. 
	
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.print("Digite o Nome do doador: ");
		nome = sc.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = sc.nextInt();
		
		System.out.print("Primeira doação de sangue?: ");
		primeiraDoacao = sc.nextBoolean();
		
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && primeiraDoacao == true) {
				System.out.println(nome + " não está apto para doar sangue!");
			}else {
				System.out.println(nome + " está apto para doar sangue!");
			}
			
		}else {
			System.out.println(nome + " não está apto para doar sangue!");
		}

	}

}


