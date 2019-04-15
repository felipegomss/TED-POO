package ProjectPoo20191;

public class Inimigo1 extends PersonagensStats {

	public Inimigo1(String nome) {
		super(nome);
		nome = "Capanga";
		this.nome = nome;

	}

	public String StatsInimigo1() {
		String txt = "\n" + "\nSeu primeiro inimigo é o " + getNome() + "\nLife do Inimigo: " + getVida();
		System.out.println(txt);
		return txt;
	}

}
