package operacoesmatematicas;

import javax.swing.JOptionPane;

public class MetodoRandom {

	public static void main(String[] args) {
		
		String senha = "";
		
		for(int i = 0; i<=10; i++) 
		{	//Utilização do método random() da classe Math
			int num = (int)(Math.random()*10);
			senha+=num;
		}
		
		JOptionPane.showMessageDialog(null, "Senha gerada: "+senha);
		
		for(int cartao = 1 ; cartao <=4; cartao++ ) 
		{
			String ncartao = "";
			for(int numeroCartao = 1; numeroCartao <=8; numeroCartao++) 
			{
				int num = (int)(Math.random()*100);
				ncartao+=num+" ";
			}
			JOptionPane.showMessageDialog(null, "Número do cartão("+cartao+"): "+ncartao+"\n");
		}
		

	}

}
