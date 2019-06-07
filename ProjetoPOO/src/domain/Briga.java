package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class Briga {
	
	static Random rd = new Random();

	public static void briga(Inimigos inimigo, Protagonista protagonista) {
		
		
		//TO-DO
		// Checagem para ver se a vida de algum dos dois participantes chegou a 0
		
		Integer probabilidade;
		probabilidade = rd.nextInt((9) + 1);
		if (probabilidade <5) {
			inimigo.setVida(inimigo.getVida()-protagonista.getForca());
			JOptionPane.showMessageDialog(null, protagonista.getNome() + " acertou com um soco em " + inimigo.getNome() + "."
					+ "\nA vida dele desceu para " + inimigo.getVida()
					+ "\nAgora é a vez dele revidar!");
				
		}else {
			JOptionPane.showMessageDialog(null, protagonista.getNome() + " foi afobado e errou o socão. Agora " + inimigo.getNome() + "vai atacar!" 
			+ "\nVá mais tranquilo da próxima vez!");			
		}
		probabilidade = rd.nextInt((9) + 1);
		if (probabilidade <5) {
			protagonista.setVida(protagonista.getVida()-inimigo.getForca());
			JOptionPane.showMessageDialog(null, protagonista.getNome() + " não está tranquilo e tomou um kilão de " + inimigo.getNome() + "."
					+ "\nA vida de " + protagonista.getNome() + " desceu para " + protagonista.getVida()
					+ "\nAgora é a vez de revidar! Sem afobação! ");
				
		}else {
			JOptionPane.showMessageDialog(null, inimigo.getNome() + " errou a bica e agora " + protagonista.getNome() + " ficou puto e vai descer o sarrafo!" 
			+ "\nAgora ele vai matar!");			
		}
		
		// TO-DO
		// Colocar recursão de método no final para a briga ficar rolando até o final
		// Ao final da briga, se o protagonista vencer, recuperar a vida dele para 70 ou 80 %
		
		
		
//		if (inimigo.getForca() < protagonista.getForca()) {
//			probabilidade = rd.nextInt((9) + 1);
//			if (probabilidade <=7) {
//				inimigo.setVida(inimigo.getVida() - 50);
//				JOptionPane.showMessageDialog(null, protagonista.getNome() + " Acertou com um soco o seu oponente e a vida de " + inimigo.getNome() + " agora é " + inimigo.getVida());
//				probabilidade = rd.nextInt((9) + 1);
//				if (probabilidade <=8) {
//					JOptionPane.showMessageDialog(null, protagonista.getNome() + "Não foi afobado e desceu a porrada em " + inimigo.getNome());
//					inimigo.setVida(inimigo.getVida() - inimigo.getVida());
//					protagonista.setVida(protagonista.getVida() - 20);
//					JOptionPane.showMessageDialog(null, protagonista.getNome() + " agora tem " + protagonista.getVida() + "e seu oponente foi derrotado e tem " + inimigo.getVida() + " de Vida");
//				}
//			
//			}
//			
//		}
//		else { 
//			probabilidade = rd.nextInt((9 + 1));
//			if (probabilidade <=7) {
//				protagonista.setVida(protagonista.getVida() - 50);
//				JOptionPane.showMessageDialog(null, protagonista.getNome() + " foi afobado e levou um soco do oponente" + " a vida dele agora está" + protagonista.getVida());
//				probabilidade = rd.nextInt((9 + 1));
//				if (probabilidade <=6) {
//					protagonista.setVida(protagonista.getVida() - protagonista.getVida());
//					inimigo.setVida(inimigo.getVida() - 20);
//					JOptionPane.showMessageDialog(null, "Falaram do pai de " + protagonista.getNome() + " e ele acabou cedendo e pediu para parar e ficou com " + protagonista.getVida() + " de vida." );
//					JOptionPane.showMessageDialog(null, "é o seu fim");		
//					System.exit(0);
//				}
//				
//			} else {
//				inimigo.setVida(inimigo.getVida() - 50);
//				JOptionPane.showMessageDialog(null, inimigo.getNome() + " foi afobado e levou um soco de " + protagonista.getNome() + " caiu no chão, e a vida dele agora está" + inimigo.getVida());
//				probabilidade = rd.nextInt((9 + 1));
//				if (probabilidade <=7) {
//					inimigo.setVida(inimigo.getVida() - inimigo.getVida());
//					protagonista.setVida(protagonista.getVida() - 20);
//					JOptionPane.showMessageDialog(null, "Falaram do pai de " + protagonista.getNome() + " e ele ficou pistola, seu oponente caiu na lona e não se levantou" );
//					JOptionPane.showMessageDialog(null, "é o seu fim");		
//					System.exit(0);
//				}
//			}
//	}

	}
}