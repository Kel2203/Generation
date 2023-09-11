package poo.escola;

public class TestaCurso {

	public static void main(String[] args) {
	
		 Curso curso1 = new Curso("Alura", "C++","Maria", "15:00", 2);
		 Curso curso2 = new Curso("Generation", "Java","João", "8:00", 3);
		
		curso1.visualizar();
		System.out.println("\n\n============================================================\n\n");
		curso2.visualizar();
	}

}
