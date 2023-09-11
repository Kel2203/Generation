package poo.games;

public class Produto {
//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a 
//	Classe Produto com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Loja de Games. Na sequência, 
//	crie uma Classe chamada TestaGame, instancie dois objetos da Classe Produto e apresente as informações destes 2 Objetos no console.
//
//	Boas práticas:
//
//	Crie a Classe Produto e defina pelo menos 5 Atributos relevantes aos Produtos de uma Loja de Games, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer produto da Loja de Games;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Produto nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Produto;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Produto;
//	Crie a Classe TestaGame no mesmo pacote da Classe Game, contendo o Método main() e instancie 2 Objetos da Classe Produto;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

private String nome, marca;
private int ano, classificacao;
private double preco;

public Produto(String nome, String marca, int ano, int classificacao, double preco) {
	this.nome = nome;
	this.marca = marca;
	this.ano = ano;
	this.classificacao = classificacao;
	this.preco = preco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public int getClassificacao() {
	return classificacao;
}

public void setClassificacao(int classificacao) {
	this.classificacao = classificacao;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void visualizar() {
	 System.out.println("Nome do jogo: " + nome);
    System.out.println("Marca: " + marca);
    System.out.println("Ano de lançameto: " + ano);
    System.out.println("Classificação (nota do jogo): " + classificacao);
    System.out.printf("Preço do jogo: R$%.2f", preco );
}

	
}
