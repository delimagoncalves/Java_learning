import java.io.DataInputStream;

public class EntradaComDataInputStream {

	public static void main(String[] args) {
	
		String s;
		float largura, comprimento, area, perimetro;
		DataInputStream dado;
		
		try {
			
			System.out.println("Entre com o comprimento: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();//deprecated
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura: ");
			dado = new DataInputStream(System.in);
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
