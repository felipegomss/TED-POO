package br.ucsal.bes.poo20191.domain;

import java.util.ArrayList;
import java.util.List;

public class Inimigos extends Personagens {

	public Inimigos(String nome, Integer vida, Integer forca) {
		super(nome, vida, forca);

	}

	static List<Inimigos> inimigos = new ArrayList<>();

	@Override
	public String toString() {
		return "\nNome:" + getNome() + "\nVida:" + getVida() + "\nForca:" + getForca();
	}

}
