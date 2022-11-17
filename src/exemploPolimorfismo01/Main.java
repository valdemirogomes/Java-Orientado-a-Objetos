package exemploPolimorfismo01;

public class Main {
	
	
	public static void main(String[] args ) {
		Bebida leite = new LeiteQuente();
		Preparador preparar = new Preparador();
		
		preparar.prepararBebida(leite);
		
		Refrigerante cola = new Refrigerante();
		
		preparar.prepararBebida(cola);
		
	}
}
