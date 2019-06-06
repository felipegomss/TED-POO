package business;

import javax.swing.JOptionPane;

import domain.FaseDois;
import domain.FaseTres;
import domain.FaseUm;

public class Jogo {
	

	public static void abertura() {
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
		
		FaseUm.faseUm();
		FaseDois.faseDois();
		FaseTres.faseTres();
	}
	
}
