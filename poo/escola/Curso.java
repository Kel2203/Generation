package poo.escola;

public class Curso {
//	Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a 
//	Classe Curso com os seus respectivos Métodos e Atributos, que descreva um Curso qualquer, de uma Plataforma EAD. 
//	Na sequência, crie uma Classe chamada TestaCurso, instancie dois objetos da Classe Curso e apresente as informações destes 
//	2 Objetos no console.
//
//
//
//	Crie a Classe Curso e defina pelo menos 5 Atributos relevantes ao Curso EAD, a sua escolha;
//	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Curso EAD;
//	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Curso nos argumentos do Método;
//	Crie os Métodos Get e Set para todos os Atributos da Classe Curso;
//	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Curso;
//	Crie a Classe TestaCurso no mesmo pacote da Classe Curso, contendo o Método main() e instancie 2 Objetos da Classe Curso;
//	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

	
	private String nome, materia, professor, horario;
	private int meses;
	public Curso(String nome, String materia, String professor, String horario, int meses) {
		super();
		this.nome = nome;
		this.materia = materia;
		this.professor = professor;
		this.horario = horario;
		this.meses = meses;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	
	public void visualizar() {
		 System.out.println("Nome: " + nome);
	     System.out.println("Matéria do curso: " + materia);
	     System.out.println("Professor(a): " + professor);
	     System.out.println("Horario da aula: " + horario);
	     System.out.println("Duração " + meses + " meses");
	}
	

}
