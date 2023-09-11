package poo.cinema;

import poo.farmacia.Farmacia;

public class TestaIngresso {

	public static void main(String[] args) {
		
	
		Ingresso ingresso1 = new Ingresso("Os Vingadores", 1234 , 12, 2019, 45.89);
		Ingresso ingresso2 = new Ingresso("The Batman", 4567, 14, 2021, 39.99);
		
		ingresso1.visualizar();
		System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		ingresso2.visualizar();

	}

}
