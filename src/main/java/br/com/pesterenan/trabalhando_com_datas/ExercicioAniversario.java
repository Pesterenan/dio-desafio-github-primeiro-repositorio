package br.com.pesterenan.trabalhando_com_datas;

import java.util.Date;

public class ExercicioAniversario {
	/* Exercício da Aula "Classe Date" do módulo "Trabalhando com Datas" 
	 * do curso de Java da DigitalInnovation One
	 */

	public static void main(String[] args) {
		// Minha data de aniversário em Millis:
		long aniversarioEmMillis = 595159400000L;
		// Data convertida para objeto Date:
		Date meuAniversario = new Date(aniversarioEmMillis);
		// Data para comparação 15/05/2010 em millis
		long dataComparacaoEmMillis = 1273892400000L;
		Date dataComparacao = new Date(dataComparacaoEmMillis);
		System.out.println("Dia do meu aniversário: " + meuAniversario.toInstant().toString());
		System.out.println("Data para comparar:     " + dataComparacao.toInstant().toString());
		System.out.println();
		System.out.println("Meu aniversário é POSTERIOR ou ANTERIOR à esta data? \n");
		System.out.println((meuAniversario.before(dataComparacao) ? "ANTERIOR" : "POSTERIOR"));

	}

}
