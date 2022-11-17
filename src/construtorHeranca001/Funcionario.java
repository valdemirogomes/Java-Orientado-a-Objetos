package construtorHeranca001;

public class Funcionario {
	private String nome;
	private String setor;
	private int matricula;
	private String cargo;
	private float salario;
	
	public Funcionario(String nome, String setor, int matricula, String cargo, float salario) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public float getSalario() {
		return salario;
	}
	public void visualizarDadod() {
		System.out.println("Funcionario: " + getNome());
		System.out.println("Setor: " + getSetor());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Salario: " + getSalario());
		System.out.println("*****************************************************************************");
	
	}
	

}
