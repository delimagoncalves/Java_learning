package sintaxegeral;
/*
 * Exemplo de laço-while e do-while
 * 
 * */
import javax.swing.JOptionPane;

public class ContadorWhile {

	public static void main(String[] args) {

		try {

			int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));

			int contador = limite;

			while (contador >= 0) {
				System.out.println(contador);
				contador--;
			}

			System.out.println("Fim do contador regressivo\n");
			contador = 0;

			do {
				System.out.println(contador);
				contador++;
			}while(contador <= limite);
			
		} catch (NumberFormatException erro) {
			System.out.println("Não foi possível realizar a conversão de um tipo não inteiro:\n"+
					erro.toString());
		}

	}

}
