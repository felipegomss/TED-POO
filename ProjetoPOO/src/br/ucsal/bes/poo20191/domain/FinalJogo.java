package br.ucsal.bes.poo20191.domain;

import javax.swing.JOptionPane;

public class FinalJogo {

	static String erro = "Op��o indispon�vel";

	public static void faseFinal(Protagonista protagonista) {
		JOptionPane.showMessageDialog(null,
				"Voc� foi de encontro com o homem que matou o seu pai. \nE se deparou que ele agora tamb�m tinha uma fam�lia e estava tentando seguir as leis.\nMas voc� foi confrontar ele mesmo assim.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Voc� chega na porta da casa dele, bate na porta e ele vem te atender\nEle n�o te reconheceu e quis arrumar briga com voc�, pois voc� estava pertubando a 'paz' dele ",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		int option = new Integer(JOptionPane.showInputDialog(null,
				"O que voc� ir� fazer? \n1. Ir atr�s de uma arma com algum contrabandista que voc� conheceu lutando clandestinamente, voltar e matar ele."
						+ "\n2. Sair de l� e v� que realmente voc� estava errado em prosseguir com isso tudo"
						+ "\n3. VEM TRANQUILO, N�O AFOBA N�O",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:

			int option2 = new Integer(JOptionPane.showInputDialog(null,
					"Voc� achou um contrabandista, ELE EST� ARMADO E pede todo seu dinheiro para vender a arma para voc�, voc� vai dar?"
							+ "\n1. Sim \n2. N�o",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				protagonista.setGold(protagonista.getGold() - protagonista.getGold());
				JOptionPane.showMessageDialog(null,
						"Voc� agora n�o tem mais dinheiro, e est� sendo alimentado somente pela vingan�a de voltar no local e matar o assasino do seu pai",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Voc� chega no local da resid�ncia dele, bate na porta, ele sai enquanto a filha o chama\nVoc� sem pensar duas vezes atira no peito dele e corre deixando a arma para tr�s",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"A policia te encontra, voc� est� tranquilo... pois acha que cumpriu sua vingan�a (POR HORA)",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Cr�ditos de fim de jogo \nAgradecimentos aos desenvolvedores(n�s mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
								+ "\nVem Tranquilo 2.0 j� programado para 2020",
						"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);
				break;

			case 2:
				JOptionPane.showMessageDialog(null,
						"Voc� foi morto por tentar ser mais esperto do que pensa \nO contrabandista estava com a arma apontada para voc�, voc� n�o p�de fazer nada",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				GameOver.fimDeJogo();
				break;

			default:
				JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
				FinalJogo.faseFinal(protagonista);
				break;
			}
			break;

		case 2:
			JOptionPane.showMessageDialog(null,
					"Voc� fica pensativo se realmente todo o esfor�o valeu a pena, as vezes o que queremos para os outros n�o desejamos para n�s mesmos",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Dias depois voc� decide prestar homenagens para seus pais \nE joga na megasena com os n�meros da data de nascimento deles"
							+ "\nVoc� ganha na megasena e promete apartir daquele momento que iria ajudar os orf�os",
					"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Cr�ditos de fim de jogo \nAgradecimentos aos desenvolvedores(n�s mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
							+ "\nVem Tranquilo 2.0 j� programado para 2020",
					"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);

			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Voc� chama o assasino do seu pai para a briga, ele est� estressado e tamb�m cai pra dentro",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			Inimigos assasino = new Inimigos("O assasino do seu pai", 100, 10);
			Briga.briga(assasino, protagonista);
			if (protagonista.getVida() < 0) {
				JOptionPane.showMessageDialog(null, "Voc� n�o vingou seu pai, mas voc� poder� tentar outra vez",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				GameOver.fimDeJogo();
			} else {
				JOptionPane.showMessageDialog(null,
						"Voc� arrega�ou tanto o assasino do seu pai, que ele nunca mais vai falar nada do seu pai"
								+ "\nVoc� sai de l� orgulhoso por ter finalmente batido nele, mas ainda n�o acabou para voc�. \nTO BE CONTINUED>>>VEM TRANQUILO 2.0",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			}
			JOptionPane.showMessageDialog(null,
					"Cr�ditos de fim de jogo \nAgradecimentos aos desenvolvedores(n�s mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
							+ "\nVem Tranquilo 2.0 j� programado para 2020",
					"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			FinalJogo.faseFinal(protagonista);
			break;

		}

	}

}
