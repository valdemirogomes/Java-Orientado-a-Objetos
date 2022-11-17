package exemploPolimorfismo02;

public class Oviparo extends Animal {
	private String tipo;

	public Oviparo(String especie, float peso, int idade, int numMembros, String tipo) {
		super(especie, peso, idade, numMembros);
		this.tipo = tipo;

	}

	@Override
	public void locomover() {
		System.out.println("Nadar e pular");

	}

	@Override
	public void alimentar() {
		System.out.println("Insetos, aranhas, minhocas");

	}

	
	public String toString() {
		return "Animal [especie=" + especie + ", peso=" + peso + ", idade=" + idade + ", numMembros=" + numMembros
				+ ", tipo=" + tipo + "]";
	}

}
