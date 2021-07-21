package br.com.pesterenan.paradigma_orientacao_objetos;

/*
 * Exercício do curso "Desenvolvimento básico em Java
 * da aula "Orientação a Objetos com Java"
 * do curso da Digital Innovation One 
 */

public class Carro {

	private int pessoasDentroDoCarro, lugares;

	public Carro(int Lugares) {
		setLugares(Lugares);
	}

	public int getPessoasDentroDoCarro() {
		return pessoasDentroDoCarro;
	}
	
	public void setPessoasDentroDoCarro(int pessoas) {
		this.pessoasDentroDoCarro = pessoas;
	}

	public String adicionarPessoasNoCarro(int pessoas) {
		if (pessoas <= (getLugares() - getPessoasDentroDoCarro())){
			setPessoasDentroDoCarro(getPessoasDentroDoCarro() + pessoas);
			return String.format("%s pessoas entraram no carro.", pessoas);
		} else {
			return "Esse número de pessoas não cabe no carro.";
		}
	}
	public String removerPessoasDoCarro(int pessoas) {
		if (getPessoasDentroDoCarro() == 0) {
			return "Não tem mais ninguém no carro.";
		}
		if (pessoas <= getPessoasDentroDoCarro()){
			setPessoasDentroDoCarro(getPessoasDentroDoCarro() - pessoas);
			return String.format("%s pessoas saíram do carro.", pessoas);
		} else {
			return "Não há como esse número de pessoas sair do carro.";
		}
	}
	public String pessoasNoCarro() {
		return String.format("Há %s pessoas dentro do carro.", getPessoasDentroDoCarro());
	}
	public String lugaresVagosNoCarro() {
		return String.format("Há %s lugares vagos no carro.", (getLugares() - getPessoasDentroDoCarro()));
	}
	public int getLugares() {
		return this.lugares;
	}

	public void setLugares(int lugares) {
		if (lugares > 0) {
			this.lugares = lugares;
		}
	}

	@Override
	public String toString() {
		return String.format("Este carro tem %s lugares e %s deles estão ocupados.", lugares,getPessoasDentroDoCarro());
	}

}
