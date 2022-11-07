package classe;

public class Cliente {
	private String nome;
	private String CPF;
	private int RG;
	private int contato;
	private String cidade;
	private String dtNascimento;
	
	public Cliente(String nome, String cPF, int rG, int contato, String cidade, String dtNascimento) {
		super();
		this.nome = nome;
		CPF = cPF;
		RG = rG;
		this.contato = contato;
		this.cidade = cidade;
		this.dtNascimento = dtNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public int getRG() {
		return RG;
	}
	
	public int getContato() {
		return contato;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public void visualizarDadod() {
		System.out.println("Cliente: " + this.nome);
		System.out.println("CPF: " + this.CPF);
		System.out.println("RG: " + this.RG);
		System.out.println("Contato: " + this.contato);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Data de nascimento: " + this.dtNascimento);
		System.out.println("*****************************************************************************");

		
		
	}

}
