package br.com.pesterenan.trabalhando_com_datas;

import java.util.Calendar;

public class ExercicioClienteFatura {

	public static void main(String[] args) {
		Calendar dataVencimento = Calendar.getInstance();
		// subtrair quatro dias na data de vencimento
		dataVencimento.add(Calendar.DATE, -4);
		// gerar fatura com a data de vencimento futura
		Fatura fatura = new Fatura(dataVencimento, 2000);
		System.out.println(fatura);
		// pagar a fatura na data de hoje
		fatura.pagarFatura(Calendar.getInstance());
	}

}
