package br.com.pesterenan.encapsulamento_heranca_polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setSalario(20000);
		System.out.println("Salário do Gerente: " + gerente.getSalario());
		System.out.println("Imposto do Gerente: " + gerente.pagarImposto());
		Funcionario supervisor = new Supervisor();
		supervisor.setSalario(12000);
		System.out.println("Salário do Gerente: " + supervisor.getSalario());
		System.out.println("Imposto do Gerente: " + supervisor.pagarImposto());
		Funcionario atendente = new Atendente();
		atendente.setSalario(2000);
		System.out.println("Salário do Gerente: " + atendente.getSalario());
		System.out.println("Imposto do Gerente: " + atendente.pagarImposto());
	}

}
