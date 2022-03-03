package stringmetodos;

public class BuscaETroca {

	public static void main(String[] args) {
		
		
		String frase = "- Frase com espaços -";
		
		System.out.println("Frase original: "+frase);
		
		//Removendo espaços no início e final com método trim()
		System.out.println("Frase sem espaços: "+frase.replace(' ', '-'));
		
		
		
	}
}
