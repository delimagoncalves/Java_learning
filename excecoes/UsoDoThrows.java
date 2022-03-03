package excecoes;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/*
 * Para executar este exemplo deve-se criar uma pasta (temp)
 * na raiz do sistema de arquivos Windows ou Linux
 */

public class UsoDoThrows {

	public static void main(String[] args) throws IOException {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		
		
		try {
			
			
			FileWriter file = new FileWriter("/tmp/frases.txt", true);
			PrintWriter wr = new PrintWriter(file);
			
			wr.print(frase+"\n");
			file.close();
			wr.close();
			
			JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo");
			
		} catch (FileNotFoundException erro) {
			
			JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta /tmp existe!");
		}
	}
	
	

	
}
