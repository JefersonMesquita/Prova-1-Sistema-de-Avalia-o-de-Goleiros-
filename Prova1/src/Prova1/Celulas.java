package Prova1;

public class Celulas {

	private int posicaoX;
	private int posicaoY;
	private int quadrante;
	private int chute;
	private int chutesDefendidos;
	private int gol;
	private boolean dentro;
	private boolean traveSupeior;
	private boolean traveEsquerda;
	private boolean traveDireita;
	private boolean noAngulo;

	public Celulas(int posicaoY, int posicaoX) {
		super();
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		descobrirQuadrante(posicaoX, posicaoY);
		dentroDoGol(posicaoX, posicaoY);
		traves(posicaoX, posicaoY);
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public boolean isDentro() {
		return dentro;
	}

	public boolean isTraveSupeior() {
		return traveSupeior;
	}

	public boolean isTraveEsquerda() {
		return traveEsquerda;
	}

	public boolean isTraveDireita() {
		return traveDireita;
	}
	
	public int getChute() {
		return chute;
	}
	
	public void setChute(int chute) {
		this.chute = chute;
	}

	public boolean isNoAngulo() {
		return noAngulo;
	}
	
	public int getChutesDefendidos() {
		return chutesDefendidos;
	}

	public void setChutesDefendidos(int chutesDefendidos) {
		this.chutesDefendidos = chutesDefendidos;
	}

	public int descobrirQuadrante(int x, int y) {
		if ((x >= 0 && x < 8) && (y >= 0 && y < 4))
			this.quadrante = 1;
		if ((x >= 8 && x < 16) && (y >= 0 && y < 4))
			this.quadrante = 2;
		if ((x >= 0 && x < 8) && (y >= 4 && y < 9))
			this.quadrante = 3;
		if ((x >= 8 && x <= 16) && (y >= 4 && y < 9))
			this.quadrante = 4;
		return quadrante;
	}

	private void dentroDoGol(int x, int y) {
		if (x > 0 && x < 15 && y > 0)
			this.dentro = true;
	}
	
	private void traves(int x, int y) {
		if(x>0 && x<15 && y==1)
			this.traveSupeior = true;
		if(y>0 && x==1)
			this.traveEsquerda = true;
		if(y>0 && x==14)
			this.traveDireita = true;	
		if((x==2 && y==2) || (x==2 && y==15))
			this.noAngulo = true;
	}

}
