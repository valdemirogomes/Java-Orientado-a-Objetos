package exemploPolimorfismo01;

public class Refrigerante extends Bebida {
	
	public Refrigerante() {
		super("Brasileirinho Cola", false);
		
	}
	@Override
	public void preparar() {
		System.out.println("Preparando o refrigerante" );
		System.out.println("Precisa aquecer a bebida? " + super.isAquecer());
		
	}

}
