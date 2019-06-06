package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class Briga {
	static Random rd = new Random();

	public static void briga(Inimigos inimigo, Protagonista protagonista) {
		
		Integer probabilidade;
		if (inimigo.getForca() < protagonista.getForca()) {
			probabilidade = rd.nextInt((9) + 1);
			if (probabilidade <=7) {
				inimigo.setVida(inimigo.getVida() - 50);
				JOptionPane.showMessageDialog(null, protagonista.getNome() + " Acertou com um soco o seu oponente e a vida de " + inimigo.getNome() + " agora é " + inimigo.getVida());
				probabilidade = rd.nextInt((9) + 1);
				if (probabilidade <=8) {
					JOptionPane.showMessageDialog(null, protagonista.getNome() + "Não foi afobado e desceu a porrada em " + inimigo.getNome());
					inimigo.setVida(inimigo.getVida() - inimigo.getVida());
					protagonista.setVida(protagonista.getVida() - 20);
					JOptionPane.showMessageDialog(null, protagonista.getNome() + " agora tem " + protagonista.getVida() + "e seu oponente foi derrotado e tem " + inimigo.getVida() + " de Vida");
				}
			
			}
			
		}
		else { 
			probabilidade = rd.nextInt((9 + 1));
			if (probabilidade <=7) {
				protagonista.setVida(protagonista.getVida() - 50);
				JOptionPane.showMessageDialog(null, protagonista.getNome() + " foi afobado e levou um soco do oponente" + " a vida dele agora está" + protagonista.getVida());
				probabilidade = rd.nextInt((9 + 1));
				if (probabilidade <=6) {
					protagonista.setVida(protagonista.getVida() - protagonista.getVida());
					inimigo.setVida(inimigo.getVida() - 20);
					JOptionPane.showMessageDialog(null, "Falaram do pai de " + protagonista.getNome() + " e ele acabou cedendo e pediu para parar e ficou com " + protagonista.getVida() + " de vida." );
					JOptionPane.showMessageDialog(null, "é o seu fim");		
					System.exit(0);
				}
				
			} else {
				inimigo.setVida(inimigo.getVida() - 50);
				JOptionPane.showMessageDialog(null, inimigo.getNome() + " foi afobado e levou um soco de " + protagonista.getNome() + " caiu no chão, e a vida dele agora está" + inimigo.getVida());
				probabilidade = rd.nextInt((9 + 1));
				if (probabilidade <=7) {
					inimigo.setVida(inimigo.getVida() - inimigo.getVida());
					protagonista.setVida(protagonista.getVida() - 20);
					JOptionPane.showMessageDialog(null, "Falaram do pai de " + protagonista.getNome() + " e ele ficou pistola, seu oponente caiu na lona e não se levantou" );
					JOptionPane.showMessageDialog(null, "é o seu fim");		
					System.exit(0);
				}
			}
	}

	}
}