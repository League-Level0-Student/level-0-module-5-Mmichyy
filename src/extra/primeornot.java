package extra;

import javax.swing.JOptionPane;

public class primeornot {

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("Pick a number");

		int numero = Integer.parseInt(number);

		for (int i = 2; i < 5; i++) {

			if (numero % 5 == 0) {
				
				System.out.println("No");

				JOptionPane.showMessageDialog(null, "Is your number prime?");
			}

		}

	}
}
