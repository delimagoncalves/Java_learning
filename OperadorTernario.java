import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int a,b;
		String r;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B: "));
		
		//Utilizando operador ternário como alternativa a declaração (if-else)
		r = (a > b ? "A é maior que B" : "B é mair que A" );
		JOptionPane.showMessageDialog(null, r);
	}

}
