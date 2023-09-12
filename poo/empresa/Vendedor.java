package poo.empresa;

public class Vendedor extends Funcionario{
	
	
	private double porcentagem = 0.04, vendas;

	
	public Vendedor(String nome, String email, int telefone, int idade, char genero, double vendas) {
		super(nome, email, telefone, idade, genero);
		this.vendas = vendas;
		
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Comissão : %.2f", vendas * porcentagem);
	}

}
