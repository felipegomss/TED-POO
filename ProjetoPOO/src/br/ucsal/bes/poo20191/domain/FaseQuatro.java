package br.ucsal.bes.poo20191.domain;

import javax.swing.JOptionPane;

public class FaseQuatro {

	static String erro = "Op��o indispon�vel";

	public static void faseQuatro(Protagonista protagonista) {

		JOptionPane.showMessageDialog(null,
				"Agora voc� ja � conhecido por toda a cidade! E com a fama voc� fez muitos contatos por todas as quebradas. "
						+ "\nEnquanto conhecia muitos lugares voc� falou para todos seus conhecidos que voc� estava procurando encontrar"
						+ "\n o assassino do seu pai. N�o demorou muito para que encontrassem um amigo do assassino.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Como tudo que voc� fez at� agora foi para conseguir sua vingan�a, \nsua rea��o imediata foi de ir ao encontro desse amigo "
						+ "para extrair todas as informa��es que voc� conseguisse dele, \npor bem ou por mal, voc� ia ficar sabendo onde ele estava!"
						+ "\n\n Rapidamente o alvo foi emboscado, e tudo foi preparado pra que voc� tivesse sua ''conversinha'' com ele.",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"Assim que voc� chegou, voc� viu que os preparativos j� estavam prontos e que o seu novo ''amigo'' j� estava afofado e pronto."
						+ "\nEle disse que falaria tudo que voc� quisesse, mas teria que pagar 500 moedas para saber de tudo. "
						+ "\nSua mente est� muito conturbada e voc� est� ancioso pra encontrar o seu malfeitor!"
						+ "\n\nO que voc� vai fazer? Escolha com cuidado, Deus est� vendo!",
				"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

		int option = new Integer(JOptionPane.showInputDialog(null,
				"1. Extrair as informa��es dele torturando do jeito mais cruel poss�vel. E melhor, de gra�a!"
						+ "\n2. Pagar pelas informa��es. Esse homem n�o tem culpa de nada!",
				"Fa�a sua escolha!", JOptionPane.PLAIN_MESSAGE)).intValue();

		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"Depois de dias o torturando sem que ele o veja, ele finalmente deu a localiza��o do assasino do seu pai."
							+ "\nAgora voc� ir� atr�s do assasino do seu pai, mas antes voc� teria que se livrar do homem torturado",
					"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

			int option2 = new Integer(JOptionPane.showInputDialog(null,
					"1. Se livrar dele o matando"
							+ "\n2. Largar ele em algum local e sair de l�, afinal ele n�o viu seu rosto",
					JOptionPane.PLAIN_MESSAGE)).intValue();

			switch (option2) {
			case 1:
				JOptionPane.showMessageDialog(null,
						"Voc� o matou estrangulado, agora voc� � um assasino igual o homem que matou o seu pai",
						"Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);

				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						"Voc� fez a escolha correta, mais tarde voc� descobriu que esse homem tinha um filho esperando por ele, assim como voc� j� foi filho um dia",
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
			JOptionPane.showMessageDialog(null, "Voc� agora tem " + protagonista.getGold()
					+ ", mas o seu novo 'amigo' te deu a informa��o a qual voc� desejava\nSua miss�o em ca�a do assasino come�ou",
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