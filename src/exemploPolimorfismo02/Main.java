package exemploPolimorfismo02;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Canidae", 40f, 3, 4, "Pitbull");
		System.out.println(cachorro.toString());
		cachorro.alimentar();

	}

}
