/*Exemplo de utilização da Classe Locale*/

package formatacaodenumeros;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ConfiguracoesRegionais {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat();
		
		Locale local = Locale.getDefault();
		
		double valor = 1370.30;
		
		if(local.getCountry().equals("BR")) 
		{
			df.applyPattern("R$ #,##0.00");
		}
		
		JOptionPane.showMessageDialog(null, "Configuração do Sistema Operacional: "
				+"\nSigla: "+local.getCountry()
				+"\nPais: "+local.getDisplayCountry()
				+"\nIdioma: "+local.getDisplayLanguage()
				+"\nTeclado: "+local.getDisplayName()
				+"\nValor: "+df.format(valor));
		
	}

}
