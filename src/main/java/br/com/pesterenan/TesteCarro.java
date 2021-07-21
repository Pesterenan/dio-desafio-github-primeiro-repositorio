package br.com.pesterenan;

public class TesteCarro {

	public static void main(String[] args) {
		//Criar uma instancia da classe carro com 5 lugares
		Carro carro = new Carro(5);
		//Exemplo de override do método "to.String()"
		System.out.println(carro.toString());
		//Tentar 3 pessoas no carro
		System.out.println(carro.adicionarPessoasNoCarro(3));
		//Tentar 3 pessoas no carro
		System.out.println(carro.adicionarPessoasNoCarro(3));
		//Verificar lugares vagos
		System.out.println(carro.lugaresVagosNoCarro());
		System.out.println(carro.adicionarPessoasNoCarro(2));
		System.out.println(carro.lugaresVagosNoCarro());
		//Remover pessoas do carro
		System.out.println(carro.removerPessoasDoCarro(3));
		System.out.println(carro.removerPessoasDoCarro(5));
		System.out.println(carro.pessoasNoCarro());
		System.out.println(carro.removerPessoasDoCarro(2));
		System.out.println(carro.lugaresVagosNoCarro());
		System.out.println(carro.pessoasNoCarro());
	}

}
