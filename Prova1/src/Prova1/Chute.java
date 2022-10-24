package Prova1;

public class Chute {

	private int id;
	private int forca;
	private int posicaoX;
	private int posicaoY;
	private Celulas chute;


	public Chute(int id, int forca, int posicaoX, int posicaoY) {
		this.id = id;
		this.forca = forca;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getForca() {
		return forca;
	}

	public Celulas getChute() {
		return chute;
	}

	public void Chutar(Goleiro goleiro) {
		Celulas chute = new Celulas(posicaoX, posicaoY);
		goleiro.defesaGoleiro(chute, forca);
	}

}
