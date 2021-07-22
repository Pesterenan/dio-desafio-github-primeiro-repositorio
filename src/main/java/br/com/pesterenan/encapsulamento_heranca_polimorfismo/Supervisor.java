package br.com.pesterenan.encapsulamento_heranca_polimorfismo;

public class Supervisor extends Funcionario {

	public double pagarImposto() {
		return this.getSalario() * 0.05;

	}
}
