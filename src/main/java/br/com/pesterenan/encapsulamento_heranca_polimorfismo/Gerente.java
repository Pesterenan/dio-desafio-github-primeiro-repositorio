package br.com.pesterenan.encapsulamento_heranca_polimorfismo;

public class Gerente extends Funcionario {

	public double pagarImposto() {
		return this.getSalario() * 0.1;

	}
}
