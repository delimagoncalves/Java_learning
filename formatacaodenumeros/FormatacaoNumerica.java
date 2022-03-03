/*
 * Exemplo de utilização da Classe DecimalFormat
 */

package formatacaodenumeros;

import java.text.DecimalFormat;

public class FormatacaoNumerica {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		short idade = 38;
		df.applyPattern("000");
		System.out.println(df.format(idade));
		
		int quantidade = 9760;
		df.applyPattern("#0,000");
		System.out.println(df.format(quantidade));
		
		long estoque = 198564;
		df.applyPattern("#,##0,000");
		System.out.println(df.format(estoque));
		
		float altura = 1.74f;
		df.applyPattern("#0.00");
		System.out.println(df.format(altura));
		

		double peso = 70.25;
		df.applyPattern("#0.00");
		System.out.println(df.format(peso));
		
		String valorReais = "2583.75";
		df.applyPattern("R$ #,##0.00");
		System.out.println(df.format(Double.parseDouble(valorReais)));
	}

}
