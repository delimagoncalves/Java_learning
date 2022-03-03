package stringmetodos;

import javax.swing.JOptionPane;

public class CaracteresDaPalavra {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra com minimo de 4 letras: ");
		
		System.out.println("Palavra: "+palavra);
		//Método charAt() devolve o caracter especificado no indice()
		System.out.println("Caracter 1: "+palavra.charAt(0));
		System.out.println("Caracter 2: "+palavra.charAt(1));
		System.out.println("Caracter 3: "+palavra.charAt(2));
		System.out.println("Caracter 4: "+palavra.charAt(3));

	}

}
