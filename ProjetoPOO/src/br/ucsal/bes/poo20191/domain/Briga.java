package br.ucsal.bes.poo20191.domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class Briga {

	static Random rd = new Random();

	public static void briga(Inimigos inimigo, Protagonista protagonista) {

		boolean continuar = true;
		Integer probabilidade;
		probabilidade = rd.nextInt((9) + 1);
		
		JOptionPane.showMessageDialog(null, "Estou sentindo uma TRETA!\n" + inimigo.getNome() + " � seu oponente. Prepare o couro!" , "Clique em 'Ok' para prosseguir",
				JOptionPane.PLAIN_MESSAGE);

		do {
			if (probabilidade < 4) {
				JOptionPane.showMessageDialog(null, "Voc� foi mais r�pido, isso ai!", "Clique em 'Ok' para prosseguir",
						JOptionPane.PLAIN_MESSAGE);
				probabilidade = rd.nextInt((9) + 1);

				if (probabilidade < 5) {
					inimigo.setVida(inimigo.getVida() - (protagonista.getForca() * 2));
					JOptionPane.showMessageDialog(null,
							"Voc� acertou com um soco em " + inimigo.getNome() + "."
									+ "\nA vida dele desceu para " + inimigo.getVida(),
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					continuar = testeDeVida(inimigo, protagonista);
				} else {
					JOptionPane.showMessageDialog(null,
							"Voc� foi afobado e errou o soc�o. Agora " + inimigo.getNome()
									+ "vai atacar!" + "\nV� mais tranquilo da pr�xima vez!",
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Voc� dormiu no ponto e agora vai tomar uma rebordada!",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				probabilidade = rd.nextInt((9) + 1);

				if (probabilidade < 5) {
					protagonista.setVida(protagonista.getVida() - (inimigo.getForca() * 2));
					JOptionPane.showMessageDialog(null,
							protagonista.getNome() + " n�o est� tranquilo e tomou um kil�o de " + inimigo.getNome()
									+ "." + "\nA vida de " + protagonista.getNome() + " desceu para "
									+ protagonista.getVida(),
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					continuar = testeDeVida(protagonista);

				} else {
					JOptionPane.showMessageDialog(null,
							inimigo.getNome() + " errou a bica e agora voc� ficou puto e vai descer o sarrafo!" + "\nAgora voc� vai matar!",
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
		} while (continuar);

	}

	public static boolean testeDeVida(Inimigos inimigo, Protagonista protagonista) {

		if (inimigo.getVida() <= 0) {
			JOptionPane.showMessageDialog(null,
					"Enquanto voc�s lutavam, " + inimigo.getNome() + " falou de seu pai."
							+ "\nEssa foi a ultima vez, ta na hora de dar o fatality. \nA vida dele chegou a 0. GG EZ!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					protagonista.setVida((((protagonista.getVida()+50)*80)/100));
			return false;
		} else if (inimigo.getVida() <= 20) {
			JOptionPane.showMessageDialog(null,
					inimigo.getNome() + " est� com " + inimigo.getVida() + " de vida, e j� est� bem arrega�ado."
							+ "\nEle cuspiu na sua cara depois de tomar um amassada no chupador."
							+ "\nAgora voc� vai ter que matar ele!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else if (inimigo.getVida() <= 50) {
			JOptionPane.showMessageDialog(null,
					"MAS O QUE � ISSO? MAS O QUE � ISSO?" + "\n " + inimigo.getNome() + " est� com " + inimigo.getVida()
							+ " de vida, e o mel ja come�ou a descer!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "\nAgora � a vez dele revidar!", "Clique em 'Ok' para prosseguir",
					JOptionPane.PLAIN_MESSAGE);
			return true;
		}
	}

	public static boolean testeDeVida(Protagonista protagonista) {

		if (protagonista.getVida() <= 0) {
			JOptionPane.showMessageDialog(null,
					"Voc� deveria ter ido pro Tibete virar monge. Sua vida chegou a 0.. esse � seu fim!"
							+ "\nAgora voc� vai saber se o no c�u tem p�o!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			GameOver.fimDeJogo();
			return false;
		} else if (protagonista.getVida() <= 20) {
			JOptionPane.showMessageDialog(null,
					"Voc� t� apanhando igual Neymar, e agora voc� est� com " + protagonista.getVida()
							+ "de vida. \nSe voc� n�o reagir, voc� vai tomar um atropelo!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;

		} else if (protagonista.getVida() <= 50) {
			JOptionPane.showMessageDialog(null,
					"Voc� est� com " + protagonista.getVida()
							+ "e seu oponente te chamou de gado. \\nT� na hora de pistolar e ir pra cima, vai deixar?",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Agora � a vez de voc� bater! Sem afoba��o! ",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		}

	}
}