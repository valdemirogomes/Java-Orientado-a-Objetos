package classe;

public class Atendente extends Pessoa {

	private int matricula;
	
	public Atendente(String nome, String sobrenome, int rg, String cpf, String dtNascimento, int matricula) {
		super(nome, sobrenome, rg, cpf, dtNascimento);
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


}
