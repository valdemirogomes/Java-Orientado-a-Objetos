package exemploPolimorfismo002;

public class Mamifero extends Animal {

	public Mamifero(String especie, float peso, int idade, int numMembros) {
		super(especie, peso, idade, numMembros);
	}

	@Override
	public void locomover() {
		System.out.println(" ");

	}

	@Override
	public void alimentar() {
		System.out.println(" ");

	}

}
