package domain;

public abstract class Personagens {
	
	private String nome;
	private Integer vida;
	private Integer forca;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", vida=" + vida + ", forca=" + forca;
	}
	
	
	
	
}
