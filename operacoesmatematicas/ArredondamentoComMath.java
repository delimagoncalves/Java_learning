/*
 * Exemplo de utilização do método ceil() e floor() da Classe Math
 * */

package operacoesmatematicas;

import javax.swing.JOptionPane;

public class ArredondamentoComMath {

	public static void main(String[] args) {
			double novaNota;
		
		try {
			String valorDeEntrada = JOptionPane.showInputDialog("Digite uma nota entre 5 e 6: ");
			float nota = Float.parseFloat(valorDeEntrada);
			
			if(nota > 5.4) 
			{
				novaNota = Math.ceil(nota);
			}else 
			{
				novaNota = Math.floor(nota);
			}
			
			JOptionPane.showMessageDialog(null, "Nota atual: "+nota+"\nNota final: "+novaNota);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Tipo não suportado, entre apenas com números.");
		}

	}

}
