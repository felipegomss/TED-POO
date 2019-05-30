package ProjectPoo20191;

import javax.swing.JOptionPane;

public class Jogo {
	static Protagonista protagonista = new Protagonista();

	static String erro = "Opção indisponível";

	private static void abertura() {
		JOptionPane.showMessageDialog(null, "( •_•)\n" + "  ( ง )ง            VEM TRANQUILO!\n" + "  |︶|",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Esse é um jogo de RPG onde suas escolhas" + "\ne sua sorte influenciará no seu destino!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "A cada fase uma caixa de diálogo aparecerá para você escolher uma opção,"
				+ "\nfaça a escolha correta e poderá continuar no jogo," + "\ncaso contrário, seu destino é a morte!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Você e seu pai tinham uma vida comum, após sua mãe ter morrido de câncer quando"
						+ "\nvocê tinha apenas 7 anos ele foi a única pessoa que lhe restou. No dia do seu 16º aniversário, "
						+ "\nvocês foram surpreendidos na rua por um homem que anunciou um assalto e após dizerem que"
						+ "\nnão tinham nada o homem, sem exitar, atirou 6 vezes no peito do seu pai. A ambulância"
						+ "\nchegou rápido, mas já era tarde demais, ele morreu ali, nos seus braços.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"9 anos depois, o assassino do seu pai é liberado para cumprir o restante da pena em"
						+ "\nliberdade, mas você não satisfeito, irá arranjar uma forma de fazer justiça com as próprias"
						+ "\nmãos. Porém para isso você terá que enfrentar alguns desafios primeiro.\n",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Boa sorte em sua jornada!", "Clique em 'Ok' para prosseguir",
				JOptionPane.PLAIN_MESSAGE);
	}

	public static void main(String[] args) {

		faseUm();

	}

	private static void faseUm() {
		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Aprender a lutar e ir atrás da sua vingança \n2. A vingança nunca é plena, mata a alma e a envena",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			faseUmDotUm();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você se mudou para o Tibete para levar a vida como um monge",
					"Tashi Delek བཀྲ་ཤིས་བདེ་ལེགས", JOptionPane.CLOSED_OPTION);
			int option2 = new Integer(JOptionPane.showInputDialog(null, "1. Refazer a escolha \n2.Sair",
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
			
			break;
		case 2:

			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUmDotUm();

		}
	}
	
	private static void subtracaoDinheiro() {
		
	}
}
