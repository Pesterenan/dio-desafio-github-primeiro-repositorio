package br.com.pesterenan.trabalhando_com_datas;

import java.util.Calendar;
import java.util.Date;

public class Fatura {
	private double valorFatura;
	private Calendar dataVencimento;
	private int diasParaPagar = 10;
	
	
	public Fatura(Calendar vencimento, double valor) {
		this.dataVencimento = vencimento;
	}

	public Calendar getDataVencimento() {
		return this.dataVencimento;
	}

	public double getValor() {
		return this.valorFatura;
	}

	public void setValor(double valor) {
		this.valorFatura = valor;
	}
	
	public void pagarFatura(Calendar diaPagamento) {
		Calendar dataVencimentoExtra = Calendar.getInstance();
		dataVencimentoExtra = dataVencimento;
		dataVencimentoExtra.add(Calendar.DAY_OF_MONTH, diasParaPagar);
		if (diaPagamento.before(dataVencimentoExtra)){
			System.out.println(diaPagamento.getTime().toString());
			System.out.println(dataVencimentoExtra.getTime().toString());
		}
	}
}
