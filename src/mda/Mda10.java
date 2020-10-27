package mda;

import java.util.Scanner;

public class Mda10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine();
		char[][] ar = new char[3][3];
		int k = 0;
		int x = 0;
		int o = 0;
		int wins = 0;
		int row1 = 0;
		int row2 =0;
		int horres = 0;
		int countx = 0;
		int counto = 0;
		int counte = 0;
		for(int i = 0; i <= ar.length-1; i++) {
			for (int j = 0; j <= ar[i].length -1; j++) {
				ar[i][j] = inp.charAt(k);
				k++;
			}
		}
		/*for(int i = 0; i <= ar.length-1; i++) { // for array
			for (int j = 0; j <= ar[i].length -1; j++) {
				if (ar[i][j] == 'X') {
					x++;
				} else if (ar[i][j] == 'O') {
					o++;
				}
			}
			if ( Math.abs(x - o) > 1) {
				System.out.println("Impossible");
				break;
			}
		}*/
		for(int i = 0; i <= ar.length-1; i++) { // for array
			for (int j = 0; j <= ar[i].length -1; j++) {
				if ( ar[i][j] == 'X') {
					countx += 'X';
				} else if (ar[i][j] == 'O') {
					counto += 'O';
				} else { counte++;}
			}
		}
		

		//horizontal
		for (int i = 0; i <= ar.length-1; i++) {
			int hor = ar[i][0] + ar[i][1] + ar[i][2];
			if (hor == 264) {
				horres = 1;
				wins++;
			}else if (hor == 237) {
				horres = 2;
				wins++;				
			}
		}
		//vertical
		for (int i = 0; i <= ar.length-1;i++) {
			int vert = ar[0][i] + ar[1][i] + ar[2][i];
			if (vert == 264) {
				horres = 1;
				wins++;
			}else if (vert == 237) {
				horres = 2;
				wins++;			
			}
		}
		//\
		for (int i = 0; i <=ar.length-1;i++) {
			row1 += ar[i][i];
		}
		for (int i = 0;i <= ar.length-1;i++) {
			row2 += ar [i][Math.abs(i - ar.length+1)];
		}
		
		
/*		for(int i = 0; i <= ar.length-1; i++) { // for array
			for (int j = 0; j <= ar[i].length -1; j++) {

			}
		}*/
		System.out.println("---------");
		for(int i = 0; i <= ar.length - 1;i++) {
			System.out.print("| ");
			for (int j = 0; j <= ar[i].length-1; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("---------");
		//System.out.println((countx/'X') + " " + (counto/'O'));
		//System.out.println("Wins = " + wins);
		if (((( Math.abs((countx/'X') - (counto)/'O'))) > 1) || (wins > 1)) {
			System.out.println("Impossible");
			} else if ((horres == 1) || (( row1 == 264) || (row2 == 264))) {
				System.out.print("X wins");
			} else if ((horres == 2) || ((row1 == 237) || (row2 == 237))) {
				System.out.print("O wins");				
			} else if (counte > 0) {
				System.out.print("Game not finished");
			} else {System.out.print("Draw");}
	}
}
