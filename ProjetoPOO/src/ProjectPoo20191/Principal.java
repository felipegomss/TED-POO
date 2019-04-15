package ProjectPoo20191;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonagemPrincipal personagem = new PersonagemPrincipal("");
		Inimigo1 inimigo1 = new Inimigo1("");
		Inimigo2 inimigo2 = new Inimigo2("");
		personagem.Stats();
		inimigo1.StatsInimigo1();
		inimigo2.StatsInimigo2();
		personagem.golpeTuNuncaMaisFalaDoMeuPai();
		personagem.golpeAfobaNao();
		personagem.golpeVemTranquilo();

		
		if (inimigo1.getVida() <= 1 || inimigo2.getVida() <= 1) {
			String fatal;
			System.out.println("FATALITY TIME(press x)");
			fatal = sc.next();

			switch (fatal) {
			case "x":
				personagem.golpeVouTeMatarAGora();

				break;

			default:
				System.out.println("Já provei o que tinha que provar");
				break;
			}
			

		}

	}

}
