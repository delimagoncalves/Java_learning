package stringmetodos;

import java.util.Scanner;

public class MetodoUpperELower {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		System.out.println("Palavra digitada: "+palavra);
		
		//Utilizando método upperCase da da classe String
		System.out.println("Palavra em maiúscula: "+palavra.toUpperCase());
		
		//Utilizando método upperCase da da classe String
		System.out.println("Palavra em minúscula: "+palavra.toLowerCase());
	
	}

}
