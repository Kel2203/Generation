package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
		para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter 
		um Menu que aceitará as opções 0, 1, 2 e 3:
			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
			2: Listar todos os Clientes na fila
			3: Chamar (retirar) uma pessoa da fila 
			0: O programa deve ser finalizado. 
			Caso a fila esteja vazia, o programa deverá informar que a fila 
			está vazia ao tentar retirar (chamar) um cliente da fila..*/
		
		Queue<String> cliente = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
	
		int opcao;
        do {
        	System.out.println("================================================");
    		
    		System.out.println("Selecione uma das opções 0, 1, 2 ou 3");
    		System.out.println("3 - Adcionar Cliente na fila");
    		System.out.println("3 - Listar todos os Clientes");
    		System.out.println("3 - Retirar Cliente da fila");
    		System.out.println("0 - Sair");
    		
    		System.out.println("================================================");
    		
   
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente a ser adicionado: ");
                    sc.nextLine();
                    String nomeCliente = sc.nextLine();
                    cliente.add(nomeCliente);
                    System.out.println(nomeCliente + " foi adicionado à fila.");
                    break;
                case 2:
                    if (cliente.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String clienteFila : cliente) {
                            System.out.println(clienteFila);
                        }
                    }
                    break;
                case 3:
                    if (cliente.isEmpty()) {
                        System.out.println("A fila está vazia. Não é possível chamar um cliente.");
                    } else {
                        String clienteChamado = cliente.remove();
                        System.out.println(clienteChamado + " foi chamado e retirado da fila.");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
	}
		

	}


