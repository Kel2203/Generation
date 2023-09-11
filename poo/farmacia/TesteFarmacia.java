package poo.farmacia;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia remedio1 = new Farmacia("Dipirona", "Genérico","JUN/2026", 2, 7.89);
		Farmacia remedio2 = new Farmacia("Dramin", "Genérico","FEV/2025", 5, 11.99);
		
		remedio1.visualizar();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		remedio2.visualizar();
		

	}

}
