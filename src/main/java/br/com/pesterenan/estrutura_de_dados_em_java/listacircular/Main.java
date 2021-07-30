package br.com.pesterenan.estrutura_de_dados_em_java.listacircular;

public class Main {

	public static void main(String[] args) {
		ListaCircular<String> minhaListaCircular = new ListaCircular<String>();
		minhaListaCircular.add("c0");
		System.out.println(minhaListaCircular);
		minhaListaCircular.add("c1");
		System.out.println(minhaListaCircular);
		for (int i = 0 ; i < 30; i++) {
			System.out.println(minhaListaCircular.get(i));
		}
	}

}
