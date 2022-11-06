package exemploPolimorfismo;

public class LeiteQuente extends Bebida{
	public LeiteQuente() {
		super("Leite morno", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando copor ");
		System.out.println("Colocando leite no copo ");
		
	}
	
	

}
