package exemploPolimorfismo001;

public abstract class Bebida {
	private String nome;
	private boolean aquecer;

	public Bebida(String nome, boolean aquecida) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}

	public String getNome() {
		return nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void preparar() {

	}

}
