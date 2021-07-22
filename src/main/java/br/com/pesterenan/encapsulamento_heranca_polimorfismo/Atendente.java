package br.com.pesterenan.encapsulamento_heranca_polimorfismo;

public class Atendente extends Funcionario {

	public double pagarImposto() {
		return this.getSalario() * 0.01;

	}
}
