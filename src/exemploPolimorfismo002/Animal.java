package exemploPolimorfismo002;

//Polimorfismo de sobreposicao
public abstract class Animal {
	protected String especie;
	protected float peso;
	protected int idade;
	protected int numMembros;

	public abstract void locomover();

	public abstract void alimentar();



	public Animal(String especie, float peso, int idade, int numMembros) {
		this.especie = especie;
		this.peso = peso;
		this.idade = idade;
		this.numMembros = numMembros;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumMembros() {
		return numMembros;
	}

	public void setNumMembros(int numMembros) {
		this.numMembros = numMembros;
	}

}
