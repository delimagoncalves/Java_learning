package sintaxegeral;
import javax.swing.JOptionPane;

public class IfComJOptionPane {

	public static void main(String[] args) {
	
		
		Object[] sexo = {"Masculino","Feminino"};
		
		String resposta = (String) JOptionPane.showInputDialog(null,"Selecione o sexo:\n","Pesquisa",JOptionPane.PLAIN_MESSAGE,
				null, sexo, "Masculino");
		
		//Utilização da if para verificar a resposta do usuário
		if (resposta == null) 
		{
			JOptionPane.showMessageDialog(null, "Você pressionou Cancelar.");
		}
		if(resposta.equals("Masculino")) 
		{
			JOptionPane.showMessageDialog(null, "Você é homem.");
		}
		if(resposta.equals("Feminino")) 
		{
			JOptionPane.showMessageDialog(null, "Você é Mulher");
		}
	}

}
