package ProjectPoo20191;

public class Inimigo2 extends PersonagensStats {

	public Inimigo2(String nome) {
		super(nome);
		nome = "Principe do guetto";
		this.nome = nome;

	}

	public String StatsInimigo2() {
		String txt = "\nSeu segundo inimigo é o " + getNome() + "\nLife do Inimigo: " + getVida();
		System.out.println(txt + "\n");
		return txt;
	}

}
