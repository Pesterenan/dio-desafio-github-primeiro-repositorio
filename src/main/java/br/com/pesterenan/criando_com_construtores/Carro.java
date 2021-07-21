package br.com.pesterenan.criando_com_construtores;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String variante;
	
	public Carro(String modelo, String marca, int ano) {
		this.modelo=modelo;
		this.marca=marca;
		this.ano=ano;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public String getModelo() {
		return modelo;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}
}
