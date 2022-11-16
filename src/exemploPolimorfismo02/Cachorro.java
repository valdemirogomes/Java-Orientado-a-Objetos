package exemploPolimorfismo02;

public class Cachorro extends Mamifero {

	String tipo;

		public Cachorro(String especie, float peso, int idade, int numMembros, String tipo) {
		super(especie, peso, idade, numMembros);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	
		
		@Override
		public String toString() {
			return "Animal [especie=" + especie + ", peso=" + peso + ", idade=" + idade + ", numMembros=" + numMembros
					+ ", tipo=" + tipo +  "]";
		}


	@Override
	public void alimentar() {
		System.out.println("Ração");
		
	}

}
