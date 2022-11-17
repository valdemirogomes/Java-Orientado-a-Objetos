package exemploPolimorfismo002;

public class Cachorro extends Mamifero {

	String tipo;

	public Cachorro(String especie, float peso, int idade, int numMembros, String tipo) {
		super(especie, peso, idade, numMembros);
		this.tipo = tipo;
	}
	
	@Override
	public void locomover(){
		System.out.println("apoiando-se nas patas dianteiras e traseiras. Mais precisamente, eles se apoiam na pontinha das patas");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Carne, Plantas e Vegetais");

	}

	
	public String toString() {
		return "Animal [especie=" + especie + ", peso=" + peso + ", idade=" + idade + ", numMembros=" + numMembros
				+ ", tipo=" + tipo + "]";
	}

}
