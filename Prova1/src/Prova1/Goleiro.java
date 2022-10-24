package Prova1;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro {

	private int selecao;
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int AAG;
	private int quantDefesa;
	private int quantGol;
	private Trave trave;
	private Chute chute;
	private ArrayList<Celulas> celulasDefesa;

	public Goleiro(int selecao, int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao,
			int forca, int equilibrio) {
		super();
		this.selecao = selecao;
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
		this.trave = new Trave();
		areaDeAtuacaoDoGoleiro(velocidade, flexibilidade, agilidade, coordenacao, forca, equilibrio);
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public int getSelecao() {
		return selecao;
	}

	public int getQuantDefesa() {
		return quantDefesa;
	}

	public int getQuantGol() {
		return quantGol;
	}

	public Trave getTrave() {
		return trave;
	}

	public int getAAG() {
		return AAG;
	}

	private void areaDeAtuacaoDoGoleiro(int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca,
			int equilibrio) {
		this.AAG = ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + forca
				+ (equilibrio * 2)) / 8;
	}

	public void defesaGoleiro(Celulas chute, int forca) {
		this.celulasDefesa = new ArrayList<Celulas>();

		int cont = 0;
		int a = aleatorizarPosicaoX(chute.getQuadrante());
		int b = aleatorizarPosicaoY(chute.getQuadrante());

		for (int x = b; x < 8; x++) {
			for (int y = a; y < 16; y++) {
				if (trave.celulas[x][y].getQuadrante() == chute.getQuadrante() && trave.celulas[x][y].isDentro()
						&& cont < AAG && cont <16) {
					celulasDefesa.add(new Celulas(x, y));
					cont++;
				}
			}
		}
		contabilizarGol(chute, forca);
	}

	private int aleatorizarPosicaoX(int quadrante) {
		Random rand = new Random();
		int x = 0;

		if (quadrante == 1 || quadrante == 3)
			x = rand.nextInt(1, 7);

		if (quadrante == 2 || quadrante == 4)
			x = rand.nextInt(8, 14);

		return x;
	}

	private int aleatorizarPosicaoY(int quadrante) {
		Random rand = new Random();
		int y = 0;

		if (quadrante == 1 || quadrante == 2)
			y = rand.nextInt(1, 4);

		if (quadrante == 3 || quadrante == 4)
			y = rand.nextInt(5, 8);

		return y;
	}

	public void contabilizarGol(Celulas chute, int forca) {
		int x = 0, y = 0;
		if (chute.getPosicaoX() > 0)
			x = (chute.getPosicaoX() - 1);
		if (chute.getPosicaoY() > 0)
			y = (chute.getPosicaoY() - 1);

		if (trave.checarGol(chute, celulasDefesa, AAG, forca) == true) {
			this.quantDefesa += 1;
			this.trave.celulas[y][x].setChutesDefendidos(+1);
			this.trave.celulas[y][x].setChute(+1);
		} else {
			this.quantGol += 1;
			this.trave.celulas[y][x].setGol(+1);
			this.trave.celulas[y][x].setChute(+1);
			;
		}
	}
}