package sintaxegeral;
import java.util.Iterator;

/*
 * Exemplo de laço aninhado com break label
 */

public class LacoForAninhado {

	public static void main(String[] args) {

		horas: for (int horas = 0; horas < 24; horas++) {
			minutos: for (int minutos = 0; minutos < 60; minutos++) {
				segundos: for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas+"h: "+minutos+"min: "+"seg: "+segundos);
					try {
							Thread.sleep(1000);
							if(segundos == 10) 
							{
								break horas;
							}
					} catch (Exception e) {
						e.toString();
					}
				}
			}
		}
	}

}
