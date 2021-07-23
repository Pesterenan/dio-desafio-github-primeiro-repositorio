package br.com.pesterenan.trabalhando_com_datas;

import java.util.Calendar;

public class ExercicioClienteFatura {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura(Calendar.getInstance(), 2000);
		fatura.pagarFatura(Calendar.getInstance());
	}

}
