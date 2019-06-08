package br.ucsal.bes.poo20191.domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseDois {
	static Random rd = new Random();

	static Integer probabilidade;

	static String erro = "Opção indisponível";

	public static void faseDois(Protagonista protagonista) {

		Inimigos inimigo = new Inimigos("Beicin", 60, 5);
		Inimigos inimigo2 = new Inimigos("Cocacoca", 100, 12);

		JOptionPane.showMessageDialog(null,
				"Agora que você ficou mais forte, você quer testar sua força "
						+ "\nou deseja continuar treinando para aprimorar sua força?"
						+ "\n\nObs: Caso continue treinando, você só poderá treinar na academia, "
						+ "\ngastará mais 400 moedas, porém aumentará mais sua força e resistência");

		int option = new Integer(JOptionPane.showInputDialog(null, "1. Testar a força. \n2. Treinar na academia.",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			Briga.briga(inimigo, protagonista);
			protagonista.setForca(protagonista.getForca() + 2);
			protagonista.setGold(protagonista.getGold() + 50);
			JOptionPane.showMessageDialog(null, "Enquanto caminhava, você encontrou o Beicin dando tapas no "
					+ "\nrosto de uma moça e decidiu intervir e aproveitou para testar sua força com ele."
					+ "\n\nDepois da briga, você se machucou um pouco mas sua autoestima aumentou junto com sua experiência"
					+ "\n\nJunto com sua auto-estima, sua força subiu para:" + protagonista.getForca()
					+ "\nMas com a briga, sua saúde ficou  em: " + protagonista.getVida()
					+ "\nE como você encontrou umas moedas com Beicin, você agora tem " + protagonista.getGold()
					+ " moedas.", "Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			FaseTres.faseTres(protagonista);
			break;
		case 2:
			protagonista.setGold(protagonista.getGold() - 400);
			protagonista.setForca(protagonista.getForca() + 5);
			protagonista.setVida(protagonista.getVida() + 20);
			JOptionPane.showMessageDialog(null,
					"O treinamento foi mais intensivo e você agora é quase um lutador profissional."
							+ "\nSua força aumentou incrívelmente para:" + protagonista.getForca()
							+ "\nComo o treino foi mais voltado para resistência, agora sua saúde foi para: "
							+ protagonista.getVida() + "\nMas como teve que pagar pelo treino, você só tem "
							+ protagonista.getGold() + " moedas",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			probabilidade = rd.nextInt(9 + 1);
			if (probabilidade <= 5) {
				JOptionPane.showMessageDialog(null,
						"Durante o tempo que você passou treinando, você começou a despertar atenção de outros lutadores"
								+ "\nO lutador Cocacoca te encontrou e te desafiou para uma luta.",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				Briga.briga(inimigo2, protagonista);
			} else {
				JOptionPane.showMessageDialog(null,
						"Durante o tempo que você passou treinando, você começou a despertar atenção de outros lutadores. "
								+ "Como seu foco é o assassino do seu pai, você não deu importâcia a isso e seguiu sua vida",
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
