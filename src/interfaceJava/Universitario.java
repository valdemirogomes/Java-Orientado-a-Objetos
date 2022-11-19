package interfaceJava;

public class Universitario implements InterfacePessoa{
	private String nome;

	public Universitario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void trabalhar() {
		System.out.println("Estagio supervisionado");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Sem tempo para se alimentar");
		
	}

	@Override
	public void laser() {
		System.out.println("Nao existe laser para universitario");
		
	}

	@Override
	public String toString() {
		return "Universitario [nome=" + nome + "]";
	}
	

}
