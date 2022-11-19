package interfaceJava;

public class Main {

	public static void main(String[] args) {
		Universitario u = new Universitario("Joao");
		Aluno a = new Aluno("Maria");
		
		System.out.println(a);
		a.acao(u);
		

	}

}
