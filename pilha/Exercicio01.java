package pilha;

import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a 
		retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
			2: Listar todos os livros da Pilha
			3: Retirar um livro da pilha 
			0: O programa deve ser finalizado. 
			Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.*/
		
		Stack<String> livro = new Stack<String>();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("================================================");
		
		System.out.println("Selecione uma das opções 0, 1, 2 ou 3");
		System.out.println("3 - Adicionar Livro ");
		System.out.println("3 - Listar todos os Livros");
		System.out.println("3 - Retirar livro da fila");
		System.out.println("0 - Sair");
		
		System.out.println("================================================");
		int opcao;
		do{
 
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Livro a ser adicionado: ");
                    sc.nextLine();
                    String nomeLivro = sc.nextLine();
                    livro.add(nomeLivro);
                    System.out.println(nomeLivro + " foi adicionado à fila.");
                    break;
                case 2:
                    if (livro.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String livroFila : livro) {
                            System.out.println(livroFila);
                        }
                    }
                    break;
                case 3:
                    if (livro.isEmpty()) {
                        System.out.println("A fila está vazia. Não é possível chamar um cliente.");
                    } else {
                        String livroChamado = livro.pop();
                        System.out.println(livroChamado + " foi chamado e retirado da fila.");
                        System.out.println("Lista atualizada: ");
                        for (String i : livro) { 
                        	 System.out.println(i);
                        }
                        
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 0);


		


	}

}
