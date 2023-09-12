package poo.loja;

public class PessoaFisica extends Cliente {

	
	private String cpf;
	public PessoaFisica(String nome, int id, int idade, int telefone, String email, String cpf) {
		super(nome, id, idade, telefone, email);
		this.cpf = cpf;
	
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		 System.out.println("CPF: " + cpf);
	}
	

}
