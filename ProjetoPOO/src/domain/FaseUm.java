package domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Inimigos;
import domain.Protagonista;

public class FaseUm {

	static Protagonista protagonista = new Protagonista();

	static List<Inimigos> inimigos = new ArrayList<>();

	static String erro = "Opção indisponível";

	public static void faseUm() {
		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Aprender a lutar e ir atrás da sua vingança \n2. A vingança nunca é plena, mata a alma e a envena",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			faseUmDotUm();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você se mudou para o Tibete para levar a vida como um monge",
					"Tashi Delek", JOptionPane.CLOSED_OPTION);
			int option2 = new Integer(JOptionPane.showInputDialog(null, "1. Tentar novamente? \n2.Sair",
					"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();
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
				"Você encontrou uma Academia de luta, a melhor da cidade e ela custa 250 moedas. \nVocê tem um total de "
						+ protagonista.getGold() + " moedas",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		int option = new Integer(
				JOptionPane.showInputDialog(null, "1. Entrar na academia \n2. Treinar de graça com os manos da rua",
						"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			protagonista.setGold(750);
			protagonista.setForca(10);
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold()
					+ " de moedas, e sua força é " + protagonista.getForca());
			break;
		case 2:
			protagonista.setForca(5);
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold()
					+ " de moedas, e sua força é " + protagonista.getForca());
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUmDotUm();

		}
	}

}
