package sobrecargaDeMetodo;

public class Main {

	public static void main(String[] args) {
		// sobrecarga consiste na definicicao de metodos com o mesmo nome, porem com assinaturas e retorno diferente
		
		Sobrecarga x = new Sobrecarga();
		
		int soma1 = x.somar(10, 30);
		System.out.println(soma1);

		int soma2 = x.somar(10, 20, 30);
		System.out.println(soma2);
		
		double soma3 = x.somar(10.0, 20.0);
		System.out.println(soma3);

	}

}
