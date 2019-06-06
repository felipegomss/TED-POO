package domain;

public class Protagonista extends Personagens{
	
	private Integer gold;
	
	
	public Protagonista(String nome, Integer vida, Integer forca, Integer gold) {
		super(nome, vida, forca);
		this.gold = gold;
		
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "Protagonista [gold=" + gold + ", getGold()=" + getGold() + ", getNome()=" + getNome() + ", getVida()="
				+ getVida() + ", getForca()=" + getForca() + "]";
	}
	
	

}
