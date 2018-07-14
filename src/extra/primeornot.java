package extra;

import javax.swing.JOptionPane;

public class primeornot {

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("Pick a number");

		int numero = Integer.parseInt(number);

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
							
			JOptionPane.showMessageDialog(null, "It is not a prime number!");
				
				System.exit(0);
			}
		}
				JOptionPane.showMessageDialog(null, "Your number is prime!");
				
				
			}
			
		}
		
	








