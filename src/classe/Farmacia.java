package classe;

public class Farmacia {
	private String medicamento;
	private String laboratorio;
	private double valor;
	private boolean manipulado;
	private int quantidade;
	
	public Farmacia(String medicamento, String laboratorio, double valor, boolean manipulado, int quantidade) {
		super();
		this.medicamento = medicamento;
		this.laboratorio = laboratorio;
		this.valor = valor;
		this.manipulado = manipulado;
		this.quantidade = quantidade;
	}
	
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isManipulado() {
		return manipulado;
	}
	public void setManipulado(boolean manipulado) {
		this.manipulado = manipulado;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizarDadod() {
		System.out.println("Medicamento: " + getMedicamento());
		System.out.println("Laboratorio: " + getLaboratorio());
		System.out.println("Valor: R$" + getValor());
		System.out.println("Manipulado: " + isManipulado());
		System.out.println("Quantidade em estoque: " + getQuantidade());
		System.out.println("*****************************************************************************");
	
	}
	

}
