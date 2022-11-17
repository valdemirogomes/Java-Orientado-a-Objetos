package exemploPolimorfismo02;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Canidae", 40f, 3, 4, "Pitbull");
		System.out.println(cachorro.toString());
		cachorro.locomover();
		cachorro.alimentar();

		Animal oviparo = new Oviparo("Anfibio", 2f, 2, 2, "rãs");
		System.out.println(oviparo.toString());
		oviparo.locomover();
		oviparo.alimentar();

	}

}
