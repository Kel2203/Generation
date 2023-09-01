package entradaDeDados;

import java.util.Scanner;

public class Exercicios02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float nota01, nota02, nota03, nota04, resultado;
		
		System.out.println("DIGITE SUAS NOTAS: ");
		nota01 = ler.nextFloat();
		nota02 = ler.nextFloat();
		nota03 = ler.nextFloat();
		nota04 = ler.nextFloat();
		
		resultado = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.printf("Sua nota foi %.1f", resultado);

	}

}
