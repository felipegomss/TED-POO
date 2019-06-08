package br.ucsal.bes.poo20191.domain;

import javax.swing.JOptionPane;

public class FaseQuatro {

	static String erro = "Opção indisponível";

	public static void faseQuatro(Protagonista protagonista) {

		JOptionPane.showMessageDialog(null,
				"Agora você ja é conhecido por toda a cidade! E com a fama você fez muitos contatos por todas as quebradas. "
						+ "\nEnquanto conhecia muitos lugares você falou para todos seus conhecidos que você estava procurando encontrar"
						+ "\n o assassino do seu pai. Não demorou muito para que encontrassem um amigo do assassino.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Como tudo que você fez até agora foi para conseguir sua vingança, \nsua reação imediata foi de ir ao encontro desse amigo "
						+ "para extrair todas as informações que você conseguisse dele, \npor bem ou por mal, você ia ficar sabendo onde ele estava!"
						+ "\n\n Rapidamente o alvo foi emboscado, e tudo foi preparado pra que você tivesse sua ''conversinha'' com ele.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Assim que você chegou, você viu que os preparativos já estavam prontos e que o seu novo ''amigo'' já estava afofado e pronto."
						+ "\nEle disse que falaria tudo que você quisesse, mas teria que pagar 500 moedas para saber de tudo. "
						+ "\nSua mente está muito conturbada e você está ancioso pra encontrar o seu malfeitor!"
						+ "\n\nO que você vai fazer? Escolha com cuidado, Deus está vendo!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Extrair as informações dele torturando do jeito mais cruel possível. E melhor, de graça!"
						+ "\n2. Pagar pelas informações. Esse homem não tem culpa de nada!",
				"Faça sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"Depois de dias o torturando sem que ele o veja, ele finalmente deu a localização do assasino do seu pai."
							+ "\nAgora você irá atrás do assasino do seu pai, mas antes você teria que se livrar do homem torturado",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

			int option2 = new Integer(JOptionPane.showInputDialog(null,
					"1. Se livrar dele o matando"
							+ "\n2. Largar ele em algum local e sair de lá, afinal ele não viu seu rosto",
					JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				JOptionPane.showMessageDialog(null,
						"Você o matou estrangulado, agora você é um assasino igual o homem que matou o seu pai",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						"Você fez a escolha correta, mais tarde você descobriu que esse homem tinha um filho esperando por ele, assim como você já foi filho um dia",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

				break;

			default:
				JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
				FaseQuatro.faseQuatro(protagonista);
				break;
			}
			break;
		case 2:
			protagonista.setGold(protagonista.getGold() - 500);
			JOptionPane.showMessageDialog(null, "Você agora tem " + protagonista.getGold()
					+ ", mas o seu novo 'amigo' te deu a informação a qual você desejava\nSua missão em caça do assasino começou",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

			break;

		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			FaseQuatro.faseQuatro(protagonista);
			break;
		}

	}

}

// JOptionPane.showMessageDialog(null, "", "Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);