package classeAbstrata;

public abstract class Pessoa {
	
	private String nome;
	private int RG;
	private String cpf;
	private String dataNascimento;
	private int telefone;
	
	public Pessoa(String nome, int RG, String cpf, String dataNascimento, int telefone) {
		this.nome = nome;
		this.RG = RG;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getRG() {
		return RG;
	}



	public void setRG(int rG) {
		RG = rG;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public abstract void visualizar();
	
	
	

}
