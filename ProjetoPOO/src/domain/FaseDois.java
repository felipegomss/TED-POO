package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseDois {
	static Random rd = new Random();

	static String erro = "Op��o indispon�vel";

	static Protagonista protagonista = new Protagonista("Gabriel", 100, 5, 2000);

	public static void faseDois() {

		JOptionPane.showMessageDialog(null,
				"Voc� j� treinou suficiente, quer avan�ar para proxima fase ou continuar treinando para aprimorar sua for�a?"
						+ "\nObs: caso continue treinando, voc� s� poder� treinar na academia e gastar� 400 moedas na academia, por�m aumentar� sua for�a e vida");

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Avan�ar para proxima fase \n2. Treinar na academia e aumentar sua for�a e vida",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:

			break;
		case 2:
			protagonista.setGold(protagonista.getGold() - 400);
			protagonista.setForca(protagonista.getForca() + 3);
			protagonista.setVida(protagonista.getVida() + 20);
			JOptionPane.showMessageDialog(null, "Sua for�a e vida agora s�o: \nFor�a:" + " " + protagonista.getForca()
					+ "\nVida: " + protagonista.getVida() + "\nE Agora voc� s� tem " + protagonista.getGold() + " Golds");


			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseDois();

		}

	}

}
