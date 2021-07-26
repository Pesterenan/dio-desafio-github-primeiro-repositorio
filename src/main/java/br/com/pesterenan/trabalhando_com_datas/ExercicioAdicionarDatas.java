package br.com.pesterenan.trabalhando_com_datas;

import java.time.LocalDateTime;
import java.time.Month;

public class ExercicioAdicionarDatas {
/*Esse exercício é da aula "Conhecendo o Date a partir do Java 8"
 * do módulo de Desenvolvimento Básico em Java do curso da
 * Digital Innovation One
 */
	public static void main(String[] args) {
		// Data anterior sendo dia 15 de maio de 2010
		LocalDateTime dataAnterior = LocalDateTime.of(2010,Month.MAY,15,10,00,00);
		System.out.printf("Essa é a data anterior: %s \n", dataAnterior);
		// Data futura, onde adicionamos 4 anos, 6 meses e 13 horas
		LocalDateTime dataFutura = dataAnterior.plusYears(4).plusMonths(6).plusHours(13);
		System.out.printf("Essa é a data depois de modificada: %s \n", dataFutura);
	}
}
