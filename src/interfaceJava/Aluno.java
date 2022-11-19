package interfaceJava;

import classeAbstrata.Pessoa;

public class Aluno extends Universitario{
	
	public Aluno(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public void acao(InterfacePessoa aluno) {
		aluno.alimentar();
		aluno.trabalhar();
		aluno.laser();
	}

}
