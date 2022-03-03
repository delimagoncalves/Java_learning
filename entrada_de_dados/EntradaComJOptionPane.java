package entradadedados;
import javax.swing.JOptionPane;

public class EntradaComJOptionPane {

	public static void main(String[] args) {

		float comprimento, largura, area, perimetro;

		try {
			new JOptionPane();
			comprimento = Float.parseFloat(JOptionPane.showInputDialog("Entre com o comprimento: "));
			new JOptionPane();
			largura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a largura: "));

			area = comprimento * largura;
			perimetro = (comprimento * 2) + (largura * 2);
			
			JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerímetro: "+perimetro);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro ao executar a conversão, digite apenas núemros.\n"+"Detalhes do erro: "+erro.toString());
		}

	}

}
