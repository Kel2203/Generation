package poo.cinema;

public class Ingresso {
//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, 
//	crie a Classe Ingresso com os seus respectivos Métodos e Atributos, que descreva o ingresso de um evento qualquer. 
//	Na sequência, crie uma Classe chamada TestaIngresso, instancie dois objetos da Classe Ingresso e apresente 
//	as informações destes 2 Objetos no console.
//
//	Boas práticas:
//
//	Crie a Classe Ingresso e defina pelo menos 5 Atributos relevantes ao Ingresso de um evento, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer evento;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Ingresso nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Ingresso;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Ingresso;
//	Crie a Classe TestaIngresso no mesmo pacote da Classe Ingresso, contendo o Método main() e instancie 2 Objetos da Classe Ingresso;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

	
	
	private String nome;
	private int numero, classificacao, ano;
	private double preco;
	public Ingresso(String nome, int numero, int classificacao, int ano, double preco) {
		this.nome = nome;
		this.numero = numero;
		this.classificacao = classificacao;
		this.ano = ano;
		this.preco = preco;
	}
	public void visualizar() {
		 System.out.println("Nome do filme: " + nome);
		    System.out.println("Número do imgresso: " + numero);
		    System.out.println("classificação indicativa: " + classificacao);
		    System.out.println("Ano de lançamento: " + ano);
		    System.out.printf("Preço do remédio: R$%.2f", preco );
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}