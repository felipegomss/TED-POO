package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class FaseTres {
	static Random rd = new Random();

	static String erro = "Op��o indispon�vel";

	static Protagonista protagonista;

	public static void faseTres() {
		Inimigos inimigo1 = new Inimigos("Castanheiro", 180, 21);
		Inimigos inimigo2 = new Inimigos("Cajueiro", 200, 25);
		Inimigos inimigo3 = new Inimigos("Mangabeiro", 220, 27);

		JOptionPane.showMessageDialog(null,
				"Voc� agora tem a op��o de ir para uma Luta clandestina ou Lutar em um torneio para melhorar suas habilidades e receber recompensas"
						+ "obs:\n Caso escolha luta clandestina, pode escolher seu oponente mas as recompensas ser�o menores"
						+ "\nCaso escolha lutar em um torneio, mais de um inimigo ser� indicado e as chances de perder s�o maiores, mas ter� maiores recompensas");

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Lutar clandestinamente e enfretar um oponente a sua escolha(100Golds para entrar e Recompensa 200Golds) "
						+ "\n2. Lutar em um torneio e enfretar varios oponentes(500Golds para entrar. Recompensa 1000Golds)",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			int option2 = new Integer(JOptionPane.showInputDialog(null, "1. Nome: " + inimigo1.getNome() + "\nFor�a: "
					+ inimigo1.getForca() + "\nVida:" + inimigo1.getVida() + "\n \n" + 
					"2. Nome: " + inimigo2.getNome() + "\nFor�a: " + inimigo2.getForca() + "\nVida:" + inimigo2.getVida() + "\n \n" + 
					"3. Nome: "	+ inimigo3.getNome() + "\nFor�a: " + inimigo3.getForca() + "\nVida:" + inimigo3.getVida() + "\n \n",
					"Escolha seu inimigo", JOptionPane.PLAIN_MESSAGE)).intValue();
			switch (option2) {
			case 1:
				Briga.briga(inimigo1);
				break;
			
			case 2:
				Briga.briga(inimigo2);
				break;
				
			case 3:
				Briga.briga(inimigo3);
				break;

			default:
				break;
			}
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "");
			Briga.briga(inimigo1);
			JOptionPane.showMessageDialog(null, "");
			Briga.briga(inimigo2);
			JOptionPane.showMessageDialog(null, "");
			Briga.briga(inimigo3);
			
			break;
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			faseTres();
		}

	}

}
