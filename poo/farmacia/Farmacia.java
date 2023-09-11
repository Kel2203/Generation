package poo.farmacia;

public class Farmacia {

//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Farmacia 
//	com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Farmácia. Na sequência, crie uma 
//	Classe chamada TestaFarmacia, instancie dois objetos da Classe Farmacia e apresente as informações destes 2 Objetos no console.
//
//	Boas práticas:
//
//	Crie a Classe Farmacia e defina pelo menos 5 Atributos relevantes aos Produtos de uma Farmacia, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer produto da Farmácia;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Farmacia nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Farmacia;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Farmacia;
//	Crie a Classe TestaFarmacia no mesmo pacote da Classe Farmacia, contendo o Método main() e instancie 2 Objetos da Classe Farmacia;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
	
	private String nome, marca, validade;
	private int unidades;
	private double preco;
	
	
	public Farmacia(String nome, String marca, String validade, int unidades, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.validade = validade;
		this.unidades = unidades;
		this.preco = preco;
	}
	
	public void visualizar() {
		 System.out.println("Nome do remédio: " + nome);
	    System.out.println("Marca: " + marca);
	    System.out.println("Validade: " + validade);
	    System.out.println("Unidades: " + unidades);
	    System.out.printf("Preço do remédio: R$%.2f", preco );
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
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
