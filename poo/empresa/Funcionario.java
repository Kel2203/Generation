package poo.empresa;

public class Funcionario {
//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Funcionario 
//	com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaFuncionario, instancie dois 
//	objetos da Classe Funcionario e apresente as informações destes 2 Objetos no console.
//
//	Boas práticas:
//
//	Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto Funcionario, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Funcionario;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Funcionario nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Funcionario;
//	Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo o Método main() e instancie 2 Objetos da Classe Funcionario;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.


	private String nome, email;
	private int telefone, idade;
	private char genero;
	
	
	public Funcionario(String nome, String email, int telefone, int idade, char genero) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
public void visualizar() {
	 System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade);
     System.out.println("Telefone: " + telefone);
     System.out.println("genero: " + genero);
     System.out.println("Email: " + email);
}
	

}
