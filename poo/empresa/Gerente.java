package poo.empresa;

public class Gerente extends Funcionario {

	
	private String setor;
	
	public Gerente(String nome, String email, int telefone, int idade, char genero, String setor) {
		super(nome, email, telefone, idade, genero);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Setor: " + setor );
	}
}
