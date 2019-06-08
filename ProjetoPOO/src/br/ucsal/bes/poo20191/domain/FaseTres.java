package br.ucsal.bes.poo20191.domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseTres {
	static Random rd = new Random();

	static String erro = "Opção indisponível";

	public static void faseTres(Protagonista protagonista) {

		Inimigos.inimigos.add(new Inimigos("Zé da Castanha", 110, 7));
		Inimigos.inimigos.add(new Inimigos("Caju", 130, 10));
		Inimigos.inimigos.add(new Inimigos("Roberto Manga", 150, 15));

		JOptionPane.showMessageDialog(null,
				"Você agora tem a opção de ir para uma Luta clandestina ou Lutar em um torneio para melhorar suas habilidades e receber recompensas."
						+ "\nObs: *Caso escolha luta clandestina, pode escolher seu oponente mas as recompensas serão menores."
						+ "\n*Caso escolha lutar em um torneio, mais de um inimigo será indicado e as chances de perder são maiores, mas terá maiores recompensas",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Lutar clandestinamente e enfretar um oponente a sua escolha (100 moedas para entrar e Recompensa 200 moedas) "
						+ "\n2. Lutar em um torneio profissional e enfretar vários oponentes (500 moedas para entrar. Recompensa 1000 moedas)",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			int option2 = new Integer(
					JOptionPane.showInputDialog(null,
							"Inimigo 1. " + Inimigos.inimigos.get(0) + "\n" + "\nInimigo 2. " + Inimigos.inimigos.get(1)
									+ "\n" + "\nInimigo 3. " + Inimigos.inimigos.get(2) + "\n",
							JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				Briga.briga(Inimigos.inimigos.get(0), protagonista);
				break;

			case 2:
				Briga.briga(Inimigos.inimigos.get(1), protagonista);
				break;

			case 3:
				Briga.briga(Inimigos.inimigos.get(2), protagonista);
				break;

			default:
				JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
				break;

			}

			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você irá lutar contra o primeiro oponente");
			Briga.briga(Inimigos.inimigos.get(0), protagonista);
			JOptionPane.showMessageDialog(null, "Você irá lutar contra o segundo oponente");
			Briga.briga(Inimigos.inimigos.get(1), protagonista);
			JOptionPane.showMessageDialog(null, "Você irá lutar contra o terceiro oponente");
			Briga.briga(Inimigos.inimigos.get(2), protagonista);
			;

			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseTres(protagonista);
		}
		
		FaseQuatro.faseQuatro(protagonista);
	}

}
