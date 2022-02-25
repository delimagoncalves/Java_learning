import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {

		String mes = JOptionPane.showInputDialog(null, "Digite o número do mês desejado: ");
		String opcao = "";

		if (mes != null) {

			// Estrutrura (switch) como alternativa a (if-else) aninhado
			switch (mes) {
			case "1":
				opcao = "Janeiro";
				break;// Caso não seja utilizada a opção (break), os casos posteriores serãp
						// executados
			case "2":
				opcao = "Fevereiro";
				break;
			case "3":
				opcao = "Março";
				break;
			default:
				opcao = "Opção Inválida";
				break;

			}
			JOptionPane.showMessageDialog(null, "Mês selecionado: " + opcao);

		} else {
			JOptionPane.showMessageDialog(null, "Operaçã cancelada.");

		}

	}
}
