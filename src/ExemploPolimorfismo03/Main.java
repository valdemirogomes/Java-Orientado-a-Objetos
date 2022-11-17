package ExemploPolimorfismo03;

public class Main {

	public static void main(String[] args) {
		/*
		Cachorro c = new Cachorro();
		Animal a = new Cachorro();
		a.morder();
		
		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro)a;
			c.morder();
		}
		*/
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
		
	}
	
	public static void falar(Animal a) {
		a.falar();
	}

}
