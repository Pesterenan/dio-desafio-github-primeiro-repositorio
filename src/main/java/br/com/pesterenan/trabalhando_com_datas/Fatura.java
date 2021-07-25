package br.com.pesterenan.trabalhando_com_datas;

import java.util.Calendar;
import java.util.Date;

public class Fatura {
	private double valorFatura;
	private Calendar dataVencimento;
	private int diasExtrasParaPagar = 10;

	public Fatura(Calendar vencimento, double valor) {
		this.dataVencimento = vencimento;
		this.setValor(valor);
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
		// clonar data de vencimento para não modificá-la
		Calendar dataVencimentoExtra = (Calendar) this.getDataVencimento().clone();
		// adicionar dias extras para pagar
		dataVencimentoExtra.add(Calendar.DATE, diasExtrasParaPagar);
		// checar se a nova data cai num sábado ou domingo e adicionar dias 
		// para cair na próxima segunda
		switch (dataVencimentoExtra.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SATURDAY:
			dataVencimentoExtra.add(Calendar.DATE, 2);
			break;
		case Calendar.SUNDAY:
			dataVencimentoExtra.add(Calendar.DATE, 1);
			break;
		}
		// verificar se a fatura já venceu:
		if (this.getDataVencimento().before(diaPagamento)) {
			System.out.printf("Sua fatura está vencida. Você tem até o dia \"%tc\" para pagar.\n\n", dataVencimentoExtra.getTime());
			System.out.printf("Você está pagando no dia:  %tc\n", diaPagamento.getTime());
			System.out.printf("Data vencimento original:  %tc\n", this.getDataVencimento().getTime());
			System.out.printf("Você pode pagar até o dia: %tc\n", dataVencimentoExtra.getTime());
		}
	}

	public String toString() {
		return String.format("Essa fatura vence no dia \"%tc\", e tem o valor de R$%.2f.",
				this.dataVencimento.getTime(), this.getValor());
	}

}
