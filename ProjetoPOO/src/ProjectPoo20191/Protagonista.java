package ProjectPoo20191;

public class Protagonista extends Personagens{
	private Integer gold = 1000;

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return super.toString() + "Protagonista [gold=" + gold + "]";
	}
	

}
