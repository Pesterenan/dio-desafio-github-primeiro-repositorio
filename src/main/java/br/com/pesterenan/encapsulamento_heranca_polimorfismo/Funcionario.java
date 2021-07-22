package br.com.pesterenan.encapsulamento_heranca_polimorfismo;

public class Funcionario {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double pagarImposto() {
		return this.salario;
	}
}
