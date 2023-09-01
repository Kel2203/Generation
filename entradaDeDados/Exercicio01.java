package entradaDeDados;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner (System.in);
        double salario, abono, salarioNovo;
        
        
        System.out.println("Digite o salário: ");
        salario = ler.nextDouble();
        
        System.out.println("Digite o abono: ");
        abono = ler.nextDouble();
        
        salarioNovo = salario + abono;
        
        System.out.println("Seu salario será: " + salarioNovo);
        
	}

}
