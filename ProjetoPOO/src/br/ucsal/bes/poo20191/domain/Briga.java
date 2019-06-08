package br.ucsal.bes.poo20191.domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class Briga {

	static Random rd = new Random();

	public static void briga(Inimigos inimigo, Protagonista protagonista) {

		boolean continuar = true;
		Integer probabilidade;
		probabilidade = rd.nextInt((9) + 1);
		
		JOptionPane.showMessageDialog(null, "Estou sentindo uma TRETA!\n" + inimigo.getNome() + " é seu oponente. Prepare o couro!" , "Clique em 'Ok' para prosseguir",
				JOptionPane.PLAIN_MESSAGE);

		do {
			if (probabilidade < 4) {
				JOptionPane.showMessageDialog(null, "Você foi mais rápido, isso ai!", "Clique em 'Ok' para prosseguir",
						JOptionPane.PLAIN_MESSAGE);
				probabilidade = rd.nextInt((9) + 1);

				if (probabilidade < 5) {
					inimigo.setVida(inimigo.getVida() - (protagonista.getForca() * 2));
					JOptionPane.showMessageDialog(null,
							"Você acertou com um soco em " + inimigo.getNome() + "."
									+ "\nA vida dele desceu para " + inimigo.getVida(),
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					continuar = testeDeVida(inimigo, protagonista);
				} else {
					JOptionPane.showMessageDialog(null,
							"Você foi afobado e errou o socão. Agora " + inimigo.getNome()
									+ "vai atacar!" + "\nVá mais tranquilo da próxima vez!",
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Você dormiu no ponto e agora vai tomar uma rebordada!",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				probabilidade = rd.nextInt((9) + 1);

				if (probabilidade < 5) {
					protagonista.setVida(protagonista.getVida() - (inimigo.getForca() * 2));
					JOptionPane.showMessageDialog(null,
							protagonista.getNome() + " não está tranquilo e tomou um kilão de " + inimigo.getNome()
									+ "." + "\nA vida de " + protagonista.getNome() + " desceu para "
									+ protagonista.getVida(),
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					continuar = testeDeVida(protagonista);

				} else {
					JOptionPane.showMessageDialog(null,
							inimigo.getNome() + " errou a bica e agora você ficou puto e vai descer o sarrafo!" + "\nAgora você vai matar!",
							"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
		} while (continuar);

	}

	public static boolean testeDeVida(Inimigos inimigo, Protagonista protagonista) {

		if (inimigo.getVida() <= 0) {
			JOptionPane.showMessageDialog(null,
					"Enquanto vocês lutavam, " + inimigo.getNome() + " falou de seu pai."
							+ "\nEssa foi a ultima vez, ta na hora de dar o fatality. \nA vida dele chegou a 0. GG EZ!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
					protagonista.setVida((((protagonista.getVida()+50)*80)/100));
			return false;
		} else if (inimigo.getVida() <= 20) {
			JOptionPane.showMessageDialog(null,
					inimigo.getNome() + " está com " + inimigo.getVida() + " de vida, e já está bem arregaçado."
							+ "\nEle cuspiu na sua cara depois de tomar um amassada no chupador."
							+ "\nAgora você vai ter que matar ele!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else if (inimigo.getVida() <= 50) {
			JOptionPane.showMessageDialog(null,
					"MAS O QUE É ISSO? MAS O QUE É ISSO?" + "\n " + inimigo.getNome() + " está com " + inimigo.getVida()
							+ " de vida, e o mel ja começou a descer!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "\nAgora é a vez dele revidar!", "Clique em 'Ok' para prosseguir",
					JOptionPane.PLAIN_MESSAGE);
			return true;
		}
	}

	public static boolean testeDeVida(Protagonista protagonista) {

		if (protagonista.getVida() <= 0) {
			JOptionPane.showMessageDialog(null,
					"Você deveria ter ido pro Tibete virar monge. Sua vida chegou a 0.. esse é seu fim!"
							+ "\nAgora você vai saber se o no céu tem pão!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			GameOver.fimDeJogo();
			return false;
		} else if (protagonista.getVida() <= 20) {
			JOptionPane.showMessageDialog(null,
					"Você tá apanhando igual Neymar, e agora você está com " + protagonista.getVida()
							+ "de vida. \nSe você não reagir, você vai tomar um atropelo!",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;

		} else if (protagonista.getVida() <= 50) {
			JOptionPane.showMessageDialog(null,
					"Você está com " + protagonista.getVida()
							+ "e seu oponente te chamou de gado. \\nTá na hora de pistolar e ir pra cima, vai deixar?",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Agora é a vez de você bater! Sem afobação! ",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			return true;
		}

	}
}