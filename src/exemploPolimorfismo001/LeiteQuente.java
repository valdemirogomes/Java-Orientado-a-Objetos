package exemploPolimorfismo001;

public class LeiteQuente extends Bebida{
	public LeiteQuente() {
		super("Leite morno", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo ");
		System.out.println("Colocando leite no copo ");
		
	}
	
	

}
