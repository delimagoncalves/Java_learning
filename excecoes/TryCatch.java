package excecoes;
import java.awt.font.NumericShaper;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public static void main(String[] args) {
		
		try {
			
			String aux1 = JOptionPane.showInputDialog("Forneça o primeiro número: ");
			int n1 = Integer.parseInt(aux1);
			
			String aux2 = JOptionPane.showInputDialog("Forneça o segundo número: ");
			int n2 = Integer.parseInt(aux2);
			
			JOptionPane.showMessageDialog(null, "Soma = "+(n1+n2));
			JOptionPane.showMessageDialog(null, "Subtração = "+(n1-n2));
			JOptionPane.showMessageDialog(null, "Multiplicação = "+(n1*n2));
			JOptionPane.showMessageDialog(null, "Divisão = "+(n1/n2));
			
			
		} catch (ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Erro de divisão por zero:\n"+erro.toString(),
					"Erro",JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro de conversão:\n"+erro.toString(),
					"Erro",JOptionPane.ERROR_MESSAGE);
		}catch (NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário:\n"+erro.toString(),
					"Erro",JOptionPane.ERROR_MESSAGE);
		}
	}

}
