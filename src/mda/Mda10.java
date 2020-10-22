package mda;

import java.util.Scanner;

public class Mda10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine();
		char[][] ar = new char[3][3];
		int k = 0;
		for(int i = 0; i <= ar.length-1; i++) {
			for (int j = 0; j <= ar[i].length -1; j++) {
				ar[i][j] = inp.charAt(k);
				k++;
			}
		}
		
/*		for(int i = 0; i <= ar.length-1; i++) { // for array
			for (int j = 0; j <= ar[i].length -1; j++) {

			}
		}*/
		
		/*for(int i = 0; i <= ar.length - 1;i++) {
			for (int j = 0; j <= ar[i].length-1; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}*/
	}
}
