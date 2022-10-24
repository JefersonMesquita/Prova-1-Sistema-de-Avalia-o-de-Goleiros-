package Prova1;

import java.util.ArrayList;

import java.util.Scanner;

public class Apresentacao {
	private ArrayList<Chute> chutes;
	private ArrayList<Goleiro> goleiros;

	public Apresentacao() {
		super();
		chutes = new ArrayList<Chute>();
		goleiros = new ArrayList<Goleiro>();
		goleiros();
		chutes();
	}

	public void setChutes(Chute chute) {
		this.chutes.add(chute);
	}

	public void setGoleiros(Goleiro goleiro) {
		this.goleiros.add(goleiro);
	}

	public void iniciar() {
		for (Chute a : chutes) {
			for (Goleiro b : goleiros) {
				a.Chutar(b);
			}
		}
	}

	public void goleiros() {
		Selecao selecao = new Selecao();

		for (int i = 0; i < selecao.goleiros.size(); i++) {
			goleiros.add(selecao.goleiros.get(i));
		}
	}

	public void chutes() {
		Selecao selecao = new Selecao();

		for (int i = 0; i < selecao.chutes.size(); i++) {
			chutes.add(selecao.chutes.get(i));
		}
	}

	public void questao1() {
		System.out.println("\n\nQuestão 1:");
		float soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0, soma5 = 0;
		for (Goleiro a : goleiros) {
			if (a.getSelecao() == 1) {
				soma1 += a.getQuantDefesa();
			}
			if (a.getSelecao() == 2) {
				soma2 += a.getQuantDefesa();
			}
			if (a.getSelecao() == 3) {
				soma3 += a.getQuantDefesa();
			}
			if (a.getSelecao() == 4) {
				soma4 += a.getQuantDefesa();
			}
			if (a.getSelecao() == 5) {
				soma5 += a.getQuantDefesa();
			}
		}
		float media1 = soma1 / 5;
		System.out.println("media de defesa selecao 1: " + media1);
		float media2 = soma2 / 5;
		System.out.println("media de defesa selecao 2: " + media2);
		float media3 = soma3 / 5;
		System.out.println("media de defesa selecao 3: " + media3);
		float media4 = soma4 / 5;
		System.out.println("media de defesa selecao 4: " + media4);
		float media5 = soma5 / 5;
		System.out.println("media de defesa selecao 5: " + media5);
	}

	public void questao2() {
		System.out.println("\n\nQuestão 2:");
		for (int i = 1; i <= 5; i++) {
			int maior = 0;
			String titular = "";
			for (Goleiro a : goleiros) {
				if (a.getSelecao() == i) {
					if (a.getQuantDefesa() > maior) {
						maior = a.getQuantDefesa();
						titular = a.getNome();
					}
				}
			}
			System.out.println("Goleiro titular da seleção " + i + " = " + titular);
		}
	}

	public void questao3() {
		System.out.println("\n\nQuestão 3:");
		for (Goleiro a : goleiros) {
			float media = ((float) a.getQuantGol() / 30);
			System.out.println("seleção - " + a.getSelecao() + " " + a.getNome() + ": " + media);
			media = 0;
		}
	}

	public void questao4() {
		System.out.println("\n\nQuestão 4:");
		int somaTraveSuperior = 0, somaTraveEsquerda = 0, somaTraveDireita = 0, somaChutesFora = 0;
		for (Goleiro a : goleiros) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					if (a.getTrave().celulas[i][j].isTraveSupeior() == true
							&& a.getTrave().celulas[i][j].getChute() > 0)
						somaTraveSuperior += a.getTrave().celulas[i][j].getChute();
					if (a.getTrave().celulas[i][j].isTraveEsquerda() == true
							&& a.getTrave().celulas[i][j].getChute() > 0)
						somaTraveEsquerda += a.getTrave().celulas[i][j].getChute();
					if (a.getTrave().celulas[i][j].isTraveDireita() == true
							&& a.getTrave().celulas[i][j].getChute() > 0)
						somaTraveDireita += a.getTrave().celulas[i][j].getChute();
					if (a.getTrave().celulas[i][j].isDentro() == false && a.getTrave().celulas[i][j].getChute() > 0)
						somaChutesFora = a.getTrave().celulas[i][j].getChute();
				}
			}
		}
		System.out.println("Quantidade de chutes na trave superior: " + somaTraveSuperior);
		System.out.println("Quantidade de chutes na trave esquerda: " + somaTraveEsquerda);
		System.out.println("Quantidade de chutes na trave direita: " + somaTraveDireita);
		System.out.println("Quantidade de chutes fora: " + somaTraveSuperior);
	}

	public void questao5() {
		System.out.println("\n\nQuestão 5:");
		int cont = 0;
		for (Goleiro a : goleiros) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					if (a.getTrave().celulas[i][j].isNoAngulo() == true && a.getTrave().celulas[i][j].getChute() > 0);
					cont += a.getTrave().celulas[i][j].getChute();
				}
			}
		}
		System.out.println("Quantidade de chutes no angulo: " + cont);
	}

	public void questao6() {
		System.out.println("\n\nQuestão 6:");
		int selecaoRecomendada = 0;
		int maior = 0;
		for (int i = 1; i <= 5; i++) {
			int soma = 0;
			for (Goleiro a : goleiros) {
				if (a.getSelecao() == i) {
					soma += a.getQuantDefesa();
				}
				if (soma > maior) {
					maior = soma;
					selecaoRecomendada = a.getSelecao();
				}
			}
		}
		System.out.println("Seleção recomendada: " + selecaoRecomendada);
	}

	public void questao8() {
		System.out.println("\n\nQuestão 8:");
		for (Goleiro a : goleiros) {
			System.out.println(a.getNome() + ", seleção: " + a.getSelecao() + ", gols defendidos: " + a.getQuantDefesa()
					+ ", gols tomados:  " + a.getQuantGol() + ", AAG " + a.getAAG());
		}
	}

	public void questao9() {
		System.out.println("\n\nQuestão 9:");
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o id do goleiro ");
		int id = scan.nextInt();

		int quadranteComMaisGols = 0;
		int maior = 0;
		int soma = 0;

		for (Goleiro a : goleiros) {
			if (a.getId() == id) {
				for (int quad = 1; quad <= 4; quad++) {
					soma = 0;
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 16; j++) {
							if (a.getTrave().celulas[i][j].getQuadrante() == quad) {
								soma += a.getTrave().celulas[i][j].getGol();
							}
						}
					}
					if (soma > maior) {
						maior = soma;
						quadranteComMaisGols = quad;
					}
				}

			}
		}
		System.out.println("Quadrante com mais gols: " + quadranteComMaisGols);
	}

	public void questao10() {
		System.out.println("\n\nQuestão 10:");
		for (Goleiro a : goleiros) {
			System.out.println(a.getNome());

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					if (a.getTrave().celulas[i][j].getChutesDefendidos() > 0)
						System.out.print(a.getTrave().celulas[i][j].getChutesDefendidos() + "x	");
					else if (a.getTrave().celulas[i][j].getGol() > 0)
						System.out.print(a.getTrave().celulas[i][j].getGol() + "*	");
					else
						System.out.print("#	");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}