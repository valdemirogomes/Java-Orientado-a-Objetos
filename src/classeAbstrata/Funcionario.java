package classeAbstrata;

public class Funcionario extends Pessoa {
	private int matricula;
	private String setor;
	private String funcao;
	private Double salario;

	public Funcionario(String nome, int RG, String cpf, String dataNascimento, int telefone, int matricula,
			String setor, String funcao, Double salario) {
		super(nome, RG, cpf, dataNascimento, telefone);
		this.matricula = matricula;
		this.setor = setor;
		this.funcao = funcao;
		this.salario = salario;
	}

	@Override
	public void visualizar() {
		System.out.println("Nome: " + getNome());
		System.out.println("RG: " + getRG());
		System.out.println("CPF: " + getCpf());
		System.out.println("Data de nascimento: " + getDataNascimento());
		System.out.println("Contato: " + getTelefone());
		System.out.println("Matricula: " + matricula);
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + funcao);
		System.out.println("Salario R$ " + salario);

	}

}
