package factorial;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		long num, factorial=1;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para calcular factorial"));

		for(int i=1; i<=num; i++) {
			
			factorial*=i;
		}
		
		System.out.println("El factorial del número "+num+" es: "+factorial);
		
	}

}
