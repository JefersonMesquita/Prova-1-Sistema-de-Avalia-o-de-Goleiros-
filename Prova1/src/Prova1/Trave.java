package Prova1;

import java.util.ArrayList;

public class Trave {

	public Celulas[][] celulas;

	public Trave() {
		this.celulas = new Celulas[8][16];

		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 16; y++) {
				celulas[x][y] = new Celulas(x, y);
			}
		}
	}


	public boolean checarGol(Celulas chute, ArrayList<Celulas> celulasDefesa, int AAG, int forca) {
		boolean ehGol = false;

		for (Celulas celDef : celulasDefesa) {
			if (celDef.getPosicaoX() == chute.getPosicaoX() && celDef.getPosicaoY() == chute.getPosicaoY()) {
				if (AAG > forca) {
					ehGol = true;
				}
			}
		}
		return ehGol;
	}
}
