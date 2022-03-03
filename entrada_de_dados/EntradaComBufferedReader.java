package entradadedados;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaComBufferedReader {

	public static void main(String[] args) {
	
		String s;
		float largura, comprimento, area, perimetro;
		BufferedReader dado;
		
		try {
			
			System.out.println("Entre com o comprimento: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();//deprecated
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();//deprecated
			largura = Float.parseFloat(s);
			
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
