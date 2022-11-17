package construtorHeranca001;

public class MainFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Jose", "Internacao", 7977643, "Enfermeiro", 2.900f);
		funcionario1.visualizarDadod();
		
		Funcionario funcionario2 = new Funcionario("Maria", "Hotelaria", 7887654, "Arrumadeira", 1.900f);
		funcionario2.visualizarDadod();


	}

}
