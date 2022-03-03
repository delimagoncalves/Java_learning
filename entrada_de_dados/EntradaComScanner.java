package entradadedados;
import java.io.*;
import java.util.*;

public class EntradaComScanner {

	public static void main(String[] args) {
	
		float largura, comprimento, area, perimetro;
		Scanner dado;
		
		try {
			
			System.out.println("Entre com o comprimento: ");
			dado = new Scanner(System.in);
			comprimento = dado.nextFloat();
			
			System.out.println("Entre com a largura: ");
			dado = new Scanner(System.in);
			largura = dado.nextFloat();
			
			area = comprimento * largura;
			perimetro = (comprimento*2)+(largura*2);
			
			System.out.println("Àrea do retângulo: "+area);
			System.out.println("Peŕimetro do retângulo: "+perimetro);
			
		}catch(Exception ex)
		{
			System.out.println("Houve um erro: "+ex.toString());
		}

	}

}
