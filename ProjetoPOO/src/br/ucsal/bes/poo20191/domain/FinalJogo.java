package br.ucsal.bes.poo20191.domain;

import javax.swing.JOptionPane;

public class FinalJogo {

	static String erro = "Opção indisponível";

	public static void faseFinal(Protagonista protagonista) {
		JOptionPane.showMessageDialog(null,
				"Você foi de encontro com o homem que matou o seu pai. \nE se deparou que ele agora também tinha uma família e estava tentando seguir as leis.\nMas você foi confrontar ele mesmo assim.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Você chega na porta da casa dele, bate na porta e ele vem te atender\nEle não te reconheceu e quis arrumar briga com você, pois você estava pertubando a 'paz' dele ",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		int option = new Integer(JOptionPane.showInputDialog(null,
				"O que você irá fazer? \n1. Ir atrás de uma arma com algum contrabandista que você conheceu lutando clandestinamente, voltar e matar ele."
						+ "\n2. Sair de lá e vê que realmente você estava errado em prosseguir com isso tudo"
						+ "\n3. VEM TRANQUILO, NÃO AFOBA NÃO",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:

			int option2 = new Integer(JOptionPane.showInputDialog(null,
					"Você achou um contrabandista, ELE ESTÁ ARMADO E pede todo seu dinheiro para vender a arma para você, você vai dar?"
							+ "\n1. Sim \n2. Não",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				protagonista.setGold(protagonista.getGold() - protagonista.getGold());
				JOptionPane.showMessageDialog(null,
						"Você agora não tem mais dinheiro, e está sendo alimentado somente pela vingança de voltar no local e matar o assasino do seu pai",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Você chega no local da residência dele, bate na porta, ele sai enquanto a filha o chama\nVocê sem pensar duas vezes atira no peito dele e corre deixando a arma para trás",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"A policia te encontra, você está tranquilo... pois acha que cumpriu sua vingança (POR HORA)",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Créditos de fim de jogo \nAgradecimentos aos desenvolvedores(nós mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
								+ "\nVem Tranquilo 2.0 já programado para 2020",
						"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);
				break;

			case 2:
				JOptionPane.showMessageDialog(null,
						"Você foi morto por tentar ser mais esperto do que pensa \nO contrabandista estava com a arma apontada para você, você não pôde fazer nada",
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
					"Você fica pensativo se realmente todo o esforço valeu a pena, as vezes o que queremos para os outros não desejamos para nós mesmos",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Dias depois você decide prestar homenagens para seus pais \nE joga na megasena com os números da data de nascimento deles"
							+ "\nVocê ganha na megasena e promete apartir daquele momento que iria ajudar os orfãos",
					"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Créditos de fim de jogo \nAgradecimentos aos desenvolvedores(nós mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
							+ "\nVem Tranquilo 2.0 já programado para 2020",
					"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);

			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Você chama o assasino do seu pai para a briga, ele está estressado e também cai pra dentro",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			Inimigos assasino = new Inimigos("O assasino do seu pai", 100, 10);
			Briga.briga(assasino, protagonista);
			if (protagonista.getVida() < 0) {
				JOptionPane.showMessageDialog(null, "Você não vingou seu pai, mas você poderá tentar outra vez",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
				GameOver.fimDeJogo();
			} else {
				JOptionPane.showMessageDialog(null,
						"Você arregaçou tanto o assasino do seu pai, que ele nunca mais vai falar nada do seu pai"
								+ "\nVocê sai de lá orgulhoso por ter finalmente batido nele, mas ainda não acabou para você. \nTO BE CONTINUED>>>VEM TRANQUILO 2.0",
						"Clique em 'ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			}
			JOptionPane.showMessageDialog(null,
					"Créditos de fim de jogo \nAgradecimentos aos desenvolvedores(nós mesmos)Marcony Souza, Felipe Gomes, Fernando Carvalho e Lucas Augusto"
							+ "\nVem Tranquilo 2.0 já programado para 2020",
					"FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			FinalJogo.faseFinal(protagonista);
			break;

		}

	}

}
