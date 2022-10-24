package Prova1;

import java.util.ArrayList;

public class Selecao {
	public ArrayList<Goleiro> goleiros;
	public ArrayList<Chute> chutes;

	public Selecao() {
		super();
		goleiros = new ArrayList<Goleiro>();
		chutes = new ArrayList<Chute>();
		goleiros();
		chutes();
	}

	public void goleiros() {
		Goleiro g1 = new Goleiro(1, 1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6);
		Goleiro g2 = new Goleiro(1, 2, "Uehudah Hack", 9, 6, 8, 8, 7, 10);
		Goleiro g3 = new Goleiro(1, 3, "Edison Drye", 5, 8, 5, 8, 10, 7);
		Goleiro g4 = new Goleiro(1, 4, "Ajani Harding", 6, 6, 5, 8, 7, 6);
		Goleiro g5 = new Goleiro(1, 5, "Orazio Hart", 5, 8, 7, 9, 9, 10);
		Goleiro g6 = new Goleiro(2, 6, "Tristan Karns", 9, 7, 10, 7, 7, 6);
		Goleiro g7 = new Goleiro(2, 7, "Niven Glaser", 10, 9, 7, 6, 5, 8);
		Goleiro g8 = new Goleiro(2, 8, "Derwyn Devers", 10, 7, 9, 5, 9, 5);
		Goleiro g9 = new Goleiro(2, 9, "Tod Phan", 10, 7, 7, 5, 5, 6);
		Goleiro g10 = new Goleiro(2, 10, "Eddie Hulse", 7, 6, 5, 9, 7, 5);
		Goleiro g11 = new Goleiro(3, 11, "Welford Yepez", 5, 8, 8, 7, 7, 8);
		Goleiro g12 = new Goleiro(3, 12, "Rishley Snyder", 6, 5, 6, 5, 7, 6);
		Goleiro g13 = new Goleiro(3, 13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9);
		Goleiro g14 = new Goleiro(3, 14, "Carden Justus", 8, 5, 8, 5, 10, 7);
		Goleiro g15 = new Goleiro(3, 15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6);
		Goleiro g16 = new Goleiro(4, 16, "Mungo Spangler", 8, 10, 9, 8, 9, 5);
		Goleiro g17 = new Goleiro(4, 17, "Whitmore Squires", 9, 10, 7, 9, 9, 10);
		Goleiro g18 = new Goleiro(4, 18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7);
		Goleiro g19 = new Goleiro(4, 19, "Ridgley Leo", 8, 8, 8, 9, 9, 9);
		Goleiro g20 = new Goleiro(4, 20, "Bolton Tarin", 9, 8, 7, 6, 9, 10);
		Goleiro g21 = new Goleiro(5, 21, "Edison Loy", 7, 7, 5, 10, 10, 7);
		Goleiro g22 = new Goleiro(5, 22, "Delling Herndon", 7, 5, 5, 8, 9, 9);
		Goleiro g23 = new Goleiro(5, 23, "Senichi Iorio", 7, 7, 5, 8, 10, 5);
		Goleiro g24 = new Goleiro(5, 24, "Albin Kerner", 6, 7, 8, 8, 9, 9);
		Goleiro g25 = new Goleiro(5, 25, "Jivin Justus", 9, 10, 8, 7, 7, 5);

		goleiros.add(g1);
		goleiros.add(g2);
		goleiros.add(g3);
		goleiros.add(g4);
		goleiros.add(g5);
		goleiros.add(g6);
		goleiros.add(g7);
		goleiros.add(g8);
		goleiros.add(g9);
		goleiros.add(g10);
		goleiros.add(g11);
		goleiros.add(g12);
		goleiros.add(g13);
		goleiros.add(g14);
		goleiros.add(g15);
		goleiros.add(g16);
		goleiros.add(g17);
		goleiros.add(g18);
		goleiros.add(g19);
		goleiros.add(g20);
		goleiros.add(g21);
		goleiros.add(g22);
		goleiros.add(g23);
		goleiros.add(g24);
		goleiros.add(g25);
	}

	public void chutes() {
		Chute c1 = new Chute(1, 2, 4, 7);
		Chute c2 = new Chute(2, 6, 3, 6);
		Chute c3 = new Chute(3, 9, 4, 15);
		Chute c4 = new Chute(4, 5, 6, 11);
		Chute c5 = new Chute(5, 3, 8, 13);
		Chute c6 = new Chute(6, 3, 6, 4);
		Chute c7 = new Chute(7, 4, 5, 8);
		Chute c8 = new Chute(8, 7, 7, 14);
		Chute c9 = new Chute(9, 8, 7, 14);
		Chute c10 = new Chute(10, 4, 6, 12);
		Chute c11 = new Chute(11, 2, 5, 15);
		Chute c12 = new Chute(12, 7, 6, 4);
		Chute c13 = new Chute(13, 3, 8, 2);
		Chute c14 = new Chute(14, 9, 7, 10);
		Chute c15 = new Chute(15, 10, 7, 12);
		Chute c16 = new Chute(16, 5, 4, 2);
		Chute c17 = new Chute(17, 3, 5, 13);
		Chute c18 = new Chute(18, 10, 4, 16);
		Chute c19 = new Chute(19, 10, 5, 16);
		Chute c20 = new Chute(20, 10, 3, 14);
		Chute c21 = new Chute(21, 9, 1, 8);
		Chute c22 = new Chute(22, 4, 8, 16);
		Chute c23 = new Chute(23, 8, 6, 14);
		Chute c24 = new Chute(24, 7, 7, 11);
		Chute c25 = new Chute(25, 6, 0, 3);
		Chute c26 = new Chute(26, 5, 6, 7);
		Chute c27 = new Chute(27, 3, 8, 4);
		Chute c28 = new Chute(28, 4, 6, 7);
		Chute c29 = new Chute(29, 10, 2, 13);
		Chute c30 = new Chute(30, 7, 5, 3);

		chutes.add(c1);
		chutes.add(c2);
		chutes.add(c3);
		chutes.add(c4);
		chutes.add(c5);
		chutes.add(c6);
		chutes.add(c7);
		chutes.add(c8);
		chutes.add(c9);
		chutes.add(c10);
		chutes.add(c11);
		chutes.add(c12);
		chutes.add(c13);
		chutes.add(c14);
		chutes.add(c15);
		chutes.add(c16);
		chutes.add(c17);
		chutes.add(c18);
		chutes.add(c19);
		chutes.add(c20);
		chutes.add(c21);
		chutes.add(c22);
		chutes.add(c23);
		chutes.add(c24);
		chutes.add(c25);
		chutes.add(c26);
		chutes.add(c27);
		chutes.add(c28);
		chutes.add(c29);
		chutes.add(c30);
	}
}
