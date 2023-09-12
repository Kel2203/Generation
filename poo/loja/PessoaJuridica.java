package poo.loja;

public class PessoaJuridica extends Cliente {

	
	private String cnpj;
	public PessoaJuridica(String nome,String cnpj, int id, int idade, int telefone, String email) {
		super(nome, id, idade, telefone, email);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		 System.out.println("CNPJ: " + cnpj);
	}
	

	
}
