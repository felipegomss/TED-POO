package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class FaseDois {
	static Random rd = new Random();

	static String erro = "Op��o indispon�vel";

	static Protagonista protagonista = new Protagonista();

	static List<Inimigos> inimigos = new ArrayList<>();

	public static void faseDois() {

		JOptionPane.showMessageDialog(null,
				"Voc� j� treinou suficiente, quer avan�ar para proxima fase ou continuar treinando para aprimorar sua for�a?"
						+ "obs: caso continue treinando, voc� s� poder� treinar na academia e gastar� 400 moedas na academia, por�m aumentar� sua for�a e vida");

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
					+ "\nVida: " + protagonista.getVida() + "\n E Agora voc� s� tem " + protagonista.getGold() + " Golds");

			Integer probabilidade = rd.nextInt((9) + 1);

			if (probabilidade < 3) {

				JOptionPane.showMessageDialog(null,
						"Enquanto voc� treinava, voc� foi desafiado por um inimigo e teve que aceitar");
				//TODO criar classe brigou depois
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseDois();

		}

	}

}
