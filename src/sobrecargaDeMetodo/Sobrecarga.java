package sobrecargaDeMetodo;

public class Sobrecarga {
	
	int somar (int x, int y) {
		System.out.println("somar (int x, int y)");
		return x+y;
	}
	
	int somar(int x, int y, int z) {
		System.out.println("somar (int x, int y, int z)");
		return x+y+z;
		
	}
	
	double somar(double x, double y) {
		System.out.println("somar(double x, double y)");
		return x+y;
		
	}

}
