package br.ucsal.bes.poo20191.domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.ucsal.bes.poo20191.domain.Inimigos;
import br.ucsal.bes.poo20191.domain.Protagonista;

public class Inicio {

	static Protagonista protagonista = new Protagonista("Gabriel", 100, 5, 2000);

	static List<Inimigos> inimigos = new ArrayList<>();

	static String erro = "Opção indisponível";

	public static void abertura() {
		JOptionPane.showMessageDialog(null, "( •_•)\n" + "  ( ง )ง            VEM TRANQUILO!\n" + "  |︶|",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Esse é um jogo de RPG onde suas escolhas"
				+ "\ne sua sorte influenciarão no seu destino!" + "\n \nNão afobe não!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"A cada fase, uma caixa de diálogo aparecerá para você escolher uma opção."
						+ "\nFaça um escolha e dependendo da sua sorte, você poderá continuar no jogo,"
						+ "\ncaso contrário, seu destino será a morte!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Você e seu pai tinham uma vida comum, após sua mãe ter morrido de câncer quando"
						+ "\nvocê tinha apenas 7 anos ele foi a única pessoa que lhe restou. No dia do seu 16º aniversário, "
						+ "\nvocês foram surpreendidos na rua por um homem que anunciou um assalto e após dizerem que"
						+ "\nnão tinham nada, o homem sem exitar, atirou 6 vezes no peito do seu pai. A ambulância"
						+ "\nchegou rápido, mas já era tarde demais, ele morreu ali, nos seus braços.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Hoje, 9 anos depois do acontecido, o assassino do seu pai foi liberado para cumprir o restante da pena em"
						+ "\nliberdade por bom comportamento. Você está satisfeito? Irá arranjar uma forma de fazer justiça "
						+ "\ncom as próprias mãos?" + "\nChegou a hora da decisão de sua vida.\n",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Boa sorte em sua jornada!", "Clique em 'Ok' para prosseguir",
				JOptionPane.PLAIN_MESSAGE);
	}

	public static void faseUm() {
		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Aprender a lutar e ir atrás da sua vingança \n2. A vingança nunca é plena, mata a alma e a envena",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"Depois de conversar com seus amigos, você conheceu algums torcedores da BAMOR e TUI, e também encontrou "
							+ "\numa Academia de luta, a melhor da cidade, mas a inscrição custa 250 moedas. "
							+ "\nTudo que lhe restou da herança do seu pai foram " + protagonista.getGold() + " moedas",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);
			int option2 = new Integer(
					JOptionPane.showInputDialog(null, "1. Entrar na academia \n2. Treinar de graça com os manos da rua",
							"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				protagonista.setGold(protagonista.getGold() - 250);
				protagonista.setForca(protagonista.getForca() + 5);
				protagonista.setVida(protagonista.getVida() + 10);
				JOptionPane.showMessageDialog(null,
						"Parabéns, o treino na academia se mostrou muito efetivo." + "\nAgora sua força subiu para: "
								+ protagonista.getForca() + "\nE sua saúde aumentou para: " + protagonista.getVida()
								+ "\nMas agora só te restam " + protagonista.getGold() + "moedas");
				FaseDois.faseDois(protagonista);
				break;
			case 2:
				protagonista.setForca(protagonista.getForca() + 2);
				protagonista.setVida(protagonista.getVida() - 5);
				JOptionPane.showMessageDialog(null,
						"Sua habilidade não melhorou muito, mas "
								+ "\nagora você já pode participar de uma briga de rua." + "\n\nSua força subiu para: "
								+ protagonista.getForca() + "\nComo treinou sem equipamentos, sua saúde agora é: "
								+ protagonista.getVida() + "\nMas você ainda tem " + protagonista.getGold() + "moedas");
				FaseDois.faseDois(protagonista);
				break;
			default:
				JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
				faseUm();

			}
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você se mudou para o Tibete para levar a vida como um monge",
					"Tashi Delek", JOptionPane.CLOSED_OPTION);
			GameOver.fimDeJogo();

			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseUm();

		}

	}

}
