package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseDois {
	static Random rd = new Random();

	static String erro = "Opção indisponível";

	static Protagonista protagonista = new Protagonista("Gabriel", 100, 5, 2000);

	public static void faseDois() {

		JOptionPane.showMessageDialog(null,
				"Você já treinou suficiente, quer avançar para proxima fase ou continuar treinando para aprimorar sua força?"
						+ "\nObs: caso continue treinando, você só poderá treinar na academia e gastará 400 moedas na academia, porém aumentará sua força e vida");

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Avançar para proxima fase \n2. Treinar na academia e aumentar sua força e vida",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:

			break;
		case 2:
			protagonista.setGold(protagonista.getGold() - 400);
			protagonista.setForca(protagonista.getForca() + 3);
			protagonista.setVida(protagonista.getVida() + 20);
			JOptionPane.showMessageDialog(null, "Sua força e vida agora são: \nForça:" + " " + protagonista.getForca()
					+ "\nVida: " + protagonista.getVida() + "\nE Agora você só tem " + protagonista.getGold() + " Golds");


			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseDois();

		}

	}

}
