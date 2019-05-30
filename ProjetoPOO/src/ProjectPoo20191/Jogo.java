package ProjectPoo20191;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Jogo {
	static Protagonista protagonista = new Protagonista();

	static List<Inimigos> inimigos = new ArrayList<>();
	
	static String erro = "Opção indisponível";

	private static void abertura() {
		JOptionPane.showMessageDialog(null, "( •_•)\n" + "  ( ง )ง            VEM TRANQUILO!\n" + "  |︶|",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Esse é um jogo de RPG onde suas escolhas" + "\ne sua sorte influenciará no seu destino!" +"\nNão afobe não",
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
		abertura();
		faseUm();
		faseDois();

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
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold() + " de moedas, e sua força é " + protagonista.getForca());
			break;
		case 2:
			protagonista.setForca(5);
			JOptionPane.showMessageDialog(null, "Seu personagm agora tem " + protagonista.getGold() + " de moedas, e sua força é " + protagonista.getForca());
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUmDotUm();

		}
	}
	
	private static void faseDois(){
		
		JOptionPane.showMessageDialog(null, "Você já treinou suficiente, quer ir para uma luta clandestina e ganhar dinheiro ou continuar treinando para aprimorar sua força?"
				+ "obs: caso continue treinando, você só poderá treinar na academia e gastará 400 moedas na academia, porém aumentará sua força e vida");
		
		int option = new Integer (JOptionPane.showInputDialog(null, "1. Ir para uma luta clandestina (taxa de entrada=100golds) \n2. Treinar na academia e aumentar sua força e vida",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();
		
		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null, "Você foi no clube a noite, e tem 2 oponentes para lutar, faça sua escolha entre os 2" + "\nStatus dos oponente são" + "\n" + inimigos.toString());
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você incrementou");
			
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseDois();

		}
		
	}
	
}
