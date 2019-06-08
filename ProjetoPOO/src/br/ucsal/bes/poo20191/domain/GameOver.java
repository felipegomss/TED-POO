package br.ucsal.bes.poo20191.domain;

import javax.swing.JOptionPane;

public class GameOver {

	static String erro = "Opção indisponível";

	public static void fimDeJogo() {

		int option = new Integer(JOptionPane.showInputDialog(null, "1. Tentar novamente? \n2.Sair", "Faça sua escolha!",
				JOptionPane.PLAIN_MESSAGE)).intValue();
		switch (option) {
		case 1:
			Inicio.faseUm();
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "END GAME", " ", JOptionPane.CLOSED_OPTION);

			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			Inicio.faseUm();

		}

	}
}
