package poo.loja;

public class Cliente {
	
//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a 
//	Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada 
//	TestaCliente, instancie dois objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.
	
//	Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Cliente;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Cliente nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Cliente;
//	Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método main() e instancie 2 Objetos da Classe Cliente;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

	private String nome;
	private int id;
	private int idade;
	private int telefone;
	private String email;
	
	
	
	public Cliente(String nome, int id, int idade, int telefone, String email) {
		this.nome = nome;
		this.id = id;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
	}
	
	 public void visualizar() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("ID: " + id);
	        System.out.println("Telefone: " + telefone);
	        System.out.println("Email: " + email);
	    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getGenero() {
		return email;
	}
	public void setGenero(String email) {
		this.email = email;
	}
	
	
	
	


}
