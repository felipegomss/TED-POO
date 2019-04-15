package ProjectPoo20191;

import java.util.Random;
import java.util.Scanner;

public class PersonagemPrincipal extends PersonagensStats {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public PersonagemPrincipal(String nome) {
		super(nome);
		System.out.print("Defina o nome para o seu personagem: ");
		nome = sc.next();
		this.nome = nome;
	}

	public String Stats() {
	

		String txt = "Seu personagem foi agraciado com:" + "\n" + " \nLife: " + getVida() + "\nNome: " + getNome();
		System.out.print(txt);
		return txt;
	}
	
	public int golpeTuNuncaMaisFalaDoMeuPai() {
		int golpe = rd.nextInt(5);
		
		if (golpe == 0) {
			System.out.println("Não causou dano");		
		} else {
			System.out.println("Seu golpe: (Tu nunca mais fala do meu pai) Causou " + golpe + " de dano");
		}
		
		return golpe;
		
	}
	
	public int golpeVemTranquilo() {
		int golpe = rd.nextInt(7);
		
		if (golpe == 0) {
			System.out.println("Não causou dano");		
		} else {
			System.out.println("Seu golpe: (Vem tranquilo) Causou " + golpe + " de dano");
		}
		
		return golpe;
		
	}
	
	public int golpeAfobaNao() {
		int golpe = rd.nextInt(10);
		
		if (golpe == 0) {
			System.out.println("Não causou dano");		
		} else {
			System.out.println("Seu golpe: (Afoba não) Causou " + golpe + " de dano");
		}
		
		return golpe;
		
	}
	
	public int golpeVouTeMatarAGora() {
		
		int golpe = 1;
		
		System.out.println("AAAH AGORA VOU TE MATAR" + "\nFATALITY");
		
		return golpe;
		
	}
	
	

}
