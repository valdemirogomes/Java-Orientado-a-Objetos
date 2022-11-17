package exemploPolimorfismo001;

public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando bebida " + bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.err.println("Aquecendo bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparda com sucesso ");
		
	}

}
