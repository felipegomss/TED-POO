package domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Inimigos;
import domain.Protagonista;

public class FaseUm {

	static Protagonista protagonista = new Protagonista();

	static List<Inimigos> inimigos = new ArrayList<>();

	static String erro = "Op��o indispon�vel";

	public static void faseUm() {
		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Aprender a lutar e ir atr�s da sua vingan�a \n2. A vingan�a nunca � plena, mata a alma e a envena",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			faseUmDotUm();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Voc� se mudou para o Tibete para levar a vida como um monge",
					"Tashi Delek", JOptionPane.CLOSED_OPTION);
			int option2 = new Integer(JOptionPane.showInputDialog(null, "1. Tentar novamente? \n2.Sair",
					"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();
			switch (option2) {
			case 1:
				faseUm();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "END GAME", " ", JOptionPane.CLOSED_OPTION);

				break;
			default:
				JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
				faseUm();

			}

			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUm();

		}

	}

	private static void faseUmDotUm() {
		JOptionPane.showMessageDialog(null,
				"Voc� encontrou uma Academia de luta, a melhor da cidade e ela custa 250 moedas. \nVoc� tem um total de "
						+ protagonista.getGold() + " moedas",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		int option = new Integer(
				JOptionPane.showInputDialog(null, "1. Entrar na academia \n2. Treinar de gra�a com os manos da rua",
						"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			protagonista.setGold(750);
			protagonista.setForca(10);
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold()
					+ " de moedas, e sua for�a � " + protagonista.getForca());
			break;
		case 2:
			protagonista.setForca(5);
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold()
					+ " de moedas, e sua for�a � " + protagonista.getForca());
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUmDotUm();

		}
	}

}
