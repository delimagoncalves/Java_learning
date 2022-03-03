package sintaxegeral;
import javax.swing.JOptionPane;

public class IfElseComJOptionPane {

	public static void main(String[] args) {
	
		String opcao = JOptionPane.showInputDialog(null,"Forneça o número do mês: ");
		
		if (opcao != null) 
		{
			try {
				
				int resposta = Integer.parseInt(opcao);
				
				if(resposta >=1 && resposta <=12)
				{
					JOptionPane.showMessageDialog(null, "Número do mês é válido: "+resposta);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Número do mẽs é inválido: "+resposta);
				}
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Erro: "+e.toString());
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Operação Cancelada.");
		}
		
	}

}
