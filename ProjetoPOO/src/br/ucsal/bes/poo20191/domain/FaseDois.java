package br.ucsal.bes.poo20191.domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseDois {
	static Random rd = new Random();

	static Integer probabilidade;

	static String erro = "Op��o indispon�vel";

	public static void faseDois(Protagonista protagonista) {

		Inimigos inimigo = new Inimigos("Beicin", 60, 5);
		Inimigos inimigo2 = new Inimigos("Cocacoca", 100, 12);

		JOptionPane.showMessageDialog(null,
				"Agora que voc� ficou mais forte, voc� quer testar sua for�a "
						+ "\nou deseja continuar treinando para aprimorar sua for�a?"
						+ "\n\nObs: Caso continue treinando, voc� s� poder� treinar na academia, "
						+ "\ngastar� mais 400 moedas, por�m aumentar� mais sua for�a e resist�ncia");

		int option = new Integer(JOptionPane.showInputDialog(null, "1. Testar a for�a. \n2. Treinar na academia.",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			Briga.briga(inimigo, protagonista);
			protagonista.setForca(protagonista.getForca() + 2);
			protagonista.setGold(protagonista.getGold() + 50);
			JOptionPane.showMessageDialog(null, "Enquanto caminhava, voc� encontrou o Beicin dando tapas no "
					+ "\nrosto de uma mo�a e decidiu intervir e aproveitou para testar sua for�a com ele."
					+ "\n\nDepois da briga, voc� se machucou um pouco mas sua autoestima aumentou junto com sua experi�ncia"
					+ "\n\nJunto com sua auto-estima, sua for�a subiu para:" + protagonista.getForca()
					+ "\nMas com a briga, sua sa�de ficou  em: " + protagonista.getVida()
					+ "\nE como voc� encontrou umas moedas com Beicin, voc� agora tem " + protagonista.getGold()
					+ " moedas.", "Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			FaseTres.faseTres(protagonista);
			break;
		case 2:
			protagonista.setGold(protagonista.getGold() - 400);
			protagonista.setForca(protagonista.getForca() + 5);
			protagonista.setVida(protagonista.getVida() + 20);
			JOptionPane.showMessageDialog(null,
					"O treinamento foi mais intensivo e voc� agora � quase um lutador profissional."
							+ "\nSua for�a aumentou incr�velmente para:" + protagonista.getForca()
							+ "\nComo o treino foi mais voltado para resist�ncia, agora sua sa�de foi para: "
							+ protagonista.getVida() + "\nMas como teve que pagar pelo treino, voc� s� tem "
							+ protagonista.getGold() + " moedas",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			probabilidade = rd.nextInt(9 + 1);
			if (probabilidade <= 5) {
				JOptionPane.showMessageDialog(null,
						"Durante o tempo que voc� passou treinando, voc� come�ou a despertar aten��o de outros lutadores"
								+ "\nO lutador Cocacoca te encontrou e te desafiou para uma luta.",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				Briga.briga(inimigo2, protagonista);
			} else {
				JOptionPane.showMessageDialog(null,
						"Durante o tempo que voc� passou treinando, voc� come�ou a despertar aten��o de outros lutadores. "
								+ "Como seu foco � o assassino do seu pai, voc� n�o deu import�cia a isso e seguiu sua vida",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			}

			FaseTres.faseTres(protagonista);
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseDois(protagonista);

		}

	}

}
