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
				"Como tudo que voc� fez at� agora foi para conseguir sua vingan�a, sua rea��o imediata foi de ir ao encontro desse amigo"
						+ "para extrair todas as informa��es que voc� conseguisse dele, por bem ou por mal, voc� ia ficar sabendo onde ele estava!"
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
				
			break;
		case 2:
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE);
			break;
		}

	}

}

// JOptionPane.showMessageDialog(null, "", "Clique em 'Ok' para prosseguir", JOptionPane.PLAIN_MESSAGE);