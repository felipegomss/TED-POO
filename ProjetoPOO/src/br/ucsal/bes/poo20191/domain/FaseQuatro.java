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
				"Como tudo que você fez até agora foi para conseguir sua vingança, sua reação imediata foi de ir ao encontro desse amigo"
						+ "para extrair todas as informações que você conseguisse dele, por bem ou por mal, você ia ficar sabendo onde ele estava!"
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