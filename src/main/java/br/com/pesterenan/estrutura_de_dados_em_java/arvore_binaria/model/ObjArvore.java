package br.com.pesterenan.estrutura_de_dados_em_java.arvore_binaria.model;

public abstract class ObjArvore<T> implements Comparable<T> {

	public abstract boolean equals(Object o);
	public abstract int hashCode();
	public abstract String toString();
	
	public ObjArvore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(T outro) {
		return 0;
	}

}
