package poo.games;


public class TesteProduto {

	public static void main(String[] args) {
		
		
		Produto produto1 = new Produto("GTA V", "Rock Star", 2013, 5, 75.50);
		Produto produto2 = new Produto("FIFA23", "EI", 2022, 4, 68.90);
		
        produto1.visualizar();
        System.out.println("\n*********************************************");
        produto2.visualizar();

	}

}
