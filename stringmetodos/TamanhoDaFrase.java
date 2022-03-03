package stringmetodos;

import javax.swing.JOptionPane;

public class TamanhoDaFrase {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog(null, "Forneça uma frase: ");
		
		int tamanho = frase.length();//Método length da classe String, retorna o tamanho da mesma
		
		JOptionPane.showMessageDialog(null, "Frase: "+frase
				+"\nQuantidade de caracteres: "+tamanho);
		
	}
}
