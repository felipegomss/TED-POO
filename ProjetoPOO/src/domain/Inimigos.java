package domain;

import java.util.ArrayList;
import java.util.List;

public class Inimigos extends Personagens{
	
	static List<Inimigos> inimigos = new ArrayList<>();
	
	public Inimigos(String nome, Integer vida, Integer forca) {
		super(nome, forca, forca);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
