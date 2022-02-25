import javax.swing.JOptionPane;

/*
 * 
 * Exemplo de utilização do Throws para lançar uma Excpetion
 */
public class LancandoExcecao {

	public static void main(String[] args) {

		try {

			int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneça sua idade: "));
			if(idade<18) 
			{
				throw new Exception("Menor de idade, entrada não permitida!");
			}else {
				JOptionPane.showMessageDialog(null,"Entrada liberada.");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}

	}

}
