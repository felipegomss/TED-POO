package ProjectPoo20191;

import java.util.Random;

public class PersonagensStats {
	static Random rd = new Random();

	private int vida = 100;
	public String nome;


	public PersonagensStats(String nome) {
		super();
		this.nome = nome;

	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
