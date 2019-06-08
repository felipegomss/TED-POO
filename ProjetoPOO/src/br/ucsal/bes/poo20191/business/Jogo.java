package br.ucsal.bes.poo20191.business;

import br.ucsal.bes.poo20191.domain.FaseDois;
import br.ucsal.bes.poo20191.domain.FaseQuatro;
import br.ucsal.bes.poo20191.domain.FaseTres;
import br.ucsal.bes.poo20191.domain.FinalJogo;
import br.ucsal.bes.poo20191.domain.Inicio;
import br.ucsal.bes.poo20191.domain.Protagonista;

public class Jogo {
	

	public static void main(String[] args) {
		
		//Inicio.abertura();
		Protagonista protagonista = new Protagonista("Marcony", 200, 5, 2000);
	//	Inicio.faseUm();
	//	FaseDois.faseDois(protagonista);
	//	FaseTres.faseTres(protagonista);
		//FaseQuatro.faseQuatro(protagonista);
		FinalJogo.faseFinal(protagonista);
	}

}
